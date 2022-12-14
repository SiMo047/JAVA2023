package Test;

public class Ej3exam {
	

	
	public static void pintarmatriz (int matriz[][]) {
		
		for (int i =0 ; i<matriz.length;i++) {
		
			for (int j=0 ;j <matriz[i].length;j++) {
				System.out.print(matriz [i][j]+"|");
				
				}
		
			System.out.println(" ");
		}
	}
	
	public static int sumafilas (int matriz[][] , int num ) {
		
		int suma=0 ; 
		
		for(int i = 0 ; i<=num;i++) {
		suma=0; 
			for (int j =0 ; j<matriz[i].length;j++) {
				suma = suma+matriz[i][j]; 
				
			}
		}
		System.out.println();
		System.out.println("la suma de la fila "+num+" es "+suma);
		return suma;
			
	}
	
	public static int sumacolum (int matriz[][] , int num) {
		int suma =0; 
	
		for(int i = 0 ; i<matriz.length;i++) {
		 
				for (int j =num ; j<=num;j++) {
					suma = suma+ matriz[i][num];
					
				}
			}
		
		System.out.println("la suma de la columna "+num+ " es "+suma);
		return suma;
		
	}
	
	public static int sumadiago (int matriz[][]) {
		
		int suma=0 ;
		
		for(int i = 0 ; i<matriz.length;i++) {
			 
			for (int j =0 ; j<=matriz[i].length;j++) {
				
				if (i==j) {
				suma = suma+ matriz[i][j];
				}
			}
		}
	
		System.out.println("la suma de la dioganal es "+suma);
		return suma;
		
	}
	
	public static void sumadigoin(int matriz[][]) {
		
	
		for (int j=matriz[0].length-1 ; j<=0;j++) {
			 
			for(int i =0 ; i<matriz.length;i++)	{
				
				System.out.print(matriz [j][i]+"|");
			}
			System.out.println(" ");
		}
		
		
	
	}	

	public static void main(String[] args) {

		
		int matriz[][]= new int [5][5]; 
		
		for(int i = 0 ; i<matriz.length;i++) {
			for (int j =0 ; j<matriz[i].length;j++) {
				matriz[i][j]= (int)(Math.random()*100+1);
			}
		}
		
		pintarmatriz(matriz);
		
		sumafilas(matriz,2);
		sumacolum(matriz,2);
		sumadiago(matriz);
		sumadigoin(matriz); 
		
	}

}
