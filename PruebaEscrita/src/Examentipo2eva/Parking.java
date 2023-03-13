package Examentipo2eva;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class Parking {

	private ArrayList<Vehiculo>vehiculos;
	private ArrayList<PlazaAparcamiento>plazaAparcamiento;
	private int plazasDisponibles ; 
	private float saldoAcumulado ;
	static final float PRECIO_BASE_POR_MINUTO = 0.04f;
	static final float PRECIO_BASE_POR_METRO = 0.2f;
	
	
	
	public Parking() {
		super();
		this.saldoAcumulado=0;
		this.plazasDisponibles=100;
		/*iniciamos el array de vehiculo*/
		this.vehiculos=new ArrayList<>();
		/*iniciamos el array de plazas y añadimos al array de plazas 100plazas */
		this.plazaAparcamiento=new ArrayList<>();
		
		for (int i=1 ; i<=100;i++) {
			/*para crear las plazas creamos el objeto plazaAparcamiento*/
			this.plazaAparcamiento.add(new PlazaAparcamiento(i));
		}
	}



	public int getPlazasDisponibles() {
		return plazasDisponibles;
	}



	public ArrayList<Vehiculo> getVehiculos() {
		return vehiculos;
	}



	public float getSaldoAcumulado() {
		return saldoAcumulado;
	}



	
	public String imprimeParking() {
		
		StringBuilder sb = new StringBuilder();
		
		for (PlazaAparcamiento plaza : this.plazaAparcamiento) {
			sb.append(plaza.getNumeroDeplaza());
			sb.append(" - ");
			sb.append(plaza.isLibre());
			sb.append("\n");
			 
		}
		
		return sb.toString();
	}

	
	public String registrarEntradaVehiculo (Vehiculo v) {
		
		if (this.plazasDisponibles>0) {
		
			PlazaAparcamiento plaza = this.obtenerPlazaLibre();
			
			plaza.setLibre(false);
			
			v.setPlaza(plaza);
			
			v.setFechaentrada(LocalDateTime.now());
			
			this.vehiculos.add(v);
			
			this.plazasDisponibles--;
			
			StringBuilder sb = new StringBuilder();
			sb.append(v.getMatricula());
			sb.append(" - ");
			sb.append(v.getPlaza().getNumeroDeplaza());
			return sb.toString();
		
		}else {
			return "Parking lleno " ; 
		}
	}
	
	/*obtiene la plaza libre del array PlazaAparcamiento */
	private PlazaAparcamiento obtenerPlazaLibre() {
		
		for(PlazaAparcamiento p: this.plazaAparcamiento) {
			if (p.isLibre()==true)
				return p;
		}
		
		return null;
		
	}
	
	
	public String registrarSalidaVehiculo (Vehiculo v) {
		int posicion = this.vehiculos.indexOf(v);
		
		if (posicion>=0) {
			
			double precio =0; 
			
			Vehiculo vv= this.vehiculos.get(posicion);
			
			precio = vv.calcularImporte();
			
			this.saldoAcumulado+=precio ; 
			
			this.vehiculos.remove(vv);
			
			
			StringBuilder sb = new StringBuilder();
			sb.append("Vehículo matrícula ");
			sb.append(vv.getMatricula());
			sb.append(" entró ");
			sb.append(vv.getFechaentrada());
			sb.append(" y salió ");
			sb.append(LocalDateTime.now());
			sb.append(" estando ");
			sb.append(vv.calcularMinutos());
			sb.append(" minutos, con un coste de ");
			sb.append(vv.calcularImporte());
			
			return sb.toString();
		}else {
			return "Este coche no esta en el parking ";
		}
	} 
	
	
	
	
	
}
