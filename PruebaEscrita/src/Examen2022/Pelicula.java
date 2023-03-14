package Examen2022;

public class Pelicula extends Multimedia {

	
	private int duracion ;

	public Pelicula() {
		super();
		this.duracion=120;
	}

	public Pelicula(String titulo, boolean plus, double precio,int duracion) {
		super(titulo, plus, precio);
		this.duracion=duracion; 
	}

	public int getDuracion() {
		return duracion;
	}

	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}

	@Override
	public String toString() {
		return "Pelicula [codigo=" + codigo + ", titulo=" + titulo + ", plus=" + plus + ", precio=" + precio
				+ ", genero=" + genero + ", duracion=" + duracion + "]";
	} 
	
	
	
}
