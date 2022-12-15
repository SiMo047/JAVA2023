package Ejercicios;

import java.util.Arrays;

public class Ejercicio17 {
	/*funcion transpone matriz */
	
	public static int [][] traspomatriz (int matriz[][]) {
		
		int longx = matriz.length;
		int longy = matriz[0].length; 
		
		int matriztras[][]= new int [longy][longx];
		
		for (int i =0 ; i<matriz.length;i++) {
			for(int j =0 ; j<matriz[i].length; j++) {
				matriztras[j][i]=matriz[i][j]; 
				
			}
		}
		
		return matriztras ; 
	}
	
	public static void pintarmatriz (int matriz[][]) {
		
		for (int i =0 ; i<matriz.length;i++) {
		
			for (int j=0 ;j <matriz[i].length;j++) {
			 
				System.out.print(matriz [i][j]+"|");
				
				
				}
		
			System.out.println(" ");
		}
	
	}

	

	public static void main(String[] args) {

	
		int  matriz[][] = new int [5][5];
		
		
		
		for (int i =0 ; i<matriz.length;i++) {
			for (int j=0 ;j <matriz[i].length;j++) {
		
				int num = (int)(Math.random()*10+1);
			
				matriz[i][j]=num; 
				
				
				}
		}
		
		pintarmatriz(matriz); 
		System.out.println();
		System.out.println("Matriz ordenada por filas ");
		/* ordena la matriz por filas con array sort */
		for(int i=0; i<matriz.length; i++) {
			Arrays.sort(matriz[i]);
		}
		
		pintarmatriz(matriz); 
		
		System.out.println();
		System.out.println("Matriz ordenada por columnas ");
		/*guardamos la matriz traspuesta en una nueva matriz */
		int matriztras[][]= traspomatriz(matriz);
		
		/*ordenar matriz traspuesta por filas */
		
		for (int i=0 ; i<matriztras.length;i++) {
			Arrays.sort(matriztras[i]);
		}
		
		/*vuelve a trasponer la matriz ya traspuesta y ordenada en una nueva matriz o en la que ya tenias */
		matriz = traspomatriz(matriztras);
		pintarmatriz(matriz);
		
	}

}
