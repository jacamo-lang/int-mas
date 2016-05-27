{ include("common.asl") }

!start.

+!start:
	salesSystemName(SalesSystemName) & eptName(EptName)
<-
	!setupSalesSystem(SalesSystemName,_);
	!setupEPT(EptName,_).
	//!doSale.

+!adoptRole(Sch, Gr, Role):
	not .list(Gr)
<-
	lookupArtifact(Sch, SchemeArt);
	focus(SchemeArt);
	lookupArtifact(Gr, OrgArt);
	adoptRole(Role) [artifact_id(OrgArt)];
	.term2string(GrTerm, Gr);
	+groupBoardArtifact(GrTerm, OrgArt);
	focus(OrgArt).

//Begin Configuring Environment	
+!setupSalesSystem(Name,C): true
	<- 
		makeArtifact(Name, "artifacts.SalesSystem", [], C);
		focus(C);
		+salesSystem(Name, C).

-!setupSalesSystem(Name,C): true
	<-
		lookupArtifact(Name, C);
		focus(C);
		+salesSystem(Name, C).
		
+!setupEPT(Name,C): true
	<- 
		makeArtifact(Name, "artifacts.EPT", [], C);
		focus(C);
		+ept(Name, C).

-!setupEPT(Name,C): true
	<-
		lookupArtifact(Name, C);
		focus(C);
		+ept(Name, C).
//End Configuring Environment

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


+!doSale:
	salesSystemName(SalesSystemName) & salesSystem(SalesSystemName, Id)
<-
	newSale(bread, 5.1, 2)[artifact_id(Id)];
	setClient(bob)[artifact_id(Id)];
	setPaymentForm(card)[artifact_id(Id)];
	finishSale[artifact_id(Id)];
	.print("fim!").
+askPassword <- .print("Recebi askPassword").
+total(T) <- .print("Current total is ", T).

//price plans
+!price(Product, Price).
+?price(Product, Price): stock(Product, Price, _).

//adoptRole plans
+!adoptRole(Role)[scene(Scene)]:
	.my_name(MyName) & obligation(MyName, nProtocol(Scene,Estado,Player), transition(CurrentState, GotoState, action, Target, adoptRole(_)), _)
<-
	!adoptRole(Scene, Target, adoptRole(Role)).
+!adoptRole(_). //Already done
+!adoptRole(_, [], _).
+!adoptRole(Scene, [H|T], Action):
	groupBoardArtifact(H, Id)
<-
	.print("Sending to ", Id, " action ", Action);
	Action[artifact_id(Id), protocol_id(Scene)];
	!adoptRole(Scene, T, Action).
	
//newSale plans
+!newSale(X,P,A)[scene(Scene)]:
	not .list(P) &
	.my_name(MyName) & obligation(MyName,nProtocol(Scene,Estado,Player), transition(CurrentState, GotoState, action, Target, newSale(_,_,_)), _)
	& buy(Product,Amount) & stock(Product, Price, _)
<-
	!newSale(Scene, Target, newSale(Product,Price,Amount)).
+!newSale(_,P,_): not .list(P). //Already done
+!newSale(_, [], _).
+!newSale(Scene, [H|T], Action):
	salesSystem(H, Id)
<-
	.print("Sending to ", Id, " action ", Action);
	Action[artifact_id(Id), protocol_id(Scene)];
	!newSale(Scene, T, Action).	
	
//setClient plans
+!setClient(C)[scene(Scene)]:
	.my_name(MyName) & obligation(MyName, nProtocol(Scene,Estado,Player), transition(CurrentState, GotoState, action, Target, setClient(_)), _)
	& pay(W)[source(AgentName)] 
<-
	
	!setClient(Scene, Target, setClient(AgentName)).
+!setClient(_). //Already done
+!setClient(_, [], _).
+!setClient(Scene, [H|T], Action):
	salesSystem(H, Id)
<-
	.print("Sending to ", Id, " action ", Action);
	Action[artifact_id(Id), protocol_id(Scene)];
	!setClient(Scene, T, Action).
	
//paymentForm plans
+!paymentForm(C)[scene(Scene)]:
	.my_name(MyName) & obligation(MyName, nProtocol(Scene,Estado,Player), transition(CurrentState, GotoState, action, Target, paymentForm(_)), _)
	& pay(W) 
<-
	
	!paymentForm(Scene, Target, paymentForm(W)).
+!paymentForm(_). //Already done
+!paymentForm(_, [], _).
+!paymentForm(Scene, [H|T], Action):
	salesSystem(H, Id)
<-
	.print("Sending to ", Id, " action ", Action);
	Action[artifact_id(Id), protocol_id(Scene)];
	!paymentForm(Scene, T, Action).
	
//finishSale plans
+!finishSale[scene(Scene)]:
	.my_name(MyName) & obligation(MyName, nProtocol(Scene,Estado,Player), transition(CurrentState, GotoState, action, Target, finishSale), _)
<-
	
	!finishSale(Scene, Target, finishSale).
+!finishSale. //Already done
+!finishSale(_, [], _).
+!finishSale(Scene, [H|T], Action):
	salesSystem(H, Id)
<-
	.print("Sending to ", Id, " action ", Action);
	Action[artifact_id(Id), protocol_id(Scene)];
	!finishSale(Scene, T, Action).
	
//pay plans
+!bye[scene(Scene)]:
	.my_name(MyName) & obligation(MyName, nProtocol(Scene,Estado,Player), transition(CurrentState, GotoState, message(Performative), Target, bye), _)
<-
	!bye(Scene, Target, Performative, bye).
+!bye(_). //Already done
+!bye(_, [], _, _).
+!bye(Scene, [H|T], Performative, Message)
<-
	.print("Sending to ", H, " message ", Message);
	ia.xsend(H, Performative, Message, Scene);
	!bye(Scene, T, Performative, Message).