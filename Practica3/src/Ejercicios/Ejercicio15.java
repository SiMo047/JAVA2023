package Ejercicios;

import java.util.Scanner;

public class Ejercicio15 {

	public static void main(String[] args) {
	
		
Scanner sc = new Scanner(System.in); 



System.out.println("Introduce numero de filas ");
		
int num = Integer.parseInt(sc.nextLine()); 


for (int i=1; i<=num ; i++) {
	
		for (int j=1 ; j<=num-i ; j++) {
			System.out.print(" ");
		}
		for (int j=1 ; j<=i ; j++) {
			System.out.print("*");
		}
		
		for (int j=1 ; j<=i-1 ; j++) {
			System.out.print("*");
		}
		
	System.out.println();
}
		

	}

}
