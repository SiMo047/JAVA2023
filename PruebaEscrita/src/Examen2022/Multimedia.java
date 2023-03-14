package Examen2022;

import java.util.Objects;

public class Multimedia {

	private static int cont; 
	protected int codigo ; 
	protected String titulo ; 
	protected boolean plus ; 
	protected double precio ; 
	protected Genero genero ; 
	
	public Multimedia() {
		super();
		this.codigo=generadorcod();
		this.titulo = "";
		this.plus = false;
		this.precio = 2;
		this.genero=genero.ACCION;
		
		
	}	
	
	public Multimedia(String titulo, boolean plus, double precio) {
		super();
		this.codigo=generadorcod();
		this.titulo = titulo;
		this.plus = plus;
		if(this.plus ==false) { 
		this.precio = precio;
		}
		this.genero=genero.ACCION;
		
		
	}


public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public boolean isPlus() {
		return plus;
	}

	public void setPlus(boolean plus) {
		this.plus = plus;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public Genero getGenero() {
		return genero;
	}

	public void setGenero(Genero genero) {
		this.genero = genero;
	}
	
	
	

@Override
	public int hashCode() {
		return Objects.hash(codigo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Multimedia other = (Multimedia) obj;
		return codigo == other.codigo;
	}
	
	
	

@Override
	public String toString() {
		return "Multimedia [codigo=" + codigo + ", titulo=" + titulo + ", plus=" + plus + ", precio=" + precio
				+ ", genero=" + genero + "]";
	}



private int generadorcod() {
		cont++;
		codigo = cont ; 
		return codigo ; 
	}
	
}
