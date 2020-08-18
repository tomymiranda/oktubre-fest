package Persona;

import Carpa.Carpa;
import Cerveza.Cerveza;
import Cerveza.JarraDeCerveza;

public class Aleman extends Persona {

	public Aleman(double peso, boolean leGustaLaMusica, double aguante) {
		super(peso, leGustaLaMusica, aguante);
		// TODO Apéndice de constructor generado automáticamente
	}

	@Override
	public boolean leGustaLaCerveza(Cerveza cervezaQueToma) {
		// TODO Apéndice de método generado automáticamente
		return true;
	}

	@Override
	public String toString() {
		// TODO Apéndice de método generado automáticamente
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
