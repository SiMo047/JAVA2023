package Ejercicio2;

public class test {

	public static void main(String[] args) {

		Banco elbanco = new Banco ("BC"); 
		
		
		CuentaAhorro ca1 = new CuentaAhorro (2000,40,0.10); 
		CuentaCorriente cc1 = new CuentaCorriente (2500,30); 
		CuentaJoven cj1= new CuentaJoven (1400, 20); 
		
		
		/*añadimos las cuentas al banco */
		
		elbanco.añadirCuenta(ca1);
		elbanco.añadirCuenta(cc1);
		elbanco.añadirCuenta(cj1);
		
		cj1.ingresar(1000);
		
		System.out.println(elbanco);
		
		
		System.out.println(elbanco.getCuenta(ca1.numeroCuenta));
		
		
	
		
		
	}

}
