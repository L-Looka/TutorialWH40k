package Units;

public abstract class Infantry implements SpecialRule 
{
	private int movement = 6;
	private int FallBackMove = 2; //number of dice rolled
	private boolean SlowedByTerrain = true;
	private boolean DifficultAsDangerous = false;
	private boolean MoveOverTerrain = false;
	
	public int getMovement() {
		return movement;
	}
	public void setMovement(int movement) {
		this.movement = movement;
	}
	public int getFallBackMove() {
		return FallBackMove;
	}
	public void setFallBackMove(int fallBackMove) {
		FallBackMove = fallBackMove;
	}
	public boolean isSlowedByTerrain() {
		return SlowedByTerrain;
	}
	public void setSlowedByTerrain(boolean slowedByTerrain) {
		SlowedByTerrain = slowedByTerrain;
	}
	public boolean isDifficultAsDangerous() {
		return DifficultAsDangerous;
	}
	public void setDifficultAsDangerous(boolean difficultAsDangerous) {
		DifficultAsDangerous = difficultAsDangerous;
	}
	public boolean isMoveOverTerrain() {
		return MoveOverTerrain;
	}
	public void setMoveOverTerrain(boolean moveOverTerrain) {
		MoveOverTerrain = moveOverTerrain;
	}
	
}
