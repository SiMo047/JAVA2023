package Ejercicio1plus;

public class test {

	public static void main(String[] args) {

		
		
			MozoAlmacen mz1 = new MozoAlmacen ("Jose",19,1200,2,2); 
			MozoAlmacen mz2 = new MozoAlmacen ("JJ",31,1200,5,1);
			
			Repartidor r1 = new Repartidor ("Manu" ,21,1500,"zona3",0); 
			Repartidor r2 = new Repartidor ("MM" ,22,1500,"zona3",3); 
			
			mz1.pluss(); 
			mz2.pluss(); 
			r1.pluss(); 
			r2.pluss(); 
			
			System.out.println(mz1);
			System.out.println(mz2);
			System.out.println(r1);
			System.out.println(r2);
			
		
	}

}
