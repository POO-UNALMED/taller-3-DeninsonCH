package taller3.televisores;

public class TV {
	private Marca marca; 
	private int canal = 1; 
	private int precio = 500; 
	private boolean estado = false;
	private int volumen = 1;
	private Control control;
	private static int numTV=0;
	
	public TV(Marca marca, boolean estado) {
		this.setMarca(marca);
		this.estado = estado;
		setnumTV(getNumTV()+1);
	}
	
	public turnOn() {
		
	}
}
