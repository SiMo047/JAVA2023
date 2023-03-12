package Ejercicio1;

public abstract class Vehiculo {

	private int peso ; 
	public final void setpeso(int pes) {
		peso=pes;
	}
	
	public abstract int getVelocidadactual() ;
	
	/*¿Podra tener descendencia esta clase ?
	 * Si se podria crear clases hijas de esta clase , lo que no se puede es crear objetos de ella 
	 * 
	 * ¿Se pueden sobreescribir todos sus métodos?
	 * Claro que se puede sobrescribir sus metodos .
	 */
	
}
