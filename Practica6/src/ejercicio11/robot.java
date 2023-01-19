package ejercicio11;

public class robot {

	private int posicionX; 
	private int posicionY;
	private boolean hallegado ; 
	private int pasos ; 
	private static int contadorPasos ; 
	private static int contadorRobots; 
	private static int filastab=100; 
	private static int columtab=100 ;
	
	
	
	public robot(int posicionX, int posicionY, int pasos) {
		super();
		this.posicionX = posicionX;
		this.posicionY = posicionY;
	    this.pasos = pasos;
		
		this.contadorPasos=this.pasos; 
		this.contadorRobots++; 
	}



	/*get y set */
	
	public int getPosicionX() {
		return posicionX;
	}



	public void setPosicionX(int posicionX) {
		this.posicionX = posicionX;
	}



	public int getPosicionY() {
		return posicionY;
	}



	public void setPosicionY(int posicionY) {
		this.posicionY = posicionY;
	}



	public int getPasos() {
		return pasos;
	}



	public static int getContadorPasos() {
		return contadorPasos;
	}



	public static int getContadorRobots() {
		return contadorRobots;
	}
	
	
	
	public void Arriba(int num) {
		if( num>=0 || num<100 && this.posicionY>=0 || this.posicionY<this.filastab ) {
		this.posicionY= this.posicionY+num; 
		}
		
	}
	
	public void Abajo(int num) {
		if( num>=0 || num<100  && this.posicionY>=0 || this.posicionY<this.filastab  ) {
		this.posicionY= this.posicionY-num; 
		}
		
	}

	
	
	
	
	
	
	
	
	
}
