package Ejercicios;

import java.util.Scanner;

public class Ejercicio5 {
	
	public static void pintarvector(int array[]) {
		
		for (int i =0 ; i<array.length; i++) {
			System.out.print(array[i]+" ");
		}
	}

	public static void main(String[] args) {

		
		Scanner sc = new Scanner (System.in); 
		
		int array1[] = new int[5];
		int array2[] = new int[5]; 
		String array3[]= new String [5]; 
		
		System.out.println("introduce 5 numeros");
		
		for(int i =0 ; i<array1.length;i++) {
			int num = Integer.parseInt(sc.nextLine()); 
			array1[i]=num ; 
		}
		pintarvector(array1);
		
		System.out.println();
		
		System.out.println("vuelve a introducir 5 numeros(que sean distintos) ");
		
		for(int i =0 ; i<array2.length;i++) {
			int num = Integer.parseInt(sc.nextLine()); 
			array2[i]= num; 
		}
		pintarvector(array2); 
		
		/*juntamos el array1 y el array2 , convirtiendo los enteros  en String*/
		
		for (int i=0 ; i<array3.length; i++) {
			String srt = String.valueOf(array1[i]); 
			String srt1 = String.valueOf(array2[i]); 
			array3[i]=srt+srt1;
		}
		System.out.println();
		System.out.println("Estos son los dos array juntos ");
		
		for (int i =0 ; i<array3.length; i++) {
			System.out.print(array3[i]+" ");
		}
	}

}
