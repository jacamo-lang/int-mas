package gui;

import java.util.HashSet;

import java.util.LinkedList;
import java.util.Set;

import cartago.ArtifactId;
import lib.ActionOccurrence;
import lib.CurrentState;
import lib.Entity;
import lib.EventOccurrence;
import lib.Goal;
import lib.MessageOccurrence;
import lib.Occurrence;
import lib.Participant;
import lib.Scene;
import lib.State;
import lib.Transition;
import int4mas.SceneArtifact;

public class ObserverScene implements Runnable, ProtocolEventListener {
	private SceneArtifact sceneArtifact;
	private InteractionGUI gui;
	private Thread thread;
	private boolean running = true;
	private boolean repaint = true;
	private boolean line;
	
	public ObserverScene(SceneArtifact sceneArtifact) {
		this.sceneArtifact = sceneArtifact;
		
		try {
			gui = InteractionGUI.add(sceneArtifact.getScene().getSceneId(), ":: Scene "+sceneArtifact.getScene().getSceneId()+"; Protocol "+sceneArtifact.getScene().getProtocol().getName()+" ::");
			gui.setProtocolSpecification(sceneArtifact.getScene().getProtocol().getSpecification());
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		thread = new Thread(this);
		thread.start();
	}
	
	public void setRepaint() {
		repaint = true;
	}
	
	public void run() {
		while (running) {
			try {
				if (repaint) {
					repaint = false;
					Thread.sleep(100);
					
					gui.updateScene(formatTitle1("Scene - " + sceneArtifact.getScene().getSceneId()) +
							     getInstanceOfBlock() + 
							     getDescriptionSpecificationBlock() +
								 getFormationBlock() +
								 getStatusBlock() +
								 getParticipantsBlock() +
								 getOwnerBlock() +
								 getGoalBlock() +
								 getGroupboardBlock() +
								 getWorkspaceBlock());
					
					gui.updateSceneMonitor(formatTitle1("Scene monitor - " + sceneArtifact.getScene().getSceneId()) +
										   getParticipantsSpecificationBlock() +
										   getStateBlock() +
										   getTransitionBlock());
					
				} else {
					Thread.sleep(1000);
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
    
	//FORMAT
	private String formatUnderlying(String text) {
		return "<FONT COLOR=\"#0000FF\"><U>" + text + "</U></FONT>";
	}

	private String formatTitle1(String text) {
		return "<H2><FONT FACE=\"Arial\" COLOR=\"#228B22\">"+text+"</FONT></H2><HR>";
	}
	
	private String formatTitle2(String text) {
		return "<H3 style=\"margin-bottom:0;\"><FONT FACE=\"Arial\">"+text+"</H3>";
	}
	
	private String formatItemCircle(String text) {
		return "<LI>" + text; 
	}
	
	private String formatItemEmpty(String text) {
		return "<DD>" + text; 
	}
	
	private String getInstanceOfBlock() {
		return "instance of protocol " + formatUnderlying(sceneArtifact.getScene().getProtocol().getName());
	}
	
	private String getParticipantsBlock() {
		StringBuffer buf = new StringBuffer();
		
		buf.append(formatTitle2("Participants"));
		buf.append("<UL>");
		
		for (Participant e : sceneArtifact.getScene().getProtocol().getParticipants().values()) {
			
			for (Entity p : sceneArtifact.getScene().getPlayers(e)) {
				
				buf.append(formatItemCircle(formatUnderlying(p.toString()) + " plays " + formatUnderlying(e.getId())));
				
			}
			
		}
		
		buf.append("</UL>");
		
		return buf.toString();
	}
	
	private String getParticipantsSpecificationBlock() {
		StringBuffer buf = new StringBuffer();
		
		buf.append(formatTitle2("Participants"));
		
		line = false;
		buf.append("<table "+getStyleTable()+">");
		buf.append("<tr "+getStyleTrTd()+"><td><B>Id</B></td><td><B>Kind</B></td><td><B>Role/Type</B></td><td><B>Min</B></td><td><B>Max</B></td><td><B>Players</B></td><td><B>Formation</B></td></tr>");
		for (Participant e : sceneArtifact.getScene().getProtocol().getParticipants().values()) {
			
			String max;
			if (e.getqMax() != null)
				max = e.getqMax();
			else
				max = String.valueOf(e.getMax());
			String min = String.valueOf(e.getMin());
			
			StringBuffer bufPlayers = new StringBuffer();
			bufPlayers.append("[");
			for (Entity p : sceneArtifact.getScene().getPlayers(e)) {
				if (bufPlayers.length() > 1)
					bufPlayers.append(", ");
				bufPlayers.append(p);
			}
			bufPlayers.append("]");
			String players = bufPlayers.toString();
			
			buf.append("<tr "+getStyleTrTd()+"><td>"+formatUnderlying(e.getId())+"</td><td>"+e.getKind()+"</td><td>"+e.getRoleOrType()+"</td><td>"+min+"</td><td>"+max+"</td><td>"+players+"</td><td>"+(sceneArtifact.getScene().isLastParticipantOk(e) ? "ok" : "not ok")+"</td></tr>");
		}

		buf.append("</table>");
		
		return buf.toString();
		
	}
	
	private String getDescriptionSpecificationBlock() {
		StringBuffer buf = new StringBuffer();
		
		buf.append(formatTitle2("Description"));
		buf.append("<DL>");
		
		buf.append(formatItemEmpty(sceneArtifact.getScene().getProtocol().getDescription()));
		
		buf.append("</DL>");
		
		return buf.toString();		
	}
	
	private String getFormationBlock() {
		StringBuffer buf = new StringBuffer();
		
		buf.append(formatTitle2("Formation"));
		buf.append("<DL>");
		
		if (sceneArtifact.getScene().isReadyToRunLast()) {
			buf.append(formatItemEmpty("ok"));
		} else {
			buf.append(formatItemEmpty("not ok"));
		}
		
		buf.append("</DL>");
		
		return buf.toString();
	}
	
	private String getOwnerBlock() {
		StringBuffer buf = new StringBuffer();
		
		buf.append(formatTitle2("Owner"));
		buf.append("<DL>");
		buf.append(formatItemEmpty(formatUnderlying(sceneArtifact.getOwner())));
		buf.append("</DL>");
		
		
		return buf.toString();
	}
	
	private String getGroupboardBlock() {
		StringBuffer buf = new StringBuffer();
		
		buf.append(formatTitle2("Groupboards"));
		buf.append("<DL>");
		
		StringBuffer bufG = new StringBuffer();
		for (ArtifactId e : sceneArtifact.getGroupboards()) {
			if (bufG.length() > 0) {
				bufG.append(", ");
			}
			bufG.append(e.getName());
		}
		buf.append(formatItemEmpty(bufG.toString()));
		buf.append("</DL>");
		
		return buf.toString();
	}
	
	private String getWorkspaceBlock() {
		StringBuffer buf = new StringBuffer();
		
		buf.append(formatTitle2("Workspaces"));
		buf.append("<DL>");
		
		StringBuffer bufW = new StringBuffer();
		for (String w : sceneArtifact.getWorkspaces()) {
			if (bufW.length() > 0) {
				bufW.append(", ");
			}
			bufW.append(w);
		}
		buf.append(formatItemEmpty(bufW.toString()));
		buf.append("</DL>");
		
		return buf.toString();
	}
	
	private String getGoalBlock() {
		StringBuffer buf = new StringBuffer();
		
		buf.append(formatTitle2("Responsible for achieving the goals"));
		buf.append("<DL>");
		
		StringBuffer bufG = new StringBuffer();
		for (Goal g : sceneArtifact.getScene().getProtocol().getAchieveGoals()) {
			if (bufG.length() > 0) {
				bufG.append(", ");
			}
			bufG.append(g);
		}
		buf.append(formatItemEmpty(sceneArtifact.getScheme() + ": " + bufG.toString()));
		buf.append("</DL>");
		
		return buf.toString();
	}
	
	private String getStatusBlock() {
		StringBuffer buf = new StringBuffer();
		
		buf.append(formatTitle2("State"));
		buf.append("<DL>");
		
		switch (sceneArtifact.getScene().getStatus()) {
			case Scene.FINISHED:
			case Scene.NOTIFIED_FINISHED:
				buf.append(formatItemEmpty("Finished"));
				break;
			case Scene.NOTSTARTED:
				buf.append(formatItemEmpty("Not started"));
				break;
			case Scene.RUNNING:
				buf.append(formatItemEmpty("Running"));
				break;
			case Scene.STOPPED:
				buf.append(formatItemEmpty("Stopped"));
				break;
			default:
				buf.append(formatItemEmpty("Other"));
		}
		buf.append("</DL>");
		
		return buf.toString();
	}
	
	private String getStyleTable() {
		return "style=\"border-width: 0px;border-spacing: 2px;border-style: none;border-color: white;border-collapse: separate;background-color: white;font-size: 9px;\"";
	}
	
	private String getStyleTrTd() {
		if (line) {
			line = false;
			return "style=\"border-width: 3px;padding: 1px;border-style: none;border-color: white;background-color: #E6E6FA;font-size: 9px;\"";
		}
		line = true;
		return "style=\"border-width: 3px;padding: 1px;border-style: none;border-color: white;background-color: #F5F5F5;font-size: 9px;\"";
	}
	
	private String getStateBlock() {
		StringBuffer buf = new StringBuffer();
		
		buf.append(formatTitle2("States"));
		
		line = false;
		buf.append("<table "+getStyleTable()+">");
		buf.append("<tr "+getStyleTrTd()+"><td><B>Id</B></td><td><B>Type</B></td><td><B>Timeout</B></td><td><B>State</B></td></tr>");
		
		CurrentState currentState = sceneArtifact.getScene().getCurrentState();
		State current = currentState.getCurrentState();
		State lastState = currentState.getPreviousState();
		
		LinkedList<State> list = new LinkedList<State>();
		for (State s : sceneArtifact.getScene().getProtocol().getStates().values()) {
			list.addFirst(s);
		}
		for (State s : list) {
			String type;
			if (s.isInitialState()) 
				type = "initial";
			else
				type = "";
			
			if (s.isFinalState()) {
				if (type.equals(""))
					type = "final";
				else
					type += ", final";
			}
			String timeout;
			if (s.getTimeout() != Long.MAX_VALUE) 
				timeout = String.valueOf(s.getTimeout()) + " ms";
			else
				timeout = "infinite";
			
			String isCurrent;
			if (lastState != null && s.getId().equals(lastState.getId())) {
				isCurrent = "before";
			} else {
				isCurrent = "";
			}
			
			if (s.getId().equals(current.getId())) {
				if (isCurrent.equals(""))
					isCurrent = "current";
				else
					isCurrent += ", current";
			}
			
			buf.append("<tr "+getStyleTrTd()+"><td>"+formatUnderlying(s.getId())+"</td><td>"+type+"</td><td>"+timeout+"</td><td>"+isCurrent+"</td></tr>");
		}
		buf.append("</table>");
		
		return buf.toString();
	}
	
	private String getTransitionBlock() {
		StringBuffer buf = new StringBuffer();
		
		buf.append(formatTitle2("Transitions"));
		
		line = false;
		buf.append("<table "+getStyleTable()+">");
		buf.append("<tr "+getStyleTrTd()+"><td><B>From</B></td><td><B>To</B></td><td><B>Source</B></td><td><B>Destination</B></td><td><B>Type</B></td><td><B>Trigger</B></td><td><B>State</B></td></tr>");
		
		CurrentState currentState = sceneArtifact.getScene().getCurrentState(); 
		State current = currentState.getCurrentState();
		Transition lastFired = currentState.getFiredTransition();
		
		LinkedList<State> list = new LinkedList<State>();
		for (State s : sceneArtifact.getScene().getProtocol().getStates().values()) {
			list.addFirst(s);
		}		
		for (State s : list) {
			for (Transition t : s.getTransitions()) {
				String state;
				if (lastFired != null && lastFired.equals(t))
					state = "last fired";
				else
					state = "";
				
				StringBuffer bufNotifiedSource = new StringBuffer();
				bufNotifiedSource.append("[");
				StringBuffer bufNotifiedDestination = new StringBuffer();
				bufNotifiedDestination.append("[");
				if (current.getId().equals(s.getId())) {
					if (state.equals(""))
						state = "enabled";
					else
						state += ", enabled";
					
					Set<Entity> notifiedSources = new HashSet<Entity>();
					Set<Entity> notifiedDestinations = new HashSet<Entity>();
					if (currentState.getOccurrencesTransition(t) != null) {
						for (Occurrence occurrence : currentState.getOccurrencesTransition(t)) {
							if (t.getType() == Transition.ACTION) {
								notifiedSources.add(((ActionOccurrence)occurrence).getAgentId());
								notifiedDestinations.add(((ActionOccurrence)occurrence).getArtifactId());				
							} else if (t.getType() == Transition.MESSAGE) {
								notifiedSources.add(((MessageOccurrence)occurrence).getSourceId());
								notifiedDestinations.add(((MessageOccurrence)occurrence).getDestinationId());				
							} else {
								notifiedSources.add(((EventOccurrence)occurrence).getArtifactId());
								notifiedDestinations.add(((EventOccurrence)occurrence).getDestinationId());
							}
						}
						
						for (Entity player : notifiedSources) {
							if (bufNotifiedSource.length() > 1)
								bufNotifiedSource.append(", ");
							bufNotifiedSource.append(player);
						}
						for (Entity player : notifiedDestinations) {
							if (bufNotifiedDestination.length() > 1)
								bufNotifiedDestination.append(", ");
							bufNotifiedDestination.append(player);
						}
					}
				}
				bufNotifiedSource.append("]");
				bufNotifiedDestination.append("]");
				
				String from = formatUnderlying(t.getCurrentState().getId());
				String to = formatUnderlying(t.getNextState().getId());
				
				StringBuffer bufSource = new StringBuffer();
				bufSource.append("[");
				for (Entity p : sceneArtifact.getScene().getPlayers(t.getSource())) {
					if (bufSource.length() > 1)
						bufSource.append(", ");
					bufSource.append(p);
				}
				bufSource.append("]");
				String source = t.getSource().getId() + ":" + bufSource.toString();
				
				StringBuffer bufDestination = new StringBuffer();
				bufDestination.append("[");
				for (Entity p : sceneArtifact.getScene().getPlayers(t.getDestination())) {
					if (bufDestination.length() > 1)
						bufDestination.append(", ");
					bufDestination.append(p);					
				}
				bufDestination.append("]");
				String destination = t.getDestination().getId() + ":" + bufDestination.toString();
				
				String type;
				if (t.getType() == Transition.ACTION) {
					type = "action";
				} else if (t.getType() == Transition.EVENT) {
					type = "event";
				} else {
					type = "message";
				}
				String duty = t.getDuty();
				
				buf.append("<tr "+getStyleTrTd()+"><td>"+from+"</td><td>"+to+"</td><td>"+source+"/"+bufNotifiedSource.toString()+"</td><td>"+destination+"/"+bufNotifiedDestination.toString()+"</td><td>"+type+"</td><td>"+duty+"</td><td>"+state+"</td></tr>");
			}
		}
		buf.append("</table>");
		
		return buf.toString();
	}
	
	public void notifyProtocoloStarted() {
		gui.addLog("started   \n");
	}
	
	public void notifyProtocoloStopped() {
		gui.addLog("stopped   \n");
	}
	
	public void notifyProtocoloFinished() {
		gui.addLog("finished  \n");
	}
	
	public void notifyProtocoloRunning() {
		gui.addLog("running   \n");
	}
	
	public void notifyTransitionFired(String textTransition) {
		gui.addLog("fired:    "+textTransition+"\n");
	}
	
	public void notifyStateAchieved(State s) {
		gui.addLog("achieved: "+s.getId()+"\n");
	}
}
