package Test;

public class Do {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	/*pintar decenas del 1 al 1000 */
		
		
		int numero=1 ; 
		do {
			numero++;
			if (!(numero%10==0)){continue;}
			System.out.println(numero);
			
		}while (numero<1000);
		
	
	
	
	
	/*sumar impares del 1 al 1000*/
	
	
	for (int i=1 ; i<1000;i+=2) {
		System.out.println(i);
	}

	}
}
