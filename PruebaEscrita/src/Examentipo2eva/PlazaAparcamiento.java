package Examentipo2eva;

import java.util.Objects;

public class PlazaAparcamiento {

	private int numeroDeplaza ; 
	private boolean libre ;
	
	
	public PlazaAparcamiento() {
		super();
		this.numeroDeplaza = 0;
		this.libre = true;
	}


	public PlazaAparcamiento(int numeroDeplaza) {
		super();
		this.numeroDeplaza = numeroDeplaza;
		this.libre= true ;
	}


	public int getNumeroDeplaza() {
		return numeroDeplaza;
	}


	public void setNumeroDeplaza(int numeroDeplaza) {
		this.numeroDeplaza = numeroDeplaza;
	}


	public boolean isLibre() {
		return libre;
	}


	public void setLibre(boolean libre) {
		this.libre = libre;
	}


	@Override
	public String toString() {
		return "PlazaAparcamiento [numeroDeplaza=" + numeroDeplaza + ", libre=" + libre + "]";
	}


	@Override
	public int hashCode() {
		return Objects.hash(numeroDeplaza);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PlazaAparcamiento other = (PlazaAparcamiento) obj;
		return numeroDeplaza == other.numeroDeplaza;
	} 
	
	
	
	
	
}
