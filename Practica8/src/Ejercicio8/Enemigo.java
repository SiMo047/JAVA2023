package Ejercicio8;

public class Enemigo {

	private String nombre ; 
	private String clase ; 
	private int salud ;
	
	
	
	
	/*constructor */
	public Enemigo(String nombre, String clase, int salud) {
		super();
		this.nombre = nombre;
		this.clase = clase;
		this.salud = salud;
	}
	
	/*gety set */
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
	public int getSalud() {
		return salud;
	}
	public void setSalud(int salud) {
		this.salud = salud;
	} 
	
	/*metodo que quitara vida al enemigo*/
	public boolean quitarvida(int cant) {
		if (this.salud-cant>0) {
			this.salud=this.salud-cant;
			
			return true ; 
		}else if (this.salud-cant<0) {
			return false ;
		} 
		return false;
	}
	
	/*comprobar*/
	public void golpear(Jugador juga){
		
		juga.setSalud(juga.getSalud()-30);
		
	}


		
	}
	
	


