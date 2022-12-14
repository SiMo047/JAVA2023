package Ejercicios;

import java.util.Scanner;

public class Ejercicio13 {
	
	public static void pintarmatriz (int matriz[][]) {
		
		for (int i =0 ; i<matriz.length;i++) {
			int suma =0 ;
			for (int j=0 ;j <matriz[i].length;j++) {
				System.out.print(matriz [i][j]+"|");
				suma=suma+matriz[i][j];
				}
			System.out.print("- suma -"+suma);
			System.out.println(" ");
		}
	}
	
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in); 
		int num ; 
		int matriz[][]= new int [3][4];
		
		for (int i =0 ; i<matriz.length;i++) {
			System.out.println("introduce numeros para la fila "+ i );
			
			for (int j=0 ;j <matriz[0].length;j++) {
				num = Integer.parseInt(sc.nextLine()); 
				matriz[i][j]=num ;
				
			}
			
			
		}
		
		pintarmatriz(matriz ); 
		
	}

}
