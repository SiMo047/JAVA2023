package Ejercicio2;

import java.util.Objects;

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
	
	/*to string */
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("CuentaBancaria [numeroCuenta=");
		builder.append(numeroCuenta);
		builder.append(", saldo=");
		builder.append(saldo);
		builder.append(", tieneTarjetaCredito=");
		builder.append(tieneTarjetaCredito);
		builder.append(", tieneTarjetaDebito=");
		builder.append(tieneTarjetaDebito);
		builder.append(", comisionesAnual=");
		builder.append(comisionesAnual);
		builder.append("]");
		return builder.toString();
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(numeroCuenta);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CuentaBancaria other = (CuentaBancaria) obj;
		return Objects.equals(numeroCuenta, other.numeroCuenta);
	}

	
	
	/*metodo generar numero cuenta bancaria 
	
	con este metodo generamos un numero de cuenta de forma alaetoria , utilizaremos el StringBuilder 
	ya que es una cadena larga de numeros aleatorios y al final lo convertimos a String con el toString
	 */
	



	private String generaNumeroCuenta() {
		StringBuilder sb = new StringBuilder (20); 
		
		for (int i=0 ; i<18;i++) {
			sb.append((int)(Math.random()*10)); 
		}
		
		return sb.toString(); 
	}
	
	/*metodo ingresar que aumentara el saldo segun el valor que le indiques */
	
	public void ingresar(double cantidad ) {
		if (cantidad >=0) {
			this.saldo= this.saldo+cantidad ; 
		}
	}
	
	
	/* metodo retirar este restara el saldo segun el valor que se le indique 
	 * y comprueba si es posible hacer la retirada 
	 */
	
	public boolean retirar(double cantidad ) {
		if ((this.saldo-cantidad)>=0) {
			this.saldo=this.saldo- cantidad ; 
			return true ; 
		}else {
			return false ;
		}
	} 

}
