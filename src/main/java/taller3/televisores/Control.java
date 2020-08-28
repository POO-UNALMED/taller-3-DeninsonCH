package taller3.televisores;

public class Control {
	private TV tv;
	
	public void enlazar(TV televisor) {
		tv =televisor;
		televisor.setControl(this);
	}

}
