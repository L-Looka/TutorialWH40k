package Units;

public abstract class Jump extends Infantry {
	private boolean moveSwitch = true; // when unit use their jump packs it is true;
	final private int FallBackMove = 3; //number of dice rolled;

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
	public boolean isHammerOfWrath() {
		return moveSwitch? false: true;
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
	public boolean isDifficultAsDangerous() {
		return moveSwitch? true: false;
	}
	public boolean isMoveOverTerrain() {
		return moveSwitch? true: false;
	}
}
