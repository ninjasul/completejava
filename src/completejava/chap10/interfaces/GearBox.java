package completejava.chap10.interfaces;

public class GearBox {
	private boolean clutchIsIn;
	
	public void operateClutch(boolean inOrOut) {
		this.clutchIsIn = inOrOut;
	}
}
