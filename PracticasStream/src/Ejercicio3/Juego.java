package Ejercicio3;

public class Juego {


	private static int cont =0; 
	
	private Integer id ; 
	private String nombre ; 
	private String plataforma ;
	
	
	
	public Juego(String nombre, String plataforma) {
		super();
		this.id = ++cont;
		this.nombre = nombre;
		this.plataforma = plataforma;
	}



	public String getNombre() {
		return nombre;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	public String getPlataforma() {
		return plataforma;
	}



	public void setPlataforma(String plataforma) {
		this.plataforma = plataforma;
	}



	public Integer getId() {
		return id;
	}



	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Juego [nombre=");
		builder.append(nombre);
		builder.append(", plataforma=");
		builder.append(plataforma);
		builder.append("]");
		return builder.toString();
	} 
	
	
	
	
	
	
}
