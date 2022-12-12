package Ejercicios;

public class Ejercicio11 {
	
	public static void pintarmatriz (int matriz[][]) {
	
		for (int i =0 ; i<matriz.length;i++) {
			
			for (int j=0 ;j <matriz[0].length;j++) {
				System.out.print(matriz [i][j]+"|");
			}
			System.out.println(" ");
		}
	}

	public static void main(String[] args) {
		int num=1 ;
		
		int  matriz[][] = new int [5][5]; 
		
		for (int i =0 ; i<matriz.length;i++) {
			for(int j =0 ; j<matriz[0].length;j++) {
				
					if (matriz[i][j]== 0) {
						matriz[i][j]=num ; 
					}
				
				
			}
		}
		pintarmatriz(matriz);
	}

}
