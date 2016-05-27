{ include("common.asl") }

machineXagent(bob,machine1).
machineXagent(cla,machine2).
machineXagent(toi,machine3).
machineXagent(joe,machine4).
machineXagent(lau,machine4).

!start.

/* Plans */
+!start:
	.my_name(bob)
<- 
	!loadAllMachines;
	!createOrganization.
+!start
<- 
	!loadAllMachines.
	
+!createOrganization:
	.my_name(Me)
<-
	makeArtifact("grStore","ora4mas.nopl.GroupBoard",["src/org/orgTest.xml", "groupStore", false, true ],GroupId);
	focus(GroupId);
	
	adoptRole(operator)[artifact_id(GroupId)];
	
	!run_scheme("sch1", "grStore");
	!call_operators_to_organization("sch1", "grStore", operator);
	.wait(1000).
	
+!call_operators_to_organization(Sch, Gr, Role) <-
	.send([cla,toi,lau,joe], achieve, adoptRole(Sch, Gr, Role)).
	
+!run_scheme(S, Gr):
	true
<-
	makeArtifact(S,"ora4mas.nopl.SchemeBoard",["src/org/orgTest.xml", "contractNetScheme", false, true ],SchArtId);
	focus(SchArtId);
	addScheme(S)[artifact_name(Gr)].

//Begin Configuring Environment
+!setupMachine(Name,C): true
	<- 
		makeArtifact(Name, "artifacts.Machine", [], C);
		focus(C);
		.term2string(TermName, Name);
		+machine(TermName, C);
		.print("Machine ", Name, " ok!").

-!setupMachine(Name,C): true
	<-
		lookupArtifact(Name, C);
		focus(C);
		.term2string(TermName, Name);
		+machine(TermName, C);
		.print("Machine ", Name, " ok!").
		
+!loadAllMachines <-
	!setupMachine("machine1",_);
	!setupMachine("machine2",_);
	!setupMachine("machine3",_);
	!setupMachine("machine4",_).
//End Configuring Environment

/* Contract-Net */
//Begin Configuring Protocol
+!setupProtocol(P,C,ProtocolFile) <- 
		makeArtifact(P, "int4mas.SceneArtifact", [ProtocolFile], C);
		+artifactProtocol(P,C).

-!setupProtocol(P,C,ProtocolFile) <-
		lookupArtifact(P, C).
		
+!call_operators_to_scene(Scene, Player):
	.my_name(MyName)
<-
	.findall(Name,play(Name,operator,_) & Name \== MyName,LP);
	.send(LP,achieve,joinScene(Scene, Player));
	.print("Called ", LP).

+!configureProtocol(Scene, ProtocolFile, Sch, Gr): 
	.my_name(Me) 
<-
	!setupProtocol(Scene,IdP2,ProtocolFile);
	focus(IdP2);
	addGroupBoard(Gr)[artifact_id(IdP2)];
	joinScene("player1")[artifact_id(IdP2)];
	setOwner(Me)[artifact_id(IdP2)];
	setScheme(Sch);
	addWorkspace("default");
	addArtifact("player2", "machine1")[artifact_id(IdP2)];
	addArtifact("player2", "machine2")[artifact_id(IdP2)];
	addArtifact("player2", "machine3")[artifact_id(IdP2)];
	addArtifact("player2", "machine4")[artifact_id(IdP2)];
	
	!call_operators_to_scene(Scene, "player1");
	
	.print("The scene ", Scene, " is ready!").
	
+!joinScene(ArtScene, ArtPlayer) <-
	.print("Joined at ", ArtScene, " as ", ArtPlayer);
	lookupArtifact(ArtScene, IdP2);
	focus(IdP2);
	+artifactProtocol(ArtScene,IdP2);
	+imPlaying(ArtScene, ArtPlayer);
	joinScene(ArtPlayer)[artifact_id(IdP2)].
//End Configuring Protocol

+!g9:
	.my_name(bob)
<- 
	.print("Goal g9 is enabled!");
	!configureProtocol("p2", "./src/protocols/operatorProtocol.ptl", "sch1", "grStore");
	.wait(3000); //wait a bit until the protocol get ready
	start.
+!g9.

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

//turnOn plans
+!turnOn[scene(Scene)]:
	.my_name(MyName) & obligation(MyName, nProtocol(Scene,Estado,Player), transition(CurrentState, GotoState, action, Target, turnOn), _)
<-
	!turnOn(Scene, Target, turnOn).
+!turnOn. //Already done
+!turnOn(_, [], _).
+!turnOn(Scene, [H|T], Action):
	machine(H, Id) & .my_name(MyName) & machineXagent(MyName,H)
<-
	.print("Sending to ", Id, " action ", Action);
	Action[artifact_id(Id), protocol_id(Scene)];
	!turnOn(Scene, T, Action).
+!turnOn(Scene, [H|T], Action):
	machine(H, Id)
<-
	.print("Not sending to ", Id, " action ", Action);
	!turnOn(Scene, T, Action).	

//produce plans
get_amount(Amount) :- 
	Amount = math.random(100) &
	.print("Teste: ", Amount).
+!produce(X)[scene(Scene)]:
	.my_name(MyName) & obligation(MyName, nProtocol(Scene,Estado,Player), transition(CurrentState, GotoState, action, Target, produce(_)), _)
	& get_amount(Amount)
<-
	!produce(Scene, Target, produce(2)).
+!produce(X). //Already done
+!produce(_, [], _).
+!produce(Scene, [H|T], Action):
	machine(H, Id) & .my_name(MyName) & machineXagent(MyName,H)
<-
	.print("Sending to ", Id, " action ", Action);
	Action[artifact_id(Id), protocol_id(Scene)];
	!produce(Scene, T, Action).
+!produce(Scene, [H|T], Action):
	machine(H, Id)
<-
	!produce(Scene, T, Action).
	
//turnOff plans
+!turnOff[scene(Scene)]:
	.my_name(MyName) & obligation(MyName, nProtocol(Scene,Estado,Player), transition(CurrentState, GotoState, action, Target, turnOff), _)
<-
	!turnOff(Scene, Target, turnOff).
+!turnOff. //Already done
+!turnOff(_, [], _).
+!turnOff(Scene, [H|T], Action):
	machine(H, Id) & .my_name(MyName) & machineXagent(MyName,H)
<-
	.print("Sending to ", Id, " action ", Action);
	Action[artifact_id(Id), protocol_id(Scene)];
	!turnOff(Scene, T, Action).
+!turnOff(Scene, [H|T], Action):
	machine(H, Id)
<-
	!turnOff(Scene, T, Action).
	