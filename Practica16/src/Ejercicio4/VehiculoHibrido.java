package Ejercicio4;

public class VehiculoHibrido extends Vehiculo {

	enum TipoFosil {Gasolina,Diesel};

	private Integer kw ;
	private TipoFosil tipo ; 
	private Integer capacidadDeposito ;
	
	
	
	public VehiculoHibrido(Integer matricula, String marca, String modelo, String color, Integer precio, Integer cv, boolean estado ,
			Integer kw , TipoFosil tipo , Integer capacidadDeposito) {
		super(matricula, marca, modelo, color, precio, cv , estado);

		this.kw=kw;
		this.tipo=tipo;
		this.capacidadDeposito=capacidadDeposito;
	}



	public Integer getKw() {
		return kw;
	}



	public void setKw(Integer kw) {
		this.kw = kw;
	}



	public TipoFosil getTipo() {
		return tipo;
	}



	public void setTipo(TipoFosil tipo) {
		this.tipo = tipo;
	}



	public Integer getCapacidadDeposito() {
		return capacidadDeposito;
	}



	public void setCapacidadDeposito(Integer capacidadDeposito) {
		this.capacidadDeposito = capacidadDeposito;
	}



	@Override
	public String toString() {
		return "VehiculoHibrido [matricula=" + matricula + ", marca=" + marca + ", modelo=" + modelo + ", color="
				+ color + ", precio=" + precio + ", cv=" + cv + ", estado=" + estado + ", kw=" + kw + ", tipo=" + tipo
				+ ", capacidadDeposito=" + capacidadDeposito + "]";
	}




	

}
