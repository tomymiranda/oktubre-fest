package Carpa;

import java.util.ArrayList;

import Cerveza.Cerveza;


public class asd {

	public static void main(String[] args) {
		
		Carpa carpiña = new CarpaDeCervezaNegra(25, true, null, 3);
		
		Carpa carpiñesca = new CarpaDeCervezaRubia(25, true,null, 6, 12);

		Cerveza cerveza = carpiña.getCervezaQueVende();
	
		Cerveza cerveza2 = carpiñesca.getCervezaQueVende();
	
		System.out.println(cerveza.getPorcentajeDeAlcohol());
		
		System.out.println(cerveza2.getPorcentajeDeAlcohol());
		
		System.out.println(cerveza2.getMarca());
		
		ArrayList<String> asd = new ArrayList<>();
		asd.add("boke");
		asd.add("boketa");
		
		System.out.println(asd.get(1-1));
	}

}
