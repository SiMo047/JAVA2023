package Setordenacion;

import Setordenacion.Arma.Tipo;
import Setordenacion.TipoArmadura.Zona;

public class test {

	public static void main(String[] args) {
	
		
		
		Arma a1 = new Arma ("2000",Tipo.ESPADA,false , 100,0);
		
		TipoArmadura armadura = new TipoArmadura ("Casco",Zona.CABEZA,58,40);
		
		PersonajeAL p1 = new PersonajeAL ("Manu",101,50,a1,null);
		
		
		
		p1.addArmadura(armadura);
		
		System.out.println(p1.listarArmaduraDFisico());
		
		
		
		

	}

}
