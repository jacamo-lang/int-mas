{ include("common.asl") }

!start.

/* Plans */

+!start <- 
	!createOrganization.
	
+!createOrganization:
	.my_name(Me)
<-
	makeArtifact("grStore","ora4mas.nopl.GroupBoard",["src/org/orgTest.xml", "groupStore", false, true ],GroupId);
	focus(GroupId);
	
	adoptRole(client)[artifact_id(GroupId)];
	
	!run_scheme("sch1", "grStore");
	!call_sellers_to_organization("sch1", "grStore", seller);
	.wait(1000).
	
+!call_sellers_to_organization(Sch, Gr, Role) <-
	.send([bob,cla,toi,lau,joe], achieve, adoptRole(Sch, Gr, Role)).
	
+!run_scheme(S, Gr):
	true
<-
	makeArtifact(S,"ora4mas.nopl.SchemeBoard",["src/org/orgTest.xml", "contractNetScheme", false, true ],SchArtId);
	focus(SchArtId);
	addScheme(S)[artifact_name(Gr)].
	
/* Contract-Net */
//Begin Configuring Protocol
+!setupProtocol(P,C,ProtocolFile) <- 
		makeArtifact(P, "int4mas.SceneArtifact", [ProtocolFile], C);
		+artifactProtocol(P,C).

-!setupProtocol(P,C,ProtocolFile) <-
		lookupArtifact(P, C).
		
+!call_sellers_to_scene(Scene, Player) <-
	.findall(Name,play(Name,seller,_),LP);
	.send(LP,achieve,joinScene(Scene, Player));
	.print("Called ", LP).

+!configureProtocol(Scene, ProtocolFile, Sch, Gr): 
	.my_name(Me) 
<-
	!setupProtocol(Scene,IdP2,ProtocolFile);
	focus(IdP2);
	addGroupBoard(Gr)[artifact_id(IdP2)];
	joinScene("player1")[artifact_id(IdP2)];
	!call_sellers_to_scene(Scene, "player2");
	setOwner(Me)[artifact_id(IdP2)];
	
	setScheme(Sch);
	.print("The scene ", Scene, " is ready!").
//End Configuring Protocol

+!g1
<- 
	.print("Goal g1 is enabled!");
	!configureProtocol("p2", "./src/protocols/contractNet.ptl", "sch1", "grStore");
	.wait(1000); //wait a bit until the protocol get ready
	+cnp_state(1,propose);
	start.

all_proposals_received(CNPId) :- 
	.count(play(_,seller,_),NP) &  // number of participants
	.count(propose(CNPId,_), NO) & // number of proposes received
	.count(refuse(CNPId), NR) &    // number of refusals received
	NP = NO + NR.

@lc1[atomic]
+!contract(CNPId)[scene(Scene), performative(Performative)]:  
	cnp_state(CNPId,propose)
<- 
	-+cnp_state(CNPId,contract);
	.findall(offer(O,A),propose(CNPId,O)[source(A)],L);
	.print("Offers are ",L);
	L \== []; // constraint the plan execution to at least one offer
	.min(L,offer(WOf,WAg)); // sort offers, the first is the best
	.print("Winner is ",WAg," with ",WOf);
	!announce_result(CNPId,L,WAg)[scene(Scene), performative(Performative)];
	-+cnp_state(CNPId,finished).

// nothing todo, the current phase is not 'propose'
@lc2 +!contract(_). 

-!contract(CNPId) <- 
	.print("CNP ",CNPId," has failed!").


+!announce_result(_,[],_).
+!announce_result(CNPId,[offer(_,WAg)|T],WAg)[scene(Scene), performative(Performative)] <- 
	ia.xsend(WAg,tell,accept_proposal(CNPId), Scene);
	!announce_result(CNPId,T,WAg)[scene(Scene), performative(Performative)].
+!announce_result(CNPId,[offer(_,LAg)|T],WAg)[scene(Scene), performative(Performative)] <- 
	ia.xsend(LAg,tell,reject_proposal(CNPId), Scene);
	!announce_result(CNPId,T,WAg)[scene(Scene), performative(Performative)].

//cfp plans
+!cfp(Id,Task)[scene(Scene)]:
	.my_name(MyName) & obligation(MyName, nProtocol(Scene,Estado,Player), transition(CurrentState, GotoState, message(Performative), Target, cfp(_,_)), _)
<-
	!cfp(Scene, Target, Performative, cfp(1,fix(computer))).
+!cfp(_,_). //Already done
+!cfp(_, [], _, _).
+!cfp(Scene, [H|T], Performative, Message)
<-
	.print("Sending to ", H, " message ", Message);
	ia.xsend(H, Performative, Message, Scene);
	!cfp(Scene, T, Performative, Message).
	
//cfpResult plans
+!cfpResult[scene(Scene)]:
	.my_name(MyName) & obligation(MyName, nProtocol(Scene,Estado,Player), transition(CurrentState, GotoState, message(Performative), Target, cfpResult), _)
	& cnp_state(CNPId,propose)
<-
	.print("CFP result ", CNPId);
	!contract(CNPId)[scene(Scene), performative(Performative)].
