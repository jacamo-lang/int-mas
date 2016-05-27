{ include("common.asl") }

!start.

/* Plans */
+!start:
	salesSystemName(SalesSystemName) & eptName(EptName)
<- 
	!setupSalesSystem(SalesSystemName,_);
	!setupEPT(EptName,_);
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
	.send([bob], achieve, adoptRole(Sch, Gr, Role)).
	
+!run_scheme(S, Gr):
	true
<-
	makeArtifact(S,"ora4mas.nopl.SchemeBoard",["src/org/orgTest.xml", "contractNetScheme", false, true ],SchArtId);
	focus(SchArtId);
	addScheme(S)[artifact_name(Gr)].
	
//Begin Configuring Environment
+!setupSalesSystem(Name,C): true
	<- 
		lookupArtifact(Name, C);
		focus(C);
		+salesSystem(Name, C).

-!setupSalesSystem(Name,C): true
	<-
		.wait(100);
		!setupSalesSystem(Name,C).
		
+!setupEPT(Name,C): true
	<- 
		lookupArtifact(Name, C);
		focus(C);
		+ept(Name, C).

-!setupEPT(Name,C): true
	<-
		.wait(100);
		!setupEPT(Name,C).
//End Configuring Environment
	
	
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
	.my_name(Me) & salesSystemName(SalesSystemName) & eptName(EptName)
<-
	!setupProtocol(Scene,IdP2,ProtocolFile);
	focus(IdP2);
	addGroupBoard(Gr)[artifact_id(IdP2)];
	joinScene("agClient")[artifact_id(IdP2)];
	setOwner(Me)[artifact_id(IdP2)];
	setScheme(Sch)[artifact_id(IdP2)];
	addArtifact("groupBoard", "grStore")[artifact_id(IdP2)];
	addArtifact("salesSystem", SalesSystemName)[artifact_id(IdP2)];
	addArtifact("ept", EptName)[artifact_id(IdP2)];
	!call_sellers_to_scene(Scene, "agSeller");
	
	.print("The scene ", Scene, " is ready!").
//End Configuring Protocol

+!g9
<- 
	.print("Goal g9 is enabled!");
	!configureProtocol("p2", "./src/protocols/shopping.ptl", "sch1", "grStore");
	.wait(1000); //wait a bit until the protocol get ready
	start;
	.print("wait more!").
	
//price plans	
+!price(X,P)[scene(Scene)]:
	.my_name(MyName) & obligation(MyName, nProtocol(Scene,Estado,Player), transition(CurrentState, GotoState, message(Performative), Target, price(_,_)), _)
<-
	!price(Scene, Target, Performative, price(bread,ValuePrice)).
+!price(_,_). //Already done
+!price(_, [], _, _).
+!price(Scene, [H|T], Performative, Message)
<-
	.print("Sending to ", H, " message ", Message);
	ia.xsend(H, Performative, Message, Scene);
	!price(Scene, T, Performative, Message).
	
//buy plans
+!buy(X,A)[scene(Scene)]:
	.my_name(MyName) & obligation(MyName, nProtocol(Scene,Estado,Player), transition(CurrentState, GotoState, message(Performative), Target, buy(_,_)), _)
<-
	!buy(Scene, Target, Performative, buy(bread,3)).
+!buy(_,_). //Already done
+!buy(_, [], _, _).
+!buy(Scene, [H|T], Performative, Message)
<-
	.print("Sending to ", H, " message ", Message);
	ia.xsend(H, Performative, Message, Scene);
	!buy(Scene, T, Performative, Message).
	
//pay plans
+!pay(W)[scene(Scene)]:
	.my_name(MyName) & obligation(MyName, nProtocol(Scene,Estado,Player), transition(CurrentState, GotoState, message(Performative), Target, pay(_)), _)
<-
	!pay(Scene, Target, Performative, pay(card)).
+!pay(_). //Already done
+!pay(_, [], _, _).
+!pay(Scene, [H|T], Performative, Message)
<-
	.print("Sending to ", H, " message ", Message);
	ia.xsend(H, Performative, Message, Scene);
	!pay(Scene, T, Performative, Message).
	
//password plans
+!password(PWD)[scene(Scene)]:
	.my_name(MyName) & obligation(MyName, nProtocol(Scene,Estado,Player), transition(CurrentState, GotoState, action, Target, password(_)), _)
<-
	
	!password(Scene, Target, password("xpto12")).
+!password(_). //Already done
+!password(_, [], _).
+!password(Scene, [H|T], Action):
	ept(H, Id)
<-
	.print("Sending to ", Id, " action ", Action);
	Action[artifact_id(Id), protocol_id(Scene)];
	!password(Scene, T, Action).