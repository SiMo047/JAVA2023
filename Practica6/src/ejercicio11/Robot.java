package ejercicio11;

import java.util.Objects;

public class Robot {

	private int posicionX; 
	private int posicionY;
	private boolean hallegado ; 
	private static int contadorPasos ; 
	private static int contadorRobots=0; 
	private static int filastab=10; 
	private static int columtab=10 ;
	
	/*CONSTRUCTORES*/
	
	public Robot(int posicionX, int posicionY) throws Exception{
		super();
		

		if (posicionX < 0  || posicionX > Robot.columtab) {
			throw new Exception(" X fuera de rango");
		}
		if (posicionY < 0  || posicionY > Robot.filastab) {
			throw new Exception(" Y fuera de rango");
		} 
		
		this.posicionX = posicionX;
		this.posicionY = posicionY;
		this.hallegado=false;
		this.contadorPasos=0; 
		this.contadorRobots++; 
	}
	
	public Robot() {
		super();
		this.posicionX = 0;
		this.posicionY = 0;
	    this.hallegado=false;	
		this.contadorPasos=0; 
		this.contadorRobots++; 
	}



	/*get y set */
	
	public int getPosicionX() {
		return posicionX;
	}



	public void setPosicionX(int posicionX) throws Exception  {
		
		if (posicionX < 0  || posicionX > Robot.columtab) {
			throw new Exception(" X fuera de rango");
		}
		this.posicionX = posicionX;
	}



	public int getPosicionY() {
		return posicionY;
	}



	public void setPosicionY(int posicionY) throws Exception {
		
		if (posicionY < 0  || posicionY > Robot.filastab) {
			throw new Exception(" Y fuera de rango");
		} 
		
		this.posicionY = posicionY;
	}




	public static int getContadorPasos() {
		return contadorPasos;
	}



	public static int getContadorRobots() {
		return contadorRobots;
	}
	
	public boolean hallegado() {
		return this.hallegado;
	}
	
	
	/*metodos*/

	public void Arriba() {
		if( this.posicionY < Robot.filastab ) {
		this.posicionY++;  
		this.contadorPasos++;
	 
		}
		
	}
	
	
	public void Abajo() {
		if( this.posicionY > 0 ) {
		this.posicionY--;
		this.contadorPasos++;
		}
	
	}
	
	
	public void Derrecha() {
			if( this.posicionX < Robot.columtab ) {
			this.posicionX++; 
			this.contadorPasos++;
			}	
			
	}

			public void Izquierda() {
				if( this.posicionX > 0 ) {
				this.posicionX--;
				this.contadorPasos++;
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
		Robot other = (Robot) obj;
		return posicionX == other.posicionX && posicionY == other.posicionY;
	}

	
	
	
	
	
	
	
	
	
	
	
}
