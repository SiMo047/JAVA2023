package Examen2022;

import java.util.ArrayList;

public class PrimeVideo {

	
	private ArrayList<Multimedia>catalogo;
	private ArrayList<Cliente>suscriptores;
	private double ganancias=0 ;
	
	
	
	public PrimeVideo() {
		super();
		
		this.catalogo= new ArrayList<>();
		this.suscriptores= new ArrayList<>();
		this.ganancias=0;
	} 
	
	
	
	public void addSuscriptores (Cliente c) {
		
		int posicion = this.suscriptores.indexOf(c);
		
		if(posicion<0) {
			this.suscriptores.add(c);
		}
	}
	
	public void addMultimedia (Multimedia m ) {
	int posicion = this.catalogo.indexOf(m);
		
		if(posicion<0) {
			this.catalogo.add(m);
		}
	}
	
	public void ver (Multimedia m , Cliente c ) {
		
		int posicion = this.suscriptores.indexOf(c);
		int posicionM = this.catalogo.indexOf(m);
		
		/*nos aseguramos de que el cliente es suscriptor */
		if (posicion>=0) {
			
			/*si el cliente no es pro */
			if (this.suscriptores.get(posicion).esPro()==false) {
				/*obtenemos sus preciomensual */
				double pm=this.suscriptores.get(posicion).getPrecioMensual();
					/*comprobamos que la multimedia es plus */
				if (this.catalogo.get(posicionM).isPlus()==true) {
					/*si multimedia es plus entonces al cliente se le cobra lo que vale la multimedia */
					this.suscriptores.get(posicion).setPrecioMensual(pm+this.catalogo.get(posicionM).getPrecio());
					
					this.ganancias+=this.catalogo.get(posicionM).getPrecio();
				}
				
			
			}
		}
		
	}
	
	public double getGanancias () {
		return this.ganancias;
	}
	
	
	
	
}
