package Ejercicios;

public class Ejercicio1 {

	public static int mayor( int a,int b,int c ) {
		
		int mayor=0; 
		
		
		
		if (a>mayor) {
			mayor=a ; 
		}else if(b>mayor) {
			mayor=b; 
		}else if (c>mayor) {
			mayor=c; 
		}
		
		
		
		return mayor;
		
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int m; 
		
		m= mayor(13,90,100); 
		System.out.println(m);
	

		
	}

}
