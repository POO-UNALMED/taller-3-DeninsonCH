package taller3.televisores;

public class TV {
	Marca marca;
	public boolean estado;	
	public Control control;
	static int numTV=0;
	public int canal=1, precio=500, volumen=1;
	
	public TV (Marca m1,boolean es1){
		this.marca=m1;
		estado=es1;
		numTV++;
		
	}
	public Marca getMarca () {
		return this.marca;
    }
	public Control getControl () {
		return this.control;
    }
	
	public static void setNumTV (int n1) {
		numTV = n1;
	}
	public static int getNumTV() {
		return numTV;
	}

	
	public boolean getEstado() {
		return estado;
	}
	public void setMarca (Marca marc) {
		this.marca=marc;
	}
	public void setControl (Control con) {
		this.control=con;
	}
	public void setPrecio (int pre) {
		precio=pre;
	}
	public int getPrecio () {
		return precio;
    }
	public int getVolumen () {
		return volumen;
    }
	public int getCanal () {
		return canal;
    }
	public void setVolumen (int vol) {
		if((vol>=0) && (vol<=7)){
			volumen=vol;
		}
		
	}
	public void setCanal (int can) {
		if ((can<=120)  && (estado==true) && (can>=1)){
			canal=can;
		}
	}
	public void turnOn () {
		estado=true;
	}
	public void turnOff () {
		estado=false;
	}
	public void canalUp () {
		if ((canal<120) && (canal>=1) && (estado==true)) {
		canal++;
	}
	}
	public void canalDown () {
		if ((canal>1)&& (canal<=120) && (estado==true)) {
		canal--;
		}
	}
	public void volumenUp () {
		if ((volumen<7) && (volumen>=0) && (estado==true)) {
		volumen++;
		}
	}
	public void volumenDown () {
		if ((volumen>0) && (volumen<7) && (estado==true)) {
		volumen--;
		}
	}



}