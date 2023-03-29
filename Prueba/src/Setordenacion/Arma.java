package Setordenacion;

import java.util.Objects;

public class Arma {

	enum Tipo {ESPADA,HACHA, MAZO, BASTON, BARITA, ARCO, DAGA};
	
	private String nombre; 
	private Tipo tipo ; 
	private boolean esMagico ; 
	private int danoFisico ; 
	private int danoMagico ;
	
	
	
	public Arma(String nombre, Tipo tipo, boolean esMagico, int danoFisico, int danoMagico) {
		super();
		this.nombre = nombre;
		this.tipo = tipo;
		this.esMagico = esMagico;
		this.danoFisico = danoFisico;
		this.danoMagico = danoMagico;
	}



	public String getNombre() {
		return nombre;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	public Tipo getTipo() {
		return tipo;
	}



	public void setTipo(Tipo tipo) {
		this.tipo = tipo;
	}



	public boolean isEsMagico() {
		return esMagico;
	}



	public void setEsMagico(boolean esMagico) {
		this.esMagico = esMagico;
	}



	public int getDanoFisico() {
		return danoFisico;
	}



	public void setDanoFisico(int danoFisico) {
		this.danoFisico = danoFisico;
	}



	public int getDanoMagico() {
		return danoMagico;
	}



	public void setDanoMagico(int danoMagico) {
		this.danoMagico = danoMagico;
	}



	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Arma [nombre=");
		builder.append(nombre);
		builder.append(", tipo=");
		builder.append(tipo);
		builder.append(", esMagico=");
		builder.append(esMagico);
		builder.append(", danoFisico=");
		builder.append(danoFisico);
		builder.append(", danoMagico=");
		builder.append(danoMagico);
		builder.append("]");
		return builder.toString();
	}



	@Override
	public int hashCode() {
		return Objects.hash(nombre);
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Arma other = (Arma) obj;
		return Objects.equals(nombre, other.nombre);
	} 
	
	
	
	
}
