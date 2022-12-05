package Ejercicios;


import java.util.Scanner;


public class Ejercicio8 {

	public static void main(String[] args) {
		
		
		  Scanner sc = new Scanner ( System.in ); 
			int num ; 
			int  doble=0 , triple=0  ; 
			System.out.println ( "Escribe un numero "); 
			num =Integer.parseInt(sc.nextLine()) ; 		
			

			
			for (int i=0 ; i<num ;i++) {
				
			
				System.out.println ( i ); 
			 
				doble = i*2 ; 
				triple = i*3; 
				System.out.println ("El doble de este numero "+doble); 
				System.out.println ("El triple  de este numero "+triple); 
				
				
				
			}	
	     
	}

}