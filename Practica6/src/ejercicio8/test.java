package ejercicio8;

public class test {

	public static void main(String[] args) {

		
		
		
		incidencia in1 = new incidencia("Rota la puerta", "");
		incidencia in2 = new incidencia("Roto el ascensor", "");
		
		System.out.println(in1);
		System.out.println(in2);
		
		System.out.println(incidencia.getPendiente());
		
		in1.setEstado("En proceso");
		in1.resuelve("Reiniciando el sistema");
		in2.resuelve("Cambio de puerta ");
	
		
		System.out.println(incidencia.getPendiente());
		
		System.out.println(in1);
		System.out.println(in2);

	
	}

}
