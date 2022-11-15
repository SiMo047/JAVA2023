package Test;

public class Ejemplo {

	
	
public enum NombreMes {Enero, Febrero,Marzo , Abril , Mayo , Junio , Julio , Agosto , Septiembre , Octubre , Noviembre , Diciembre }
public enum Sexo {Hombre , Mujer }
	
	public static void main(String[] args) {

		
		NombreMes mes = NombreMes.Enero ;
		Sexo sx = Sexo.Hombre ;
		
		
		System.out.println (mes);
		System.out.println (sx);
	}

}
