+obligation(Ag,Norm,committed(Ag,Mission,Scheme),DeadLine): 
	.my_name(Ag)
<- 
    commitMission(Mission)[artifact_name(Scheme)].
    
+obligation(Ag,Norm,achieved(Scheme,Goal,Ag),DeadLine): 
	.my_name(Ag)
<- 
	.print("I am obliged to achieve goal ", Goal);
	!Goal[scheme(Scheme)].
	//goalAchieved(Goal)[artifact_name(Scheme)].

+goalState(Sch,G,L1,L2,satisfied):
	true
<-
	.print("## Goal ", G, " was satisfied!").
	
+obligation(MyName, nProtocol(Scene,Estado,Player), transition(CurrentState, GotoState, TriggerType, Target, Duty), _):
	.my_name(MyName)
<-
	.print("I'm obliged in the scene ", Scene, " to do ", Duty);
	!Duty[scene(Scene)].
	