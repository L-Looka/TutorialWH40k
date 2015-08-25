package Units;

interface BikesCan extends SpecialRule {
	/*	public Bikes (String Name, int WS, int BS, int S, int T,  int W, int I, int A, int Ld, int Save){
	super (Name,WS,BS,S,T,W,I,A,Ld,Save);
}
public Bikes (){}*/
	default boolean HammerOfWrath(){
		return true;
	}
	default boolean Jink(){
		return true;
	}
	default int Bulky(){
		return 2;
	}
	default boolean Relentless(){
		return true;
	}	
	default int TurboBoost(){
		return  BikeSwitch()? 24: 12;
	}
	default int movement(){
		return 12;
	}
	default boolean BikeSwitch(){
		return false; // false = bike; true = jbike;
	}
	default String Type() {
		return  BikeSwitch()? "JBike": "Bike";
	}
	default int FallBackMove() {
		return 3;
	}
	default boolean SlowedByTerrain(){
		return false;
	}
	default boolean DifficultAsDangerous(){
		return true;
	}
	
	default boolean MoveOverTerrain() {
		return  BikeSwitch()? true: false;
	}
	
}
