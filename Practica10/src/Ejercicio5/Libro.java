package Ejercicio5;

public class Libro extends Publicacion implements Prestable {

	private boolean prestado ; 
	
	
	public Libro(String isbn, String titulo, int ano, int paginas , boolean prestado) {
		super(isbn, titulo, ano, paginas);

		this.prestado = prestado ; 
	}

	@Override
	public void presta() {
		
		this.prestado=true ;

	}

	@Override
	public void devuelve() {
		this.prestado=false ;

	}

	@Override
	public void estaPrestado() {
		
		this.prestado=true ; 

	}

}
