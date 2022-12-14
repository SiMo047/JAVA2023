package Ejercicios;

import java.util.Scanner;

public class Ejercicio21 {

	public static void main(String[] args) {
	
		System.out.print ("Escribe un numero para comprobar si es primo ");
		Scanner sc = new Scanner (System.in); 
		
		 
		int num = Integer.parseInt(sc.nextLine()); 
		int cont=0 ; 
		
			for (int i=1 ; i<=num ; i++) {
				if (num%i==0) {
					cont++; 
			 
				}
			}
			     if (cont<=2) {
				 System.out.print("Es primo ");
		         }else {
		    	 System.out.print("No es primo");
		         }
		
		}

	}


