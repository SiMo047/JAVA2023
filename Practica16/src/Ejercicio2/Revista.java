package Ejercicio2;

public class Revista extends Publicacion {

	private int numero ;

	public Revista(String isbn, String titulo, int ano, int paginas , boolean prestado , int numero) {
		super(isbn, titulo, ano, paginas, prestado );
		
		this.numero=numero ;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	} 
	
	
	
}
