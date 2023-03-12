package Ejercicio3;

public class VideoJuego implements Entregable {

	
	private String titulo ;
	private int horasestimadas ; 
	private String genero ; 
	private String desarrollador ; 
	private boolean prestado ; 
	
	
	public VideoJuego() {
		super();
		this.titulo = "";
		this.horasestimadas = 100;
		this.genero = "";
		this.desarrollador = "";
		this.prestado = false;
	}
	
	public VideoJuego(String titulo, String desarrollador) {
		super();
		this.titulo = titulo;
		this.horasestimadas = 100;
		this.genero = "";
		this.desarrollador = desarrollador;
		this.prestado = false;
	}
	
	public VideoJuego(String titulo, int horasestimadas,String genero, String desarrollador) {
		super();
		this.titulo = titulo;
		this.horasestimadas = horasestimadas;
		this.genero = genero;
		this.desarrollador = desarrollador;
		this.prestado = false;
	}
	
	public VideoJuego(VideoJuego otro) {
		super();
		this.titulo = otro.titulo;
		this.horasestimadas =  otro.horasestimadas;
		this.genero =  otro.genero;
		this.desarrollador =  otro.desarrollador;
		this.prestado = otro.prestado;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getHorasestimadas() {
		return horasestimadas;
	}

	public void setHorasestimadas(int horasestimadas) {
		this.horasestimadas = horasestimadas;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getDesarrollador() {
		return desarrollador;
	}

	public void setDesarrollador(String desarrollador) {
		this.desarrollador = desarrollador;
	}

	@Override
	public String toString() {
		return "VideoJuego [titulo=" + titulo + ", horasestimadas=" + horasestimadas + ", genero=" + genero
				+ ", desarrollador=" + desarrollador + ", prestado=" + prestado + "]";
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
