package Ejercicio5;

public class test {

	public static void main(String[] args) {

		
		Producto p1 = new Producto (001 , "Movil", 400,90,250,0.25);
		
		Producto p2 = new Producto (002 , "Tablet", 350,95,150,0.15);
		
		System.out.println(p1);
		System.out.println(p2);
		
	
		p1.vender(50); 
		System.out.println(p1);
		
		
		System.out.println(p2.reponer());
		System.out.println(p2);
		
	
		
	
	}

}
