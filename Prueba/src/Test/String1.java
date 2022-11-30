package Test;

public class String1 {

	public static void main(String[] args) {
	
		String palabra = new String("Perro"); 
		
		String vocales = new String("aeiouáéíóúAEIOU"); 
		
		int contador=0; 
		for (int i =0 ; i<palabra.length(); i++) {
		
			
			if ( vocales.indexOf(palabra.charAt(i)) >=0 ) {
				contador++ ;
				
			}
		}
		
		System.out.println("La palabra "+palabra+" tiene "+contador+" vocales");
		

	}

} 
