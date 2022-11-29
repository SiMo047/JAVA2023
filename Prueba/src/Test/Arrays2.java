package Test;

public class Arrays2 {

	public static void main(String[] args) {
		
		
		int numeroale[] = new int[15]; 
		
		
		
		for (int i=0 ; i<numeroale.length; i++) {
			numeroale[i]= (int)(Math.random()*100)+1; 
		}
		
		
		int total =0 ; 
		for (int i =0 ; i<numeroale.length; i++) {
			if (numeroale[i]%2!=0) {
				total+=numeroale[i]; 
			}
		}
		System.out.print("[");
		for (int i=0 ; i<numeroale.length; i++ ) {
			
			if( i!= numeroale.length - 1 ) {
			
			System.out.print(numeroale[i]+", ");
			
		}
		}
			System.out.print("]");
		System.out.println(total);

	
		
	}

}
