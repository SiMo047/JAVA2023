package Ejercicios;

import java.util.Scanner ; 

public class Ejercicio9 {

	public static int factorial (int num) {
	
		int facto=1 ; 
		for(int i=1 ; i <= num ; i++) {
			
			
			
			facto=facto*i ; 
			
		}
		
		
		
		num = facto; 
		return num;
		
	}
	
	
	public static void main(String[] args) {
		
		  Scanner sc = new Scanner ( System.in ); 
		
		  int num ; 
		  
		System.out.println ( "Escribe un numero "); 
		num = Integer.parseInt(sc.nextLine()); 
		
		
		System.out.println("El factorial de "+num+" es "+ factorial(num));

	}

}
