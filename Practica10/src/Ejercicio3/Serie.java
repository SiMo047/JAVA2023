package Ejercicio3;

public class Serie implements Entregable  {

	private String titulo ; 
	private int numeroDetemporadas ;
	private String genero ; 
	private String creador ; 
	private boolean prestado ;
	
	/*constructores */
	public Serie() {
		super();
		this.titulo = "";
		this.numeroDetemporadas = 3;
		this.genero = "";
		this.creador = "";
		this.prestado = false;
	}


	public Serie(String titulo, String creador) {
		super();
		this.titulo = titulo;
		this.numeroDetemporadas = 3;		
		this.genero = "";
		this.creador = creador;
		this.prestado = false;
	}


	public Serie(String titulo, int numeroDetemporadas, String genero, String creador) {
		super();
		this.titulo = titulo;
		this.numeroDetemporadas = numeroDetemporadas;
		this.genero = genero;
		this.creador = creador;
		this.prestado = false;
	} 
	
	public Serie(Serie otro) {
		super();
		this.titulo = otro.titulo;
		this.numeroDetemporadas = otro.numeroDetemporadas;
		this.genero = otro.genero;
		this.creador = otro.creador;
		this.prestado = otro.prestado;
	}
	
	/*get y set */


	public String getTitulo() {
		return titulo;
	}


	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}


	public int getNumeroDetemporadas() {
		return numeroDetemporadas;
	}


	public void setNumeroDetemporadas(int numeroDetemporadas) {
		this.numeroDetemporadas = numeroDetemporadas;
	}


	public String getGenero() {
		return genero;
	}


	public void setGenero(String genero) {
		this.genero = genero;
	}


	public String getCreador() {
		return creador;
	}


	public void setCreador(String creador) {
		this.creador = creador;
	}

	/*toString*/

	@Override
	public String toString() {
		return "Serie [titulo=" + titulo + ", numeroDetemporadas=" + numeroDetemporadas + ", genero=" + genero
				+ ", creador=" + creador + ", prestado=" + prestado + "]";
	}


	@Override
	public void entregar() {
		this.prestado = true;
		
	}
	
	

	@Override
	public void devolver() {
		
		this.prestado = false;
		
	}
	

	@Override
	public boolean isPrestado() {		
		
		return this.prestado;
	}
	
	
	
	
	
	
	
	
	
	
	
}
