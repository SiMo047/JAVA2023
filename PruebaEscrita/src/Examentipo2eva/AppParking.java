package Examentipo2eva;

public class AppParking {

	public static void main(String[] args) {

		
		Parking p1 = new Parking ();
		
		
		
		Coche c1 = new Coche ("4444","Mercedes",Combustible.ELECTRICO); 
		Furgoneta f1 = new Furgoneta ("5555", "FORD",5);
		
		
		p1.registrarEntradaVehiculo(f1); 
		p1.registrarEntradaVehiculo(c1); 
		
		
		System.out.println(p1.imprimeParking());
		
		for (Vehiculo v : p1.getVehiculos()) {
			System.out.println(v);
		}
		
		
	}

}
