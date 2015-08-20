package Units;

public abstract class Bikes extends Infantry 
{
	private int movement = 12;
	final private int FallBackMove = 3; //number of dice rolled
	final private boolean SlowedByTerrain = false;
	private boolean DifficultAsDangerous = true;
	private int TurboBoost = 12;
	private boolean BikeSwitch = false; //true  will bee a jatbike
	
	final private boolean HammerOfWrath = true;
	final private boolean Jink = true;
	private int Bulky = 2;
	final private boolean Relentless = true;
	
	
	public int getMovement() {
		return movement;
	}
	public void setMovement(int movement) {
		this.movement = movement;
	}
	public int getFallBackMove() {
		return FallBackMove;
	}
	public boolean isSlowedByTerrain() {
		return SlowedByTerrain;
	}
	public boolean isDifficultAsDangerous() {
		return DifficultAsDangerous;
	}
	public void setDifficultAsDangerous(boolean difficultAsDangerous) {
		DifficultAsDangerous = difficultAsDangerous;
	}
	public boolean isMoveOverTerrain() {
		return  BikeSwitch? true: false;
	}
	public boolean isHammerOfWrath() {
		return HammerOfWrath;
	}
	public boolean isJink() {
		return Jink;
	}
	public int getBulky() {
		return Bulky;
	}
	public void setBulky(int bulky) {
		Bulky = bulky;
	}
	public boolean isRelentless() {
		return Relentless;
	}
	public int getTurboBoost() {
		return BikeSwitch? TurboBoost *2: TurboBoost;
	}
	public void setTurboBoost(int turboBoost) {
		TurboBoost = turboBoost;
	}
	public boolean isBikeSwitch() {
		return BikeSwitch;
	}
	public void setBikeSwitch(boolean bikeSwitch) {
		BikeSwitch = bikeSwitch;
	}
	
}
