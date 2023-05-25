package io;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

import Servicios.ServicioGeneralMeteorologico;
import modelos.EstacionMeteorologica;
import modelos.RegistrosDatosDia;

public class MeteoFile {

	public static ServicioGeneralMeteorologico cargarCSV() {
	ServicioGeneralMeteorologico sgm = new ServicioGeneralMeteorologico();
	
	//Cargar datos en sgm
	
	//Fichero a leer
    Path f1 = Paths.get("estaciones.csv");
    	
    List<String> lineas = null;
    	
    	//Leer EstacionesMeteorologicas
    			try {
    				lineas = Files.readAllLines(f1);	
    				
    				lineas.stream()
    					.filter( linea -> linea.length() > 0) //Para quitar las l�neas en blanco que pueda haber al final
    					.map( linea -> {
    						String[] campos = linea.split(",");
    						 
    						return new EstacionMeteorologica(Integer.parseInt(campos[0]), campos[1], campos[2], Double.parseDouble(campos[3]), Double.parseDouble(campos[4]));
    					}) 
    					.forEach(em -> {
    						try {
    							sgm.nuevaEstacion(em);
    						} catch (Exception e) {
    							e.printStackTrace();
    						}
    					});

    				
    			} catch (IOException e) {
    				e.printStackTrace();
    			}
    			//Leer RegistrosDatosDia
    			 Path f2 = Paths.get("registros.csv");
    			try {
    				lineas = Files.readAllLines(f2);	
    				
    				lineas.stream()
    					.filter( linea -> linea.length() > 0) //Para quitar las l�neas en blanco que pueda haber al final
    					.forEach( linea -> {
    						String[] campos = linea.split(",");
    						//long id, LocalDate fecha, double tempMax, double tempMin, double tempMedia
    						DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd");
    						
    						RegistrosDatosDia rdd = new RegistrosDatosDia(Integer.parseInt(campos[0]), LocalDate.parse(campos[1], dtf), Double.parseDouble(campos[2]), Double.parseDouble(campos[3]), Double.parseDouble(campos[4]));
    						
    						
    						//Sacar de sgm la estaci�n con ese id
    						int idEstacion = Integer.parseInt(campos[5]);
    						EstacionMeteorologica em = sgm.buscarPorId(idEstacion);
    						
    						//A la estaci�n a�adirle el registro
    						em.nuevoRegistro(rdd);			
    					});


    				
    			} catch (IOException e) {
    				e.printStackTrace();
    			}
    			
    			
    			return sgm;
    		
	}
}
