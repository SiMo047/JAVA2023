package Ejercicios;

public class Ejercicio15 {
	
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
	int matriz1 [][]= new int [3][3];
	int matriz2 [][]= new int [3][3];
	
	/*rellenar matriz */
	for (int i =0 ; i<matriz.length;i++) {
		for (int j=0 ;j <matriz[i].length;j++) {
	
			int num = (int)(Math.random()*10+1);
			matriz[i][j]=num; 
			
			}
	}
	/*rellanar matriz1 */
	for (int i =0 ; i<matriz1.length;i++) {
		for (int j=0 ;j <matriz1[i].length;j++) {
	
			int num = (int)(Math.random()*10+1);
			matriz1[i][j]=num; 
			
			}
	}
	
	
	
	pintarmatriz(matriz); 
	System.out.println();
	pintarmatriz(matriz1); 
	System.out.println();
	
	System.out.println("La suma de las matrizes es la siguiente matriz ");
	
	for (int i =0 ; i<matriz.length;i++) {
		for (int j=0 ;j <matriz[i].length;j++) {
	
			matriz2[i][j]=matriz[i][j]+matriz1[i][j];			
			}
	}
	pintarmatriz(matriz2); 
	}

}
