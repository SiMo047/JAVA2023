package Ejercicios;

public class Ejercicio16 {
	
	/*funcion para comprobar repetidos */
	
	public static boolean repetidos ( int matriz[][], int num) {
		
		for (int i =0 ; i<matriz.length;i++) {
			
			for (int j=0 ;j <matriz[i].length;j++) {
			 
				if (matriz[i][j]==num) {
					return true ;
				} 
				
				
				}
		
			
		}
		return false;
		
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
		
		int matriz [][]= new int [3][3];
		
		
		for (int i =0 ; i<matriz.length;i++) {
			for (int j=0 ;j <matriz[i].length;j++) {
		
				int num = (int)(Math.random()*10+1);
			
				/*bucle para la condicion */
				while ( repetidos(matriz,num)) {
					num = (int)(Math.random()*10+1);
				}
				
				matriz[i][j]=num; 
				
				
				}
		}
		
		pintarmatriz(matriz); 

	}

}
