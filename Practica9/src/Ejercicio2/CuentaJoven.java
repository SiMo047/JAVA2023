package Ejercicio2;

public class CuentaJoven extends CuentaBancaria {

	
	private double modifComisiones =0.25;

	
	
	/*constructor */
	public CuentaJoven(double saldo, double comisionesAnual) {
		super(saldo, false, false, comisionesAnual);
		this.comisionesAnual = this.comisionesAnual * this.modifComisiones;
	} 
	
	/*constructor copia */
	public CuentaJoven ( CuentaJoven otra) {
		super(otra); 
	}

	
	
	/*get y set*/
	
	public double getModifComisiones() {
		return modifComisiones;
	}

	public void setModifComisiones(double modifComisiones) {
		this.modifComisiones = modifComisiones;
	}
	
	
	
	
	
}
