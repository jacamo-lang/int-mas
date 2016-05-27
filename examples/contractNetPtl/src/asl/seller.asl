{ include("common.asl") }


+!adoptRole(Sch, Gr, Role)
<-
	lookupArtifact(Sch, SchemeArt);
	focus(SchemeArt);
	lookupArtifact(Gr, OrgArt);
	adoptRole(Role) [artifact_id(OrgArt)];
	focus(OrgArt).

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

price(_,X) :- .random(R) & X = (10*R)+100.
canOffer :- .random(R) & R >= 0.4.

//cfpProposal plans
+!cfpProposal[scene(Scene)]:
	.my_name(MyName) & obligation(MyName, nProtocol(Scene,Estado,Player), transition(CurrentState, GotoState, message(Performative), [Target|[]], cfpProposal), _)
	& cfp(CNPId,Task)[source(Target)] & price(Task,Offer) & canOffer
<-
	.print("Offering ", propose(CNPId,Offer));
	-cfp(CNPId,Task)[source(Target)];
	!cfpProposal(Scene, [Target], Performative, propose(CNPId,Offer));
	+proposal(CNPId,Task,Offer).
+!cfpProposal[scene(Scene)]:
	.my_name(MyName) & obligation(MyName, nProtocol(Scene,Estado,Player), transition(CurrentState, GotoState, message(Performative), [Target|[]], cfpProposal), _)
	& cfp(CNPId,Task)[source(Target)] & imPlaying(Scene, ArtPlayer)
<-
	.print("Refusing...");
	-cfp(CNPId,Task)[source(Target)];
	leaveScene(ArtPlayer)[artifact_id(IdP2)];
	!cfpProposal(Scene, [Target], Performative, refuse(CNPId)).
+!cfpProposal. //Already done
+!cfpProposal(_, [], _, _).
+!cfpProposal(Scene, [H|T], Performative, Message)
<-
	ia.xsend(H, Performative, Message, Scene);
	!cfpProposal(Scene, T, Performative, Message).

+accept_proposal(CNPId): 
	proposal(CNPId,Task,Offer)
<- 
	.print("My proposal '",Offer,"' won CNP ",CNPId," for ",Task,"!").
      
+reject_proposal(CNPId)
<- 
	.print("I lost CNP ",CNPId, ".");
    -proposal(CNPId,_,_).
