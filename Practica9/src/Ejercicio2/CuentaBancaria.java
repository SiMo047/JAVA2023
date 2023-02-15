package Ejercicio2;

public class CuentaBancaria {

	protected String numeroCuenta;
	protected double saldo;
	protected boolean tieneTarjetaCredito;
	protected boolean tieneTarjetaDebito;
	protected double comisionesAnual;
	
	
	/*constructor */
	
	public CuentaBancaria(double saldo, boolean tieneTarjetaCredito, boolean tieneTarjetaDebito,
			double comisionesAnual) {
		super();
		this.numeroCuenta = generaNumeroCuenta(); 
		this.saldo = saldo;
		this.tieneTarjetaCredito = tieneTarjetaCredito;
		this.tieneTarjetaDebito = tieneTarjetaDebito;
		this.comisionesAnual = comisionesAnual;
	}

	/*constructor copia */
	public CuentaBancaria(CuentaBancaria otra ) {
		
		this.numeroCuenta = otra.numeroCuenta; 
		this.saldo=otra.saldo; 
		this.tieneTarjetaCredito=otra.tieneTarjetaCredito; 
		this.tieneTarjetaDebito=otra.tieneTarjetaDebito; 
		this.comisionesAnual= otra.comisionesAnual; 
	}

	/*get y set */
	public String getNumeroCuenta() {
		return numeroCuenta;
	}

	public void setNumeroCuenta(String numeroCuenta) {
		this.numeroCuenta = numeroCuenta;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public boolean isTieneTarjetaCredito() {
		return tieneTarjetaCredito;
	}

	public void setTieneTarjetaCredito(boolean tieneTarjetaCredito) {
		this.tieneTarjetaCredito = tieneTarjetaCredito;
	}

	public boolean isTieneTarjetaDebito() {
		return tieneTarjetaDebito;
	}

	public void setTieneTarjetaDebito(boolean tieneTarjetaDebito) {
		this.tieneTarjetaDebito = tieneTarjetaDebito;
	}

	public double getComisionesAnual() {
		return comisionesAnual;
	}

	public void setComisionesAnual(double comisionesAnual) {
		this.comisionesAnual = comisionesAnual;
	}
	
	/*metodo generar numero cuenta bancaria */
	
	/*con este metodo generamos un numero de cuenta de forma alaetoria , utilizaremos el StringBuilder 
	 *ya que es una cadena larga de numeros aleatorios y al final se convierte a String con el toString
	 */
	
	private String generaNumeroCuenta() {
		StringBuilder sb = new StringBuilder (20); 
		
		for (int i=0 ; i<18;i++) {
			sb.append((int)(Math.random()*10)); 
		}
		
		return sb.toString(); 
	}
	
	
	

}
