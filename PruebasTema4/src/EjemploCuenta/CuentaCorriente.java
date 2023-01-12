package EjemploCuenta;

public class CuentaCorriente {

	private String numCuenta ; 
	private double saldo ;
	
	/*contructor */
	
	public CuentaCorriente( double saldo) {
		super();
		this.numCuenta = generarCuenta();
		this.saldo = saldo;
	}

	
	
	/*get y set */
	
	public String getNumCuenta() {
		return numCuenta;
	}

	public void setNumCuenta(String numCuenta) {
		this.numCuenta = numCuenta;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}




	/*string*/
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("CuentaCorriente [numCuenta=");
		builder.append(numCuenta);
		builder.append(", saldo=");
		builder.append(saldo);
		builder.append("]");
		return builder.toString();
	}
	
	
	/*metodo de generar cuenta */
	private String generarCuenta() {
		StringBuilder builder = new StringBuilder(); 
		builder.append("ES00");
		int digito=0; 
		
		for (int i =0 ; i<15;i++) {
			digito= (int) (Math.random()*10); 
			
			builder.append(digito); 
		}
		
		return builder.toString();
	}
	
	/*metodo de sumar dinero al saldo */
	public void  ingreso(double cantidad) {
		this.saldo += cantidad ; 
	}
	
	/*cargo */
	

	
	
}
