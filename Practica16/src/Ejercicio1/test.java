package Ejercicio1;



public class test {

	public static void main(String[] args) {

		
		Proceso p1 = new Proceso (001,"J","cpu4","ram2",true);
		Proceso p2 = new Proceso (002,"R","cpu5","ram4",true);
		Lista l1 = new Lista ();
	
		System.out.println(l1.meter(p2));
		
		System.out.println(l1.meter(p1));
		
		System.out.println(l1.poll());
		
		
		System.out.println(l1.peek());
		
		System.out.println("----------------");
		
		System.out.println(l1.Listar());
		
	
		
	}
	
	
	
}
