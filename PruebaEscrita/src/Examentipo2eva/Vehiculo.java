package Examentipo2eva;

import java.time.DayOfWeek;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Objects;

public abstract class Vehiculo {

	protected String matricula ; 
	protected String marca ; 
	protected LocalDateTime fechaentrada ; 
	protected int min ; 
	protected PlazaAparcamiento plaza ;
	
	
	public Vehiculo() {
		super();
		this.matricula = "";
		this.marca = "";
		this.fechaentrada = LocalDateTime.now();
		this.min = 0;
		this.plaza =null ;
	}


	public Vehiculo(String matricula, String marca) {
		super();
		this.matricula = matricula;
		this.marca = marca;
		this.fechaentrada = LocalDateTime.now();
		this.min = 0;
		this.plaza = null;
	}


	public Vehiculo(Vehiculo otro ) {
		super();
		this.matricula = otro.matricula;
		this.marca = otro.marca;
		this.fechaentrada = otro.fechaentrada;
		this.min = otro.min;
		this.plaza = otro.plaza;
	}
	
	/*get y set */


	public String getMatricula() {
		return matricula;
	}


	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}


	public String getMarca() {
		return marca;
	}


	public void setMarca(String marca) {
		this.marca = marca;
	}


	public LocalDateTime getFechaentrada() {
		return fechaentrada;
	}


	public void setFechaentrada(LocalDateTime fechaentrada) {
		this.fechaentrada = fechaentrada;
	}


	public int getMin() {
		return min;
	}


	public void setMin(int min) {
		this.min = min;
	}


	public PlazaAparcamiento getPlaza() {
		return plaza;
	}


	public void setPlaza(PlazaAparcamiento plaza) {
		this.plaza = plaza;
	}


	@Override
	public int hashCode() {
		return Objects.hash(matricula);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Vehiculo other = (Vehiculo) obj;
		return Objects.equals(matricula, other.matricula);
	}


	@Override
	public String toString() {
		return "Vehiculo [matricula=" + matricula + ", marca=" + marca + ", fechaentrada=" + fechaentrada + ", min="
				+ min + ", plaza=" + plaza + "]";
	}
	
	public long calcularMinutos () {
/*utlizamos el clase Duration para saber los minutos desde la fecha entrada hasta ahora (cuando sale el vehiculo)*/
	Duration duracion = Duration.between(fechaentrada, LocalDateTime.now());
		
		return duracion.toMinutes(); 
		
	}
	
	public abstract double calcularImporte ();
	
	public double descuento() {
		long minutos = this.calcularMinutos();
		double descuento=0; 
		/*descuento segun minutos  */
		if (minutos>120) {
			descuento+=0.05;
		}else if (minutos>3600) {
			descuento+=0.30;
		}
		/*descuentos segun el dia */
		
		if (LocalDate.now().getDayOfWeek().equals(DayOfWeek.SATURDAY)||LocalDate.now().getDayOfWeek().equals(DayOfWeek.SUNDAY)) {
			descuento+=0.10;
		}
		
	
		return descuento ; 
		
	}
	

	
	
	
	
	
	
	
}
