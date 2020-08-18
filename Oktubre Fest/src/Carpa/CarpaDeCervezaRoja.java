package Carpa;


import Cerveza.CervezaRoja;
import Cerveza.JarraDeCerveza;
import Persona.Persona;

public class CarpaDeCervezaRoja extends Carpa  {

	public CarpaDeCervezaRoja(int capacidad, boolean tieneBanda,String pais, int cantidadDeLupus) {
		super(capacidad, tieneBanda);
		// TODO Apéndice de constructor generado automáticamente
		setCervezaQueVende(new CervezaRoja(pais,cantidadDeLupus));
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
