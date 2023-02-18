package Ejercicio3;

public class test {

	public static void main(String[] args) {

		
		Direccion d1 = new Direccion("Calle 1", 14 ,"Mojacar","Almeria",04630,"España",40.748817, -73.985428);
		
		Direccion d2 = new Direccion("Calle 2", 54 ,"Almeria","Almeria",0530,"España", 51.507222, -0.127647);
	
		
		System.out.println(d1.distanciaKM(d2));
		
	}

}
