package Setordenacion;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class PruebaOrdenacion {

	public static void main(String[] args) {


		/*comparable */
		TreeSet<Libro> Bibliotecas = new TreeSet <>();
		
		
		
		Bibliotecas.add(new Libro ("RR4","Ramon"));
		Bibliotecas.add(new Libro ("BB1","Miguel"));
		Bibliotecas.add(new Libro ("BB2","Miguel"));
		Bibliotecas.add(new Libro ("RR1","Ramon"));
		
		
		for (Libro l : Bibliotecas) {
			System.out.println(l);
		}
		
		
		
		/*comparator */
		Set<Libro> Bibliotecas2 = new TreeSet <>(new Comparator<Libro>(){

			@Override
			public int compare(Libro o1, Libro o2) {
				
				return o1.getAutor().compareTo(o2.getAutor());
			}});
		
System.out.println("--------------------");
		
		Bibliotecas2.add(new Libro ("RR4","Ramon"));
		Bibliotecas2.add(new Libro ("BB1","Miguel"));
		Bibliotecas2.add(new Libro ("BB2","Miguel"));
		Bibliotecas2.add(new Libro ("RR1","Ramon"));
		
		
		for (Libro l : Bibliotecas2) {
			System.out.println(l);
		}
		
	}

}
