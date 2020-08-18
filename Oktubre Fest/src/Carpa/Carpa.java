package Carpa;

import java.util.ArrayList;

import Cerveza.Cerveza;
import Cerveza.JarraDeCerveza;
import Persona.Persona;

public abstract class Carpa {

	private int capacidadDePersona;

	private boolean tieneBandaDeMusica;

	private ArrayList<Persona> personasEnLaCarpa;

	private Cerveza cervezaQueVende;

	public Carpa(int capacidad, boolean tieneBanda) {
		this.capacidadDePersona = capacidad;
		this.tieneBandaDeMusica = tieneBanda;
		personasEnLaCarpa = new ArrayList<Persona>();
	}

	public Boolean puedeEntrarUnaPersona(Persona personaQueQuiereEntrar) {
		return (personasEnLaCarpa.size() < capacidadDePersona)
				&& (personaQueQuiereEntrar.estaEbrio() == false);

	}

	public void entrarPersonaEnCarpa(Persona personaAEntrar) {
		if (personaAEntrar.toString() != "aleman") {
			if (puedeEntrarUnaPersona(personaAEntrar)) {
				personasEnLaCarpa.add(personaAEntrar);
				capacidadDePersona--;
			}

		} else {
			if (personasEnLaCarpa.size() >= 3) {
				personasEnLaCarpa.add(personaAEntrar);
				capacidadDePersona--;
			}
		}
	}

	public int getCapacidadDePersona() {
		return capacidadDePersona;
	}

	public boolean getTieneBandaDeMusica() {
		return tieneBandaDeMusica;
	}

	public ArrayList<Persona> getPersonasEnLaCarpa() {
		return personasEnLaCarpa;
	}

	public int cantidadDePersonasEnLaCarpa() {
		return personasEnLaCarpa.size();
	}

	public int cantidadDeEbriosEmpedernidosEnLaCarpa() {
		int ebriosTotales = 0;

		for (Persona iter : getPersonasEnLaCarpa()) {
			if (iter.estaEbrio() && iter.todasSusJarrasSonMasDe1Litro()) {
				ebriosTotales = ebriosTotales + 1;
			}
		}

		return ebriosTotales;
	}

	// rebuscado
	public boolean esCarpaHomogenea(String nacionalidad) {

		boolean esHomogenea = true;

		for (Persona iter : getPersonasEnLaCarpa())
			for (JarraDeCerveza iter2 : iter.getCerverzasIngeridas()) {
				if (iter2.nacionalidadDeCerveza() != nacionalidad) {
					esHomogenea = false;
				}
			}
		return esHomogenea;
	}

	public abstract void venderJarraDeCerveza(double litrosDeJarraDeCerveza);

	public Cerveza getCervezaQueVende() {
		return cervezaQueVende;
	}

	public void setCervezaQueVende(Cerveza cervezaQueVende) {
		this.cervezaQueVende = cervezaQueVende;
	}
}
