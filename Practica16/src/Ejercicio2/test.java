package Ejercicio2;

public class test {

	public static void main(String[] args) {

		
		
		Libro l1 = new Libro ("01","Los lobos",2021,200,false);
		Libro l2 = new Libro ("02","Los lobos 2",2022,350,false);
		Libro l3 = new Libro ("03","Los lobos 3",2023,380,false);
		Libro l4 = new Libro ("04","Calculo Matematico",2021,200,false);
		Libro l5 = new Libro ("05","Filosofia",2021,200,false);
	
		Revista r1 = new Revista ("001","R1",2022,30,false,2);
		Revista r2 = new Revista ("002","R2",2022,30,false,4);
		
		Biblioteca b1 = new Biblioteca("C/Biblioteca 11");
		
		
		b1.adquirirMaterial(l1);
		b1.adquirirMaterial(r1);
		b1.adquirirMaterial(r2);
	}

}
