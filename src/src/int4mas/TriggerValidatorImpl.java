package int4mas;

import jason.JasonException;
import jason.RevisionFailedException;
import jason.asSemantics.Agent;
import jason.asSemantics.Unifier;
import jason.asSyntax.Atom;
import jason.asSyntax.ListTerm;
import jason.asSyntax.ListTermImpl;
import jason.asSyntax.Literal;
import jason.asSyntax.LogExpr;
import jason.asSyntax.LogicalFormula;
import jason.asSyntax.Plan;
import jason.asSyntax.PlanLibrary;
import jason.asSyntax.Rule;
import jason.asSyntax.Term;
import jason.asSyntax.UnnamedVar;
import jason.asSyntax.VarTerm;
import jason.bb.BeliefBase;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

import ora4mas.nopl.oe.Player;

import lib.Participant;
import lib.TriggerValidator;

public class TriggerValidatorImpl implements TriggerValidator {
	private Agent ag = new Agent();
	private SceneArtifact scene;
	
	public TriggerValidatorImpl(SceneArtifact scene) {
		this.scene = scene;
		ag.initAg();
	}
	
	public boolean validateAgent(String role, String agentId) {
		for (Map.Entry<String, Collection<Player>> rolesGroup : scene.getRoles().entrySet()) {
			//String groupBoard = rolesGroup.getKey();
			Collection<Player> roleGroupBoard = rolesGroup.getValue();
			
			for (Player p : roleGroupBoard) {
				if (p.getAg().equals(agentId) && p.getTarget().equals(role)) {
					return true;
				}
			}
		}		
		return false;
	}

	public boolean validateArtifact(String artifactType, String artifactId) {
		return scene.validateArtifact(artifactType, artifactId);
	}

	public boolean validateContent(String validationContent, String content) {
		if (validationContent.equals("") || validationContent.equals(content)) {
			return true;
		}
		
		boolean result = false;
		BeliefBase bb = ag.getBB();
		PlanLibrary pl = ag.getPL();
		if (content.charAt(0) == '[') {
			ListTerm list = ListTermImpl.parseList(content);
			
			for (Object t : list.toArray()) {
				String strItem = t.toString();
				if (t instanceof Plan) {
					try {
						pl.add((Plan)t);
					} catch (JasonException e) {
						e.printStackTrace();
					}
				} else {
					Literal lContent = Literal.parseLiteral(strItem);
					bb.add(lContent);
				}
			}
		} else {
			Literal lContent = Literal.parseLiteral(content);
			
			bb.add(lContent);	
		}
		
		if (validationContent.charAt(0) == '+' || validationContent.charAt(0) == '-' || validationContent.charAt(0) == '^' || validationContent.charAt(0) == '{') {
			result = pl.hasCandidatePlan(jason.asSyntax.Trigger.parseTrigger(formatTrigger(validationContent)));
		} else {
			Atom atomtestInteraction = new Atom("testInteraction");
			LogicalFormula condition = LogExpr.parseExpr(validationContent);
			Rule r = new Rule(Literal.parseLiteral("testInteraction"), condition);
			
	        Literal lTestInteraction;
	        if (r.getBody().equals(Literal.LTrue) && r.isGround())
	        	lTestInteraction = r.headClone();
	        else
	        	lTestInteraction = r.clone();
	        lTestInteraction.addSource(atomtestInteraction);
			bb.add(lTestInteraction);
			
			Iterator<Unifier> i = condition.logicalConsequence(ag, new Unifier());
	        while (i.hasNext()) {
	            Unifier u = i.next();
	            Literal testFire = lTestInteraction.copy();
	            testFire.apply(u);
	            
	            if (testFire.getFunctor().equals("testInteraction")) {
	            	result = true;
	            	break;
	            }
	        }
		}
		
    	try {
			ag.abolish(new UnnamedVar(), new Unifier());
			pl.clear();
		} catch (RevisionFailedException e) {
			e.printStackTrace();
		}
		return result;
	}

	public boolean validatePattern(String validationPattern, String pattern) {
		if (validationPattern.equals("") || validationPattern.equals(pattern)) {
			return true;
		}

		Unifier un = new Unifier();
		boolean result = false;
		
		if (validationPattern.charAt(0) == '+' || validationPattern.charAt(0) == '-' || validationPattern.charAt(0) == '^' || validationPattern.charAt(0) == '{') {
			jason.asSyntax.Trigger tvalidationPattern = jason.asSyntax.Trigger.parseTrigger(formatTrigger(validationPattern));
			jason.asSyntax.Trigger tpattern = jason.asSyntax.Trigger.parseTrigger(formatTrigger(pattern));
			
			try {
				result = un.unifiesNoUndo(tvalidationPattern, tpattern);
			} catch(Exception e) {}			
		} else { 
			Term lvalidationPattern; 
			Term lpattern; 
			if (validationPattern.charAt(0) == '[')
				lvalidationPattern = ListTermImpl.parseList(validationPattern);
			else
				lvalidationPattern = Literal.parseLiteral(validationPattern);
			
			if (pattern.charAt(0) == '[') 
				lpattern = ListTermImpl.parseList(pattern);
			else
				lpattern = Literal.parseLiteral(pattern);
	
			
			try {
				result = un.unifiesNoUndo(lvalidationPattern, lpattern);
			} catch(Exception e) {}
		}
		
		
		/*
		if (result) {
			System.out.println("VALIDOU: " + validationPattern + " e " + pattern);
		} else {
			System.out.println("NAO VALIDOU: " + validationPattern + " e " + pattern);
		}*/
		
		return result;
	}

	public boolean validateTrigger(String validationPattern,
			String validationContent, String content) {
		
		//return validatePattern(validationPattern, content) && validateContent(validationContent, content);
		
		if ((validationPattern.equals("") || validationPattern.equals(content))) {
			return true;
		}
		
		//Structure str = Structure.parse(validationPattern);
		Term lvalidationPattern = VarTerm.parse(validationPattern);
		Term lpattern = VarTerm.parse(content);
		
		Unifier un = new Unifier();
		
		if (un.unifiesNoUndo(lvalidationPattern, lpattern)) {
			if (validationContent.equals("") || validationContent.equals(content))
				return true;
			LogicalFormula condition = LogExpr.parseExpr(validationContent);
			return condition.logicalConsequence(ag, un).hasNext();
		}
		
		return false;
	}

	public boolean validateAllCardinality(Participant entity) {
		if (entity.getKind().equals("artifact")) {
			return validateAllArtifact(entity);
		} else {
			return validateAllAgent(entity);
		}
	}
	
	private boolean validateAllArtifact(Participant entity) {
		return scene.getAllArtifactsByType(entity.getRoleOrType()).size() == scene.getScene().getPlayers(entity).size();
	}
	
	private boolean validateAllAgent(Participant entity) {
		String role = entity.getRoleOrType();
		int totalPlayersRole = 0;
		
		for (Map.Entry<String, Collection<Player>> rolesGroup : scene.getRoles().entrySet()) {
			//String groupBoard = rolesGroup.getKey();
			Collection<Player> roleGroupBoard = rolesGroup.getValue();
			
			for (Player p : roleGroupBoard) {
				if (p.getTarget().equals(role)) {
					totalPlayersRole++;
				}
			}
		}		
		return scene.getScene().getPlayers(entity).size() == totalPlayersRole;
	}
	
	private String formatTrigger(String text) {
		if (text.charAt(0) == '{')
			return text.substring(1, text.length()-1);
		return text;
	}
}
