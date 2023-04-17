package Ejercicio4;

import Ejercicio4.VehiculoHibrido.TipoFosil;

public class VehiculoFosil extends Vehiculo {

	
	enum TipoFosil {Gasolina,Diesel};

	
	private TipoFosil tipo ; 
	private Integer capacidadDeposito ;
	
	
	public VehiculoFosil(Integer matricula, String marca, String modelo, String color, Integer precio, Integer cv , boolean estado ,
			 TipoFosil tipo , Integer capacidadDeposito) {
		super(matricula, marca, modelo, color, precio, cv , estado);


		this.tipo=tipo;
		this.capacidadDeposito=capacidadDeposito;
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
		return "VehiculoFosil [matricula=" + matricula + ", marca=" + marca + ", modelo=" + modelo + ", color=" + color
				+ ", precio=" + precio + ", cv=" + cv + ", estado=" + estado + ", tipo=" + tipo + ", capacidadDeposito="
				+ capacidadDeposito + "]";
	}


	
	

}
