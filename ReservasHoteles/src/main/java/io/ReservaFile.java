package io;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

import com.daw.modelos.Hotel;
import com.daw.modelos.HotelPlaya;
import com.daw.modelos.HotelRural;
import com.daw.modelos.Reserva;
import com.daw.servicios.Buking;


public class ReservaFile {

	public static Buking cargaCSV() {
	
		Buking rv = new Buking ();
	
	/*LECTURA DE HOTELES */
	Path p = Paths.get("hoteles.csv");
	
	List<String>line = null ; 
	
	try {
	     	line = Files.readAllLines(p);
	     	
			line.stream()
			.filter(l-> l.length()>0)
			.map(l-> {
				String[] campo = l.split(",");
		
			if (Integer.parseInt(campo[7].trim())==1) {
				return new HotelRural (campo[0].trim(),campo[1].trim(),campo[2].trim(),campo[3].trim(),Integer.parseInt(campo[4].trim()),Integer.parseInt(campo[5].trim()),Integer.parseInt(campo[6].trim()),Boolean.parseBoolean(campo[8].trim()));	
			} if (Integer.parseInt(campo[7].trim())==0) {
				
				return new HotelPlaya (campo[0].trim(),campo[1].trim(),campo[2].trim(),campo[3].trim(),Integer.parseInt(campo[4].trim()),Integer.parseInt(campo[5].trim()),Integer.parseInt(campo[6].trim()),Boolean.parseBoolean(campo[9].trim()));
				}
				return null ;
			})
			.forEach (r-> {
				try {
					rv.addHotel(r);
				}catch (Exception e) {
					e.printStackTrace();
				}
			});
			
		
	}catch (IOException e) {
		e.printStackTrace();
	}
	
	/*LECTURA DE RESERVAS */
	
	Path p1 = Paths.get("reservas.csv");
	
	try {
		line=Files.readAllLines(p1);
		
		line.stream()
			.filter(l->l.length()>0)
			.forEach(l-> {
				String [] campo =l.split(",");
		DateTimeFormatter dt = DateTimeFormatter.ofPattern("yyyy/MM/dd");
		
		int id = Integer.parseInt(campo[6]);
	
		Hotel hotel = rv.findHotelById(id);
		
		Reserva r = new Reserva (LocalDate.parse(campo[0],dt),LocalDate.parse(campo[1],dt),Integer.parseInt(campo[2]),Integer.parseInt(campo[3]),campo[4],campo[5],hotel);
				try {
					rv.addReserva(r);
				} catch (Exception e) {
					
				}
			});
		
		
		
	} catch (Exception e) {
		
	}
	
	
	return rv ;
	}
}

