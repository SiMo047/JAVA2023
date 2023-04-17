package Ejercicio8;

import java.time.LocalDate;

import Ejercicio8.NotasCurso.Curso;
import Ejercicio8.NotasCurso.EtapaEducativa;

public class test {

	public static void main(String[] args) {

		CentroEducativo centro = new CentroEducativo ("Centro Mayor","Calle Almendro","Vera",950123147,"centromayor@gmail.com");
		
		Estudiante e1 = new Estudiante ("1234L","Juan","R","1999-02-01","C/1","Mojacar","juanr@gmail.com",620147258);
		Estudiante e2 = new Estudiante ("0852L","Maria","L","2009-04-15","C/9","Garrucha","mariala@gmail.com",69052471);
		
		
		NotasCurso nt1 = new NotasCurso (EtapaEducativa.Bachillerato,"DD",Curso.n1,2020);
		NotasCurso nt2 = new NotasCurso (EtapaEducativa.ESO,"ESO",Curso.n4,2020);
		
		Expediente Juan = new Expediente ( e1 , true);
		Expediente Maria = new Expediente ( e2 , true);
		
		
		nt1.addNota("Matematicas", 10.0);
		nt1.addNota("Lengua", 8.50);
		
		nt2.addNota("Matematicas", 7.0);
		nt2.addNota("Lengua", 9.0);
		
		
		/*a�adimos notas al expediente con su respectivo alumno */
		Juan.addNotas(nt1);
		Maria.addNotas(nt2);
		
		System.out.println(Juan.mostrarNotas(Curso.n1, EtapaEducativa.Bachillerato));
		
		System.out.println(Maria.mostrarNotas(Curso.n4, EtapaEducativa.ESO));
	
		centro.addExpediente(Maria);
		
		System.out.println(centro.buscarExpediente("0852L"));
		
	}

}
