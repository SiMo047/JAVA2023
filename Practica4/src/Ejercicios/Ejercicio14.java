package Ejercicios;

import java.util.Scanner;

public class Ejercicio14 {
	
	public static void pintarmatriz (int matriz[][]) {
		
		for (int i =0 ; i<matriz.length;i++) {
		
			for (int j=0 ;j <matriz[i].length;j++) {
				System.out.print(matriz [i][j]+"|");
				
				}
		
			System.out.println(" ");
		}
	}
	

	public static void main(String[] args) {

		Scanner sc= new Scanner (System.in); 
		
		int matriz[][]= new int [5][3]; 
		
		int num ; 
		
		for (int i =0 ; i<matriz.length;i++) {
				System.out.println("introduce numero para la fila "+i);
			for (int j=0 ;j <matriz[0].length;j++) {
				num = Integer.parseInt(sc.nextLine()); 
				matriz[i][j]=num ;	
			}
		}
		pintarmatriz(matriz ); 
		
		int mayor = matriz[0][0];
		int menor = matriz[0][0]; 
		
		for (int i =0 ; i<matriz.length;i++) {
			for (int j=0 ;j <matriz[0].length;j++) {
				if (matriz[i][j]>=mayor) {
					mayor = matriz[i][j]; 
				}
				if ( matriz[i][j] <= menor) {
					menor= matriz[i][j]; 
				}
			}
		}
		
		System.out.println(menor +" "+mayor );
	}
}