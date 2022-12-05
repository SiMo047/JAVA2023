package Ejercicios;

import java.util.Scanner;

public class Ejercicio18 {

	public static void main(String[] args) {

		
		Scanner sc= new Scanner (System.in); 
		int num =1 , num2; 
		int mayor=0 , menor =0 ; 
		do {
			   num = Integer.parseInt(sc.nextLine()); 
			  
			   if ( num>=mayor) {
				   mayor=num ; 
			   }
			   if (num<menor && num!=0 ) {
				   menor = num; 
			   }
			 
			 
		}while(num!=0);
		  System.out.println( mayor +" "+menor  );
		
		
	}

}
