{ include("common.asl") }

!start.

+!start <-
	!setupBallotBox(ballot1,C).

+!adoptRole(Sch, Gr, Role)
<-
	lookupArtifact(Sch, SchemeArt);
	focus(SchemeArt);
	lookupArtifact(Gr, OrgArt);
	adoptRole(Role) [artifact_id(OrgArt)];
	focus(OrgArt).
	
+!setupBallotBox(Name,C): true
	<- 
		makeArtifact(Name, "artifacts.BallotBox", [], C);
		focus(C);
		+ballotBox(Name, C).

-!setupBallotBox(Name,C): true
	<-
		lookupArtifact(Name, C);
		focus(C);
		+ballotBox(Name, C).

/* Contract-Net */
//Begin Configuring Protocol
+!joinScene(ArtScene, ArtPlayer) <-
	.print("Joined at ", ArtScene, " as ", ArtPlayer);
	lookupArtifact(ArtScene, IdP2);
	focus(IdP2);
	+artifactProtocol(ArtScene,IdP2);
	+imPlaying(ArtScene, ArtPlayer);
	joinScene(ArtPlayer)[artifact_id(IdP2)].
//End Configuring Protocol


get_vote(Agent) :- 
	.my_name(MyName) &
	.findall(Name,play(Name,seller,_) & MyName \== Name,Candidates) &
	.length(Candidates, Total) &
	.nth(math.random(Total), Candidates, Agent).

+!vote(X)[scene(Scene)]:
	.my_name(MyName) & obligation(MyName, nProtocol(Scene,Estado,Player), transition(CurrentState, GotoState, action, Target, vote(_)), _) &
	get_vote(AgentCandidate)
<-
	!vote(Scene, Target, vote(AgentCandidate)).
+!vote(_). //Already done
+!vote(_, [], _).
+!vote(Scene, [H|T], Action):
	ballotBox(H, Id)
<-
	.print("Sending to ", Id, " action ", Action);
	Action[artifact_id(Id), protocol_id(Scene)];
	!vote(Scene, T, Action).
	
+!requestSeller[source(Agent)] 
<-
	.print("Agent ", Agent, " wants some attending...").

+winner(AgentName):
	.my_name(AgentName)
<-
	.print("I have to attend the client!").
	
+winner(AgentName)
<-
	.print("Agent ", AgentName, " has to attend the client!").