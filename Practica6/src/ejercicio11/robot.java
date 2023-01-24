package ejercicio11;

import java.util.Objects;

public class robot {

	private int posicionX; 
	private int posicionY;
	private boolean hallegado ; 
	private int pasos ; 
	private static int contadorPasos ; 
	private static int contadorRobots=0; 
	private static int filastab=100; 
	private static int columtab=100 ;
	
	
	
	public robot(int posicionX, int posicionY) {
		super();
		this.posicionX = posicionX;
		this.posicionY = posicionY;
	    this.pasos = pasos;
		
		this.contadorPasos=this.pasos; 
		this.contadorRobots++; 
	}
	
	public robot() {
		super();
		this.posicionX = 0;
		this.posicionY = 0;
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
	
	/*metodos*/
	
	public void Arriba() {
		if( this.posicionY < robot.filastab-1 ) {
		this.posicionY++;  
		}
		
	}
	
	public void Abajo() {
		if( this.posicionY > 0 ) {
		this.posicionY--; 
		}
	
	}
	
	
	public void Derrecha() {
			if( this.posicionX < robot.columtab -1) {
			this.posicionX++; 
			}	
			
	}

			public void Izquierda() {
				if( this.posicionX > 0 ) {
				this.posicionX--; 
				}	
			
	}

			
			/*---*/
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("robot [posicionX=");
		builder.append(posicionX);
		builder.append(", posicionY=");
		builder.append(posicionY);
		builder.append(", hallegado=");
		builder.append(hallegado);
		builder.append(", pasos=");
		builder.append(pasos);
		builder.append("]");
		return builder.toString();
	}

	@Override
	public int hashCode() {
		return Objects.hash(posicionX, posicionY);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		robot other = (robot) obj;
		return posicionX == other.posicionX && posicionY == other.posicionY;
	}

	
	
	
	
	
	
	
	
	
	
	
}
