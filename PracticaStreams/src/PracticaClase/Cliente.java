package PracticaClase;

public class Cliente {

	
	private Long id ;
	private String nombre ; 
	private Integer nivel ;
	
	
	
	public Cliente(long id, String nombre, Integer nivel) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.nivel = nivel;
	}



	public long getId() {
		return id;
	}



	public void setId(long id) {
		this.id = id;
	}



	public String getNombre() {
		return nombre;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	public Integer getNivel() {
		return nivel;
	}



	public void setNivel(Integer nivel) {
		this.nivel = nivel;
	}



	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Cliente [id=");
		builder.append(id);
		builder.append(", nombre=");
		builder.append(nombre);
		builder.append(", nivel=");
		builder.append(nivel);
		builder.append("]");
		return builder.toString();
	}
	
	
	
	
	
	
}
