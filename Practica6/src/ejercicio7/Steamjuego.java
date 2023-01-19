package ejercicio7;

public class Steamjuego {

	private String nombre ; 
	private String descripcion ; 
	private String imagen ; 
	private int mediajugadoresDiarios ; 
	private int diasDesdesalida ; 
	private double precio ; 
	private int puestomasvendido;
	
	
	
	/*construc*/
	public Steamjuego(String nombre, String descripcion, String imagen, int mediajugadoresDiarios, int diasDesdesalida,	double precio, int puestomasvendido) {
		super();
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.imagen = imagen;
		this.mediajugadoresDiarios = mediajugadoresDiarios;
		this.diasDesdesalida = diasDesdesalida;
		this.precio = precio;
		this.puestomasvendido = puestomasvendido;
	}

	/*get y set */

	public String getNombre() {
		return nombre;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	public String getDescripcion() {
		return descripcion;
	}



	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}



	public String getImagen() {
		return imagen;
	}



	public void setImagen(String imagen) {
		this.imagen = imagen;
	}



	public int getMediajugadoresDiarios() {
		return mediajugadoresDiarios;
	}



	public void setMediajugadoresDiarios(int mediajugadoresDiarios) {
		this.mediajugadoresDiarios = mediajugadoresDiarios;
	}



	public int getDiasDesdesalida() {
		return diasDesdesalida;
	}



	public void setDiasDesdesalida(int diasDesdesalida) {
		this.diasDesdesalida = diasDesdesalida;
	}



	public double getPrecio() {
		return precio;
	}



	public void setPrecio(double precio) {
		this.precio = precio;
	}



	public int getPuestomasvendido() {
		return puestomasvendido;
	}



	public void setPuestomasvendido(int puestomasvendido) {
		this.puestomasvendido = puestomasvendido;
	} 
	
	
	/*metodo en otro dia*/
	
	public void jugadoresDia(int jugadores) {
		double dia;
		dia=((this.mediajugadoresDiarios*this.diasDesdesalida)+jugadores)/this.diasDesdesalida+1;
		
		return ; 
	}
	
	
	
}
