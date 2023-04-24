package PracticaClase;

public class Producto {

	enum Categoria {LIBROS , JUEGOS , TELEVISORES};
	
	private long id ; 
	private String nombre ; 
	private Categoria categoria ; 
	private Double precio ;
	
	
	public Producto(long id, String nombre, Categoria categoria, Double precio) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.categoria = categoria;
		this.precio = precio;
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


	public Categoria getCategoria() {
		return categoria;
	}


	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}


	public Double getPrecio() {
		return precio;
	}


	public void setPrecio(Double precio) {
		this.precio = precio;
	}


	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Producto [id=");
		builder.append(id);
		builder.append(", nombre=");
		builder.append(nombre);
		builder.append(", categoria=");
		builder.append(categoria);
		builder.append(", precio=");
		builder.append(precio);
		builder.append("]");
		return builder.toString();
	} 

	
	
	
	
}
