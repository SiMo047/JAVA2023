package Ejercicio2;

import java.util.ArrayList;

public class Banco {

	private String nombreBanco; 
	private ArrayList<CuentaBancaria> cuentas ;
	
	
	/*constructor inicializando el array */
	public Banco(String nombreBanco) {
		super();
		this.nombreBanco = nombreBanco;
		this.cuentas = new ArrayList<>();
	} 
	
	
	/*metodo añadir cuenta en el array */
	
	public void añadirCuenta (CuentaBancaria cuenta) {
		int posicion = cuentas.indexOf(cuenta); 
		
		if (posicion <0 ) {
			cuentas.add(cuenta); 
		}
	}


	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Banco = ");
		builder.append(nombreBanco);
		builder.append("\n");
		
		for(CuentaBancaria cb: this.cuentas) {
			builder.append(cb.toString());
			builder.append("\n");
		}
		
		return builder.toString();
	}
	
	
	public CuentaBancaria getCuenta(String numeroCuenta) {
		for (CuentaBancaria cuenta : this.cuentas) {
			if (cuenta.getNumeroCuenta().equals(numeroCuenta)) {
				return cuenta ; 
			}
		}
		return null;
	}
	
	
	
	
	
	
}
