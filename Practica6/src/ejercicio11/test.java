package ejercicio11;

import java.util.Scanner;

public class test {

	public static void main(String[] args) throws Exception {

		
	
		
	Robot rb1 = new Robot (2,0); 
	

	

	/*??*/
	rb1.Abajo();
	/*^^^^^^^*/
	
	for(int i=0 ; i<3;i++) {
	rb1.Derrecha();	
	rb1.Arriba();
	}
	

	
	System.out.println(rb1.getContadorPasos());


		System.out.println("Posicion actual "+"("+rb1.getPosicionX()+","+rb1.getPosicionY()+")");
	}

}
