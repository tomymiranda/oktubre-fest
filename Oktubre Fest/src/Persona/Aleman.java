package Persona;

import Carpa.Carpa;
import Cerveza.Cerveza;
import Cerveza.JarraDeCerveza;

public class Aleman extends Persona {

	public Aleman(double peso, boolean leGustaLaMusica, double aguante) {
		super(peso, leGustaLaMusica, aguante);
		// TODO Ap�ndice de constructor generado autom�ticamente
	}

	@Override
	public boolean leGustaLaCerveza(Cerveza cervezaQueToma) {
		// TODO Ap�ndice de m�todo generado autom�ticamente
		return true;
	}

	@Override
	public String toString() {
		// TODO Ap�ndice de m�todo generado autom�ticamente
		return "Aleman";
	}

	@Override
	public boolean esPatriota() {
		boolean esUnPatriota = true;

		for (JarraDeCerveza iter : getCerverzasIngeridas()) {

			if (iter.getCervezaEnJarra().getPaisDeOrigen() != toString()) {
				esUnPatriota = false;
			}
		}
		return esUnPatriota;
	}

	@Override
	public boolean quiereEntrarAlaCarpa(Carpa carpaALaQueQuiereEntrar) {
		return carpaALaQueQuiereEntrar.cantidadDePersonasEnLaCarpa() > 3
				&& leGustaLaCerveza(carpaALaQueQuiereEntrar
						.getCervezaQueVende())
				&& getLeGustaMusicaTradicional() == carpaALaQueQuiereEntrar
						.getTieneBandaDeMusica();
	}

}
