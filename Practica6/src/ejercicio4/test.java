package ejercicio4;

public class test {

	public static void main(String[] args) {

		finanzas f1 = new finanzas (0.92); 
		
		f1.setCambio(1.35); 
		
		System.out.println(f1.getCambio());
		
		System.out.println(f1.dolaresToEuros(10));
		
		System.out.println(f1.eurosToDolares(20));
	}

}
