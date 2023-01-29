package Ejercicio9;

public class Jugador {

	
	private String nombre ; 
	private String clase ; 
	private int nivel ; 
	private int salud ; 
	private int danoArma ;
	
	/*constructores*/
	
	public Jugador(String nombre, String clase, int dañoArma) {
		super();
		this.nombre = nombre;
		this.clase = clase;
		this.danoArma = dañoArma;
		this.nivel=1; 
		this.salud=200; 
	}
	
	
	/*get y set */

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getClase() {
		return clase;
	}

	public void setClase(String clase) {
		this.clase = clase;
	}

	public int getNivel() {
		return nivel;
	}

	public void setNivel(int nivel) {
		this.nivel = nivel;
	}

	public int getSalud() {
		return salud;
	}

	public void setSalud(int salud) {
		this.salud = salud;
	}

	public int getDañoArma() {
		return danoArma;
	}

	public void setDañoArma(int dañoArma) {
		this.danoArma = dañoArma;
	} 
	
	
	@Override
	public String toString() {
		return "Jugador [nombre=" + nombre +  ", salud=" + salud +", clase=" + clase + ", nivel=" + nivel
				+"]";
	}
	
	
	/*metodos */
	



	public void subirNivel() {
		this.nivel++;
		this.salud= this.salud+(int) (Math.pow(2.5, this.nivel));
	}
	
	
	public void recibirDaño (int num ) {
		this.salud= this.salud-num; 
	}
	

	
	public void golpearEnem(Enemigo enemigo) {
			enemigo.recibirDaño(this.danoArma);
	}
	
	
	
	
	
}
