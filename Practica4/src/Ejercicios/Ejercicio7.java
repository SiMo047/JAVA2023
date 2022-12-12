package Ejercicios;

import java.util.Scanner;

public class Ejercicio7 {
	/*funcion para pintar array */
	public static void pintarvector(int array[]) {
		
		for (int i =0 ; i<array.length; i++) {
			System.out.print(array[i]+" ");
		}
	}


	public static void main(String[] args) {


	Scanner sc = new Scanner (System.in); 
		
		int array[] = new int[10];
	
		System.out.println("introduce 8 numeros ");
		
		for (int i=0 ; i<8 ;i++) {
			int num = Integer.parseInt(sc.nextLine()); 
			array[i]=num ; 
		}
	
		pintarvector(array); 
		
		System.out.println();
		System.out.println("introduce un numero ");
		int num = Integer.parseInt(sc.nextLine()); 
		System.out.println();
		System.out.println("indica la posicion en la que quieras introducirlo ");
		int posicion = Integer.parseInt(sc.nextLine()); 
		int primero ; 
		primero = array[0]; 
		
		for(int i = posicion-1 ; i <=0;i--) {
			array[i-1]=array[i];
		}
		
		array[9]=primero;
		array[posicion]= num ; 
	 pintarvector(array); 
	}

}
