package Ejercicio2;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class ConversorFechas {

	
	/*metodo que convierte una fecha de tipo normal a tipo americana*/
	
public String NormalToAmericano(String fecha) {
	
	
	DateTimeFormatter FormatoNormal = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	
	LocalDate fechaConvertida = LocalDate.parse(fecha,FormatoNormal);
	
	DateTimeFormatter FormatoAmericano = DateTimeFormatter.ofPattern("MM/dd/yyy");
	
	return fechaConvertida.format(FormatoAmericano) ; 
}



/*metodo que convierte una fecha de tipo americana a tipo normal*/

public String AmericanoToNormal(String fecha) {
	
	
	DateTimeFormatter FormatoAmericano = DateTimeFormatter.ofPattern("MM/dd/yyy");
	
	LocalDate fechaConvertida = LocalDate.parse(fecha,FormatoAmericano);
	
	DateTimeFormatter FormatoNormal = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	
	
	return fechaConvertida.format(FormatoNormal) ; 
}
	
}
