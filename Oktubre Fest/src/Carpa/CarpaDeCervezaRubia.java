package Carpa;


import Cerveza.CervezaRubia;
import Cerveza.JarraDeCerveza;
import Persona.Persona;

public class CarpaDeCervezaRubia extends Carpa {

	public CarpaDeCervezaRubia(int capacidad, boolean tieneBanda,String pais, int cantidadDeLupus,double graduacion) {
		super(capacidad, tieneBanda);
		// TODO Apéndice de constructor generado automáticamente
		setCervezaQueVende(new CervezaRubia(graduacion,pais,cantidadDeLupus));
	}

	@Override
	public void venderJarraDeCerveza(double litrosDeJarraDeCerveza) {
		JarraDeCerveza jarra = new JarraDeCerveza(litrosDeJarraDeCerveza);
		jarra.cargarCervezaEnJarra(getCervezaQueVende());
		for (Persona iter : getPersonasEnLaCarpa()){
			iter.tomarCerveza(jarra);
		}
		
	}

}
