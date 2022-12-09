package Ejercicios;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner (System.in); 
		
		int array[]= new int[10];
		int acum=0 ; 
		
		System.out.println("introduce 10 numeros");
/*rellenar vector */
    for (int i=0 ; i<array.length ; i++) {
    	int num = Integer.parseInt(sc.nextLine()); 
    	
    	array[i]=num ; 
    }
 
    int menor=array[0];
	int mayor=array[0];
    /*pintar vector y sumar todos sus datos y sacar el menor y el mayor  */
    for (int i=0 ; i<array.length ;i++) {
    	System.out.print(array[i]+" ");
    	 
    	acum+=array[i];
    	
    	
    	if (menor>=array[i]) {
    		menor=array[i]; 
    	}
    	if(mayor<=array[i]) {
    		mayor=array[i]; 
    	}
    }
    System.out.println();
    System.out.println("suma de los numeros introducidos es "+acum);
	System.out.println("media ="+acum/10);
	System.out.println("El menor es "+menor);
	System.out.println("El mayor es "+mayor);
	
	}

}
