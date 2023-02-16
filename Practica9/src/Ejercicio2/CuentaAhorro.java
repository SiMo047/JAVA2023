package Ejercicio2;

public class CuentaAhorro extends CuentaBancaria {

	
	private double tipoInteres ; 
	private double modifComisiones = 0.5;
	
	
	/*constructor */
	
	public CuentaAhorro(double saldo ,double tipoInteres, double comisionesAnual) {
		super(saldo, false, false, comisionesAnual);
		this.tipoInteres = tipoInteres;
		this.comisionesAnual = this.comisionesAnual * this.modifComisiones;
	}


/*constructor copia */

	public CuentaAhorro(CuentaAhorro otra ) {
		super(otra);
		
		this.tipoInteres=otra.tipoInteres; 
	}


	
	
	/*get y set */
	
	
	public double getTipoInteres() {
		return tipoInteres;
	}


	public void setTipoInteres(double tipoInteres) {
		this.tipoInteres = tipoInteres;
	}


	public double getModifComisiones() {
		return modifComisiones;
	}


	public void setModifComisiones(double modifComisiones) {
		this.modifComisiones = modifComisiones;
	} 
	

	
	
	
	
}
