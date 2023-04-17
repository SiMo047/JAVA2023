package Ejercicio4;

import java.util.ArrayList;

public class Taller {


private ArrayList<Vehiculo> coches ; 


public Taller() {
	super();
	this.coches=new ArrayList<>();
}


public void ingresarVehiculo(Vehiculo v) {
	
	if (this.coches.indexOf(v)<0) {
		this.coches.add(v);
	}
	
}


public void Reparado(Vehiculo v ) {
	
	
		for (Vehiculo v2 : this.coches) {
			if (v2.equals(v)) {
				v2.setEstado(true);
			}	else { 
				System.out.println("vehiculo no encontrado");
				}
			}
	}


public void eliminarVehiculo (Vehiculo v) {
	
}
}


	

