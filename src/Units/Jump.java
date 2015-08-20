package Units;

public abstract class Jump extends Infantry {
	private boolean moveSwitch = true; // when unit use their jump packs it is true;
	final private int FallBackMove = 3; //number of dice rolled;
	private boolean SlowedByTerrain = false; 
	private boolean DifficultAsDangerous = true; 
	private boolean MoveOverTerrain = true; 
	
	private boolean RerollChardge = false;
	private boolean HammerOfWrath = false;
	private int Bulky = 2;
	final private boolean DeepStrike = true;
	
	
	public int getBulky() {
		return Bulky;
	}
	public void setBulky(int bulky) {
		Bulky = bulky;
	}
	public boolean isDeepStrike() {
		return DeepStrike;
	}
	public boolean isRerollChardge() {
		return moveSwitch? false: true;
	}
	public void setRerollChardge(boolean rerollChardge) {
		RerollChardge = rerollChardge;
	}
	public boolean isHammerOfWrath() {
		return moveSwitch? false: true;
	}
	public void setHammerOfWrath(boolean hammerOfWrath) {
		HammerOfWrath = hammerOfWrath;
	}
	public int getMovement() {
		return moveSwitch? super.getMovement()*2: super.getMovement();
	}
	public boolean isMoveSwitch() {
		return moveSwitch;
	}
	public void setMoveSwitch(boolean moveSwitch) {
		this.moveSwitch = moveSwitch;
	}
	public int getFallBackMove() {
		return FallBackMove;
	}
	public boolean isSlowedByTerrain() {
		return moveSwitch? false: true;
	}
	public void setSlowedByTerrain(boolean slowedByTerrain) {
		SlowedByTerrain = slowedByTerrain;
	}
	public boolean isDifficultAsDangerous() {
		return moveSwitch? true: false;
	}
	public void setDifficultAsDangerous(boolean difficultAsDangerous) {
		DifficultAsDangerous = difficultAsDangerous;
	}
	public boolean isMoveOverTerrain() {
		return moveSwitch? true: false;
	}
	public void setMoveOverTerrain(boolean moveOverTerrain) {
		MoveOverTerrain = moveOverTerrain;
	}
	
}
