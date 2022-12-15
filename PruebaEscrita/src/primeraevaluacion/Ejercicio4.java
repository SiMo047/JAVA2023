package primeraevaluacion;

import java.util.Scanner;

public class Ejercicio4 {
	public static void pintarmatriz (char matriz[][]) {
		
		for (int i =0 ; i<matriz.length;i++) {
			
			for (int j=0 ;j <matriz[i].length;j++) {
				
				matriz[i][j]='.';

				if ((i==0)||(i == matriz.length-1)) {
					matriz[i][j]='-';
				}
				
				if ((j==0)||(j==matriz[i].length-1)) {
					matriz[i][j]='|';
				
				}
				matriz[0][0]='@';
			
				
			
				System.out.print(matriz [i][j]);
			}
			System.out.println(" ");
		}
	}

	public static void main(String[] args) {

		char matriz[][]= new char [20][20];
	
	
	
	pintarmatriz(matriz);
	
	int opcion=0; 
	Scanner sc=new Scanner (System.in);
	
	do {
		System.out.println("Introduce una opcion");
		System.out.println("1.Derecha");
		System.out.println("2.Izquierda");
		System.out.println("3.Abajo");
		System.out.println("4.Arriba");
		opcion=Integer.parseInt(sc.nextLine());
		
		switch (opcion) {
		case 1: {
			
			
		}break;
		case 2: {
					
					
				}break;
		case 3: {
			
			
		}break;
		case 4: {
			
			
		}break;
		
		default:
			throw new IllegalArgumentException("Unexpected value: " + opcion);
		}
	}while(opcion!=5);
	
	
	
	}

}
