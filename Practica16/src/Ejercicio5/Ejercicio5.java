package Ejercicio5;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Ejercicio5 {

	
	public static List <Integer> OrdenacionMezcla(List l1 , List l2 ){
		/*creamos un array donde introduciremos los valores ordenados*/
		ArrayList resultado = new ArrayList ();
		
		Collections.sort(l1);
		Collections.sort(l2);
		
		
		/*metemos las dos listas (l1,l2) en una cola (q1.q2)*/
		Queue<Integer> q1 = new LinkedList<>(l1);
		Queue<Integer> q2 = new LinkedList<>(l2);
		

	
		/*comprobamos con peek() que el primer elemento no es nulo en las dos colas*/ 
		while (q1.peek()!=null && q2.peek()!=null) {
			
			/*LAS COLAS YA ESTAN ORDENADAS */
			
			if (q1.peek()<q2.peek()) { /*se comprueba que el elemento de la cola1 es menor que el de la cola2*/
			resultado.add(q1.poll());/*con poll() sacamos el elemento y lo eliminamos */
			}else {
				resultado.add(q2.poll());
			}
			
		}
		
		if (q1.size()>0) {
			resultado.addAll(q1);
			
		}else {
			resultado.addAll(q2);
		}
				
		return resultado;
	}
	
	public static void main(String[] args) {

		
		List<Integer>l1 = Arrays.asList(1,2,3,9);
	 	List<Integer>l2 = Arrays.asList(4,5,37,4);
	 
	 	
	 	System.out.println(OrdenacionMezcla(l1,l2));
	 	
	}

}
