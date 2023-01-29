package Ejercicio9;

public class Enemigo {

	private String nombre;
	private int salud;
	private int danoArma;
	
	/*constructor*/
	public Enemigo(String nombre, int salud , int danoArma) {
		super();
		this.nombre = nombre;
		this.salud = salud;
		this.danoArma=danoArma;
	}
	
	
/*get y set */
	
	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public int getSalud() {
		return salud;
	}


	public void setSalud(int salud) {
		this.salud = salud;
	}


	public int getDanoArma() {
		return danoArma;
	}


	public void setDanoArma(int danoArma) {
		this.danoArma = danoArma;
	}


	@Override
	public String toString() {
		return "Enemigo [nombre=" + nombre + ", salud=" + salud + "]";
	}
/*metodos*/
	
	public void golpearJuga(Jugador jugador) {
		
		jugador.recibirDaño(this.danoArma);
		
			
	}

	
	public void recibirDaño (int num ) {
		this.salud= this.salud-num; 
	}
	
	
}
