package application;

import Servicios.ServicioGeneralMeteorologico;
import io.MeteoFile;

public class App {

	public static void main(String[] args) {
		
		
		   ServicioGeneralMeteorologico sgm = MeteoFile.cargarCSV();
	        sgm.getNumRegistros().forEach( (k,v) -> System.out.println(k + ": " + v));
	        
	        sgm.getTempPorComunidad("Galicia").forEach( c -> System.out.println(c));

	}

}
