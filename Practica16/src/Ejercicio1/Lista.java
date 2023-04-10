package Ejercicio1;

import java.util.ArrayList;

public class Lista {

	private ArrayList<Proceso>Procesos= new ArrayList<>();

	public Lista() {
		super();
		this.Procesos = new ArrayList<>();
	}
	
	/*Añade un elemento a la lista */
	
	public boolean meter(Proceso p) {
		if ( Procesos.add(p)) {
			return true ; 
		}else {
			return false;
		}
		
	}
	
	
	/*Devuelve el primer elemento de la lista y los elimina */
	
	public Proceso poll() {
	
		if (Procesos.isEmpty()==true ) {
			return null ;
		}else {
			return Procesos.remove(0);
		}
	}
	
	
	public Proceso peek() {
		if (Procesos.isEmpty()==true ) {
			return null ;
		}else {
			return Procesos.get(0);
		}
	}
	
	public String Listar() {
		StringBuffer sb = new StringBuffer();
		for ( Proceso p : this.Procesos) {
		
			
			sb.append(p);
			sb.append("\n");
			
		}
		return  sb.toString();
	}
}
