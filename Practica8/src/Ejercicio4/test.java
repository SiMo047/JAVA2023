package Ejercicio4;

public class test {

	public static void main(String[] args) {

	
	Libro b1 = new Libro (1,"Padre rico padre pobre ","Robert Kiyosaki",264);
	
	Libro b2 = new Libro (2,"Atomic Habits","James Clear",288);
	
	
	/*libreria creada */
	Libreria l1 = new Libreria ();
	

	/*añadimos los libros a la libreria */
	
	l1.adquirir(b2, 5);
	l1.adquirir(b1, 14);
	
	l1.vender(b2, 10);
	l1.vender(b1, 20);
	
	
	
	System.out.println(l1.ganancias());
	System.out.println(l1);
	}

}
