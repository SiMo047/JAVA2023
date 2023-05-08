package Ejercicio2;

import java.time.LocalDate;

public class test {

	public static void main(String[] args) {
		
		
		
		Genero g1 = new Genero ("Terror");
		Genero g2 = new Genero ("Accion");
		Genero g3 = new Genero ("Aventura");
		Genero g4 = new Genero ("Ciencia Ficcion");
		Genero g5 = new Genero ("Drama");
		Genero g6 = new Genero ("Comedia");
		Genero g7 = new Genero ("Crimen");
		
		
		Director d1 = new Director("Ridley Scott");
		Director d2 = new Director("F.F. Coppola,");
		Director d3 = new Director("C. Nolan");
		Director d4 = new Director("Martin Scorsese");
		Director d5 = new Director("Quentin");

		
		Pelicula p1 = new Pelicula ("Pull Fiction",LocalDate.of(2001, 01, 15));
		Pelicula p2 = new Pelicula ("Reservoir Dogs",LocalDate.of(2004, 12, 16));
		Pelicula p3 = new Pelicula ("Gladiator",LocalDate.of(2006, 11, 22));
		Pelicula p4 = new Pelicula ("Blade Runner",LocalDate.of(1982, 8, 21));
		Pelicula p5 = new Pelicula ("Alien",LocalDate.of(1979, 1, 15));
		Pelicula p6 = new Pelicula ("El Padrino",LocalDate.of(1972, 1, 15));
		Pelicula p7 = new Pelicula ("TENET",LocalDate.of(2020, 8, 26));	
		Pelicula p8 = new Pelicula ("Godfellas",LocalDate.of(1990, 10, 19));
		Pelicula p9 = new Pelicula ("El lobo de Wall Street",LocalDate.of(2014, 1, 17));
		
				
		d1.addPelicula(p4);
		d1.addPelicula(p9);
		d1.addPelicula(p3);
		d2.addPelicula(p5);
		d2.addPelicula(p7);
		d3.addPelicula(p9);
		d3.addPelicula(p8);
		d4.addPelicula(p2);
		d4.addPelicula(p6);
		d5.addPelicula(p9);
		d5.addPelicula(p1);
		
		
		p1.addPyG(d5, g7);
		p2.addPyG(d4, g7);
		p3.addPyG(d1, g2);
		p4.addPyG(d1, g2);
		p5.addPyG(d2, g4);
		p6.addPyG(d4, g7);
		p7.addPyG(d2, g3);
		p8.addPyG(d3, g5);
		p9.addPyG(d1, g6);
		p9.addDirector(d3);
		p9.addDirector(d5);
	}

}
