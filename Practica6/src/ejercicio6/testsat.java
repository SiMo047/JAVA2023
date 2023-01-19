package ejercicio6;

public class testsat {

	public static void main(String[] args) {

		satelite sat1 = new satelite(); 
		
		sat1.variAltura(+20);
		System.out.println(sat1.enOrbita());
		sat1.variAltura(-19);
		System.out.println(sat1.enOrbita());
		
		sat1.setPosicion(2.3, -12.0, 25.0);
		
		sat1.variaPosicion(2.5, 34.0);
		
		sat1.printPosicion();
		
	}

}
