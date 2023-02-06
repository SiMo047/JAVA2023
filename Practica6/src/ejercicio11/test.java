package ejercicio11;

import java.util.Scanner;

public class test {

	public static void main(String[] args) throws Exception {

		
	
		
	Robot rb1 = new Robot (2,1); 
	

	

	/*??*/
	rb1.Abajo();
	/*^^^^^^^*/
	

	rb1.Derrecha();	
	rb1.Arriba();
	

	

	
	System.out.println(rb1.getContadorPasos());


		System.out.println("Posicion actual "+"("+rb1.getPosicionX()+","+rb1.getPosicionY()+")");
	}

}
