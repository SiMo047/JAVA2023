package Ejercicio7;

import java.util.ArrayList;

public class Agenda {

	
	private ArrayList<Contacto>agenda ;

	/*constructor que crea a su vez el array */
	
	public Agenda() {
	
		this.agenda= new ArrayList<>(); 
	}
	
	
	/*metodo que devuelve true si el contacto que se le pasa existe y false si no esta en el array */
	
	public boolean existeContacto(Contacto obj ) {
		
		if ( agenda.indexOf(obj)>=0) {
			return true ;
		}else {
			return false ; 
		}
		
		
	}
	
	/*metodo añade contacto si no esta en el array */
	public void addContacto (Contacto obj ) {
		
		if ( agenda.indexOf(obj)<0) {
			agenda.add(obj);
		}
	}
		
	
	public String listarContactos() {
		
		StringBuilder sp = new StringBuilder();
		
		sp.append("AGENDA");
		sp.append("\n");
		sp.append("--------");
		sp.append("\n");
		
		for( Contacto c : this.agenda) {
			sp.append(c);
			sp.append("\n");
		}
		sp.append("\n");
		return sp.toString();
		
	}
	
	public int buscarContacto (String nom) {
		
		for (Contacto c : this.agenda) {
			if ( c.getNombre()==nom) {
				return c.getNumero();
			}
		}
		return 0;
	}
	
	
	public void eliminarContacto (String nom) {
	
		Contacto copia = new Contacto (nom,0000);
		
		int posicion= agenda.indexOf(copia);

		agenda.remove(posicion);
	
	}
	
		
	}


	
	

