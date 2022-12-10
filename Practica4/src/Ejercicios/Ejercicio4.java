package Ejercicios;

import java.util.Scanner;

public class Ejercicio4 {
	/*pintar vector */
	public static void pintarvector(int array[]) {
		
		for (int i =0 ; i<array.length; i++) {
			System.out.print(array[i]+" ");
		}
	}

	public static void main(String[] args) {

		
	Scanner sc = new Scanner (System.in); 
		
		int array[]= new int[10];
		
System.out.println("introduce 10 numeros ");

for (int i = 0 ; i<array.length; i++) {
	int num = Integer.parseInt(sc.nextLine()); 
	array[i]= num ; 
}

pintarvector(array); 

System.out.println();
		
for (int i=9 ; i>=0 ;i--) {
	System.out.print(array[i]+" ");
}		
		
	}
	
}
