package Ejercicio4;

public class VehiculoElectrico extends Vehiculo {

	protected Integer kw ; 
	
	public VehiculoElectrico(Integer matricula, String marca, String modelo, String color, Integer precio, Integer cv, boolean estado , Integer kw) {
		super(matricula, marca, modelo, color, precio, cv, estado);
		this.kw=kw; 
		
	}

	public Integer getKw() {
		return kw;
	}

	public void setKw(Integer kw) {
		this.kw = kw;
	}

	@Override
	public String toString() {
		return "VehiculoElectrico [matricula=" + matricula + ", marca=" + marca + ", modelo=" + modelo + ", color="
				+ color + ", precio=" + precio + ", cv=" + cv + ", estado=" + estado + ", kw=" + kw + "]";
	}


	
	
	

	
}
