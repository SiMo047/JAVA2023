package Ejercicio4;

import java.util.Objects;

public class Libro {

	
	private int isbn ; 
	private String titulo ; 
	private String autor ;
	private int ndepaginas ; 
	private double precio_compra ; 
	private double precio_venta ; 
	private boolean vendido=false ;
	
	
	public Libro(int isbn, String titulo, String autor, int ndepaginas) {
		super();
		this.isbn = isbn;
		this.titulo = titulo;
		this.autor = autor;
		this.ndepaginas = ndepaginas;
		this.precio_compra = 0;
		this.precio_venta = 0;
		this.vendido = false;
	}

	/*get y set */

	public int getIsbn() {
		return isbn;
	}


	public void setIsbn(int isbn) {
		this.isbn = isbn;
	}


	public String getTitulo() {
		return titulo;
	}


	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}


	public String getAutor() {
		return autor;
	}


	public void setAutor(String autor) {
		this.autor = autor;
	}


	public int getNdepaginas() {
		return ndepaginas;
	}


	public void setNdepaginas(int ndepaginas) {
		this.ndepaginas = ndepaginas;
	}


	public double getPrecio_compra() {
		return precio_compra;
	}


	public void setPrecio_compra(double precio_compra) {
		this.precio_compra = precio_compra;
	}


	public double getPrecio_venta() {
		return precio_venta;
	}


	public void setPrecio_venta(double precio_venta) {
		this.precio_venta = precio_venta;
	}


	public boolean isVendido() {
		return vendido;
	}


	public void setVendido(boolean vendido) {
		this.vendido = vendido;
	}
	/*to string */

	@Override
	public String toString() {
		return "El libro "+titulo+ " con ISBN "+isbn+" creado por el autor "+autor+" tiene "+ndepaginas+" paginas";
	}

	@Override
	public int hashCode() {
		return Objects.hash(isbn);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Libro other = (Libro) obj;
		return isbn == other.isbn;
	} 
	
	
	
	
	
	
	
	
	
	
	
}
