package Ejercicio1;

public class test {

	public static void main(String[] args) {


		Repartidor r1 = new Repartidor ("jose", 35 , 1200,"zona3");
		Repartidor r2 = new Repartidor ("Manu", 20 , 1500,"zona3");
		
		Comercial c1 = new Comercial ("Ramon",26,1600,180); 
		Comercial c2 = new Comercial ("RA",31,1700,201); 
		
		System.out.println(r1);
		System.out.println(r2);
		System.out.println(c2);
		System.out.println();
		r2.pluss();
		c2.pluss();
		r1.pluss();
		System.out.println(r1);
		System.out.println(r2);
		System.out.println(c2);

	}

}
