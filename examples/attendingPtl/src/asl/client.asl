{ include("common.asl") }

organizationReady:- .count(play(_,seller,_), 5).

!start.

+!start <- 
	!createOrganization.

/* Setup Organization */	
+!createOrganization:
	.my_name(Me)
<-
	makeArtifact("grStore",
				 "ora4mas.nopl.GroupBoard",
				 ["src/org/orgTest.xml", "groupStore", false, true ],
				 GroupId
	);
	focus(GroupId);
	
	adoptRole(client)[artifact_id(GroupId)];
	
	!run_scheme("sch1", "grStore");
	!call_sellers_to_organization("sch1", "grStore", seller).
	
+!call_sellers_to_organization(Sch, Gr, Role) <-
	.send([bob,cla,toi,lau,joe], achieve, adoptRole(Sch, Gr, Role)).
		
/*
+!waitOrganizationReady:
	not .count(play(_,seller,_), 5)
<-
	.wait(100);
	!waitOrganizationReady.
+!waitOrganizationReady. */
	
+!run_scheme(S, Gr):
	true
<-
	makeArtifact(S,
				"ora4mas.nopl.SchemeBoard",
				["src/org/orgTest.xml", "contractNetScheme", false, true],
				SchArtId
	);
	focus(SchArtId);
	addScheme(S)[artifact_name(Gr)].

+!g9:
	organizationReady
<- 
	.print("Goal g9 is enabled!");
	//!waitOrganizationReady;
	!configureProtocol("p2", 
						"./src/protocols/attending.ptl", 
						"sch1", 
						"grStore");
	!startProtocol.
+!g9 <-
	.wait(100);
	!g9.
	
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
	joinScene("playerAttend1")[artifact_id(IdP2)];
	setOwner(Me)[artifact_id(IdP2)];
	setScheme(Sch);
	addArtifact("player2", "ballot1")[artifact_id(IdP2)];
	
	!call_sellers_to_scene(Scene, "playerAttend2");
	
	.print("The scene ", Scene, " is ready!").
//End Configuring Protocol
	
+!startProtocol <- 
	start.
-!startProtocol <-
	.wait(100);
	!startProtocol.

//requestSeller plans	
+!requestSeller[scene(Scene)]:
	.my_name(MyName) & obligation(MyName, nProtocol(Scene,Estado,Player), transition(CurrentState, GotoState, message(Performative), Target, requestSeller), _)
<-
	!requestSeller(Scene, Target, Performative, requestSeller).
+!requestSeller. //Already done
+!requestSeller(_, [], _, _).
+!requestSeller(Scene, [H|T], Performative, Message)
<-
	.print("Sending to ", H, " message ", Message);
	ia.xsend(H, Performative, Message, Scene);
	!requestSeller(Scene, T, Performative, Message).
