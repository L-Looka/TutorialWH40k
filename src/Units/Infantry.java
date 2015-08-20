package Units;

public abstract class Infantry implements SpecialRule 
{
	private int movement = 6;
	private int FallBackMove = 2; //number of dice rolled
	
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
	public boolean isDifficultAsDangerous() {
		return DifficultAsDangerous;
	}
	public boolean isMoveOverTerrain() {
		return MoveOverTerrain;
	}
}
