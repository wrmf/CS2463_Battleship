
public class Water extends GamePiece {

	public Water(Location location) {
		super(location);
	}
	
	@Override
	public String draw() {
		if(isHit() || isMiss()) {
			return "- ";
		} else {
			return ". ";
		}
	}
	
	@Override
	public boolean isWater() {
		return true;
	}
	
	@Override
	public boolean isShip() {
		return false;
	}

}
