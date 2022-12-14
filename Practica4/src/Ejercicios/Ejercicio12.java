package Ejercicios;

public class Ejercicio12 {
	
	public static void pintarmatriz (int matriz[][]) {
	
		for (int i =0 ; i<matriz.length;i++) {
			
			for (int j=0 ;j <matriz[0].length;j++) {
				System.out.print(matriz [i][j]+"|");
			}
			System.out.println(" ");
		}
	}
	
	public static void main(String[] args) {

		int matriz[][]= new int[8][6];
		
		
		
	for (int i =0 ; i<matriz.length;i++) {
			
			for (int j=0 ;j <matriz[i].length;j++) {
				
			if ((i==0) || (j==0) || (i == matriz.length-1)|| (j==matriz[0].length-1))  {
				
				matriz[i][j]=1;
			}
				
			}
			
		}
		
	pintarmatriz (matriz );
		
		
	}

}
