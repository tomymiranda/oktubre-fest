package Carpa;

import Cerveza.CervezaNegra;
import Cerveza.JarraDeCerveza;
import Persona.Persona;

public class CarpaDeCervezaNegra extends Carpa {

	
	
	public CarpaDeCervezaNegra(int capacidad, boolean tieneBanda,String pais, int cantidadDeLupus) {
		super(capacidad, tieneBanda);
		// TODO Apéndice de constructor generado automáticamente
		setCervezaQueVende(new CervezaNegra(pais,cantidadDeLupus));
	}

	public void venderJarraDeCerveza(double litrosDeJarraDeCerveza) {
		JarraDeCerveza jarra = new JarraDeCerveza(litrosDeJarraDeCerveza);
		jarra.cargarCervezaEnJarra(getCervezaQueVende());
		for (Persona iter : getPersonasEnLaCarpa()){
			iter.tomarCerveza(jarra);
		}
	}

}
