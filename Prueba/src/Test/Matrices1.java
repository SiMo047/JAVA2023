package Test;

public class Matrices1 {

	public static void main(String[] args) {

		//pruebaa
		int matriz[][]= new int[5][10]; 
		
		for (int i=0 ; i<matriz.length; i++) {
			for(int j =0 ; i<matriz[0].length;j++) {
				matriz[i][j]=(int)(Math.random()*10)+1; 
			}
		}
		
		for (int i=0 ; i<matriz.length; i++) {
			for(int j =0 ; i<matriz[0].length;j++) {
				System.out.println(matriz[i][j]);
			}
			
		}
		
		System.out.println("hola");
		
		
	}

}
