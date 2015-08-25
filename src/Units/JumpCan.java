package Units;

interface JumpCan extends SpecialRule {
	/*	public Jump (String Name, int WS, int BS, int S, int T,  int W, int I, int A, int Ld, int Save){
	super (Name,WS,BS,S,T,W,I,A,Ld,Save);
}
public Jump (){}*/
	default boolean moveSwitch(){
		return true; // when unit use their jump packs it is true;
	}
	default int FallBackMove(){
		return 3; //number of dice rolled;
	}
	default int Bulky(){
		return 2;
	}
	default boolean DeepStrike(){
		return true;
	}
	default String Type() {
		return "JInf";
	}
	default boolean RerollChardge() {
		return moveSwitch()? false: true;
	}
	default boolean HammerOfWrath() {
		return moveSwitch()? false: true;
	}
	default int Movement() {
		return moveSwitch()? 12: 6;
	}
	default boolean SlowedByTerrain() {
		return moveSwitch()? false: true;
	}
	default boolean DifficultAsDangerous() {
		return moveSwitch()? true: false;
	}
	default boolean MoveOverTerrain() {
		return moveSwitch()? true: false;
	}
}
