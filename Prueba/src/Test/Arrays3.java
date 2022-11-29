package Test;

public class Arrays3 {
	
	public static boolean esprimo(int numero) {
		boolean primo=true ; 
		
		for (int i=2 ; i<numero ; i++ ) {
			if (numero % i ==0) {
				primo = true ; 
				break ; 
			}
		}
	return primo ; 
	}
	

	public static void main(String[] args) {
	
		int vector[] = new int[100]; 
		
		for (int i=0 ; i<vector.length; i++) {
			vector[i]= (int)(Math.random()*50)+1; 
		}
		
		
		System.out.print("[");
		for (int i=0 ; i<vector.length; i++ ) {
			
			if( i!= vector.length - 1 ) {
			
			System.out.print(vector[i]+", ");
			
		}
		}
			System.out.print("]");
			
			int total = 0 ; 
		for (int i =0 ; i<vector.length ; i++) {
			if (esprimo(vector[i])) {
				total += vector[i]; 
				System.out.println("Este es primo "+ vector[i]);
			}
		}	
			
		System.out.println("El total es "+ total );
			
			

	}

}
