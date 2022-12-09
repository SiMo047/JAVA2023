package Ejercicios;

import java.util.Scanner;

public class Ejercicio3 {
/*funcion pintar vector */
	public static void pintarvector(int array[]) {
		
		for (int i =0 ; i<array.length; i++) {
			System.out.print(array[i]+" ");
		}
	}
	
/*funcion media */
	public static void media (int array[]) {
		
		int acum=0 ; 
		for (int i=0 ; i<array.length;i++) {
			acum+=array[i]; 
		}
		System.out.println("Suma de todos los numeros "+acum);
		acum= acum/array.length; 
		System.out.println("La media es "+acum);
	}
	
	/*funcion mayor */
	public static void mayor (int array[]) {
		int mayor = array[0]; 
		
		for (int i = 0 ; i<array.length; i++) {
			if (mayor<=array[i]) {
				mayor=array[i]; 
			}
		}
		System.out.println("El mayor es "+mayor);
	}
	/*funcion menor */
	public static void menor (int array[]) {
		int menor = array[0]; 
		
		for (int i = 0 ; i<array.length; i++) {
			if (menor>=array[i]) {
				menor=array[i]; 
			}
		}
		System.out.println("El menor es "+menor);
	}

	/*    MAIN     */
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in); 
		
		int arrayy[]= new int[10];
		int acum=0 ; 
		
		System.out.println("introduce 10 numeros");
/*rellenar vector */
    for (int i=0 ; i<arrayy.length ; i++) {
    	int num = Integer.parseInt(sc.nextLine()); 
    	
    	arrayy[i]=num ; 
    }
	

    pintarvector(arrayy);
    System.out.println();
    media(arrayy); 
    System.out.println();
    mayor(arrayy); 
    System.out.println();
    menor(arrayy); 
	}

}
