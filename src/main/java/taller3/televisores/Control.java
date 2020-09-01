package taller3.televisores;

public class Control {
	public TV tv;
	
	public void setCanal (int cant) {
		if ((cant<=120)  && (tv.estado==true) && (cant>=1)){
			tv.canal=cant;
		}
	}
	
	
	public void canalUp () {
		tv.canalUp();
	}
	public void canalDown () {
		tv.canalDown();

	}
	public void turnOn () {
		tv.estado=true;
	}
	public void turnOff () {
		tv.estado=false;
	}
	
	public void volumenUp () {
		tv.volumenUp();
	}
	public void volumenDown () {
		tv.volumenDown();
	}
	public TV getTV () {
		return tv;
	}
	public void setTV (TV tl) {
		tv=tl;
	}
	public TV getTv () {
		return this.tv;
	}
	public void setTv (TV tele) {
		this.tv = tele;
	}
	public void enlazar (TV tele) {
		tv=tele;
		tv.control=this;
	}
	
		

}
