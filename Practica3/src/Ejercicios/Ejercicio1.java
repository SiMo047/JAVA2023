package Ejercicios;

public class Ejercicio1 {

	public static int mayor( int a,int b,int c ) {
		
		int mayor=a; 
		
		
		
		if (mayor<b) {
			mayor=b; 
			if (mayor<c) {
				mayor=c ; 
			}
		}
		
		
		return mayor;
		
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int m; 
		
		m= mayor(230,90,100); 
		System.out.println(m);
		
		int a=4 ,b=8, c=10 ;
		
	
	
	

		
	}

}
