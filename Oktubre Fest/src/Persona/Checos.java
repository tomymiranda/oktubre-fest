package Persona;

import Carpa.Carpa;
import Cerveza.Cerveza;
import Cerveza.JarraDeCerveza;

public class Checos extends Persona {

	public Checos(double peso, boolean leGustaLaMusica, double aguante) {
		super(peso, leGustaLaMusica, aguante);
		// TODO Apéndice de constructor generado automáticamente
	}

	@Override
	public boolean leGustaLaCerveza(Cerveza cervezaQueToma) {
		return cervezaQueToma.getPorcentajeDeAlcohol() > 8;

	}

	@Override
	public String toString() {
		// TODO Apéndice de método generado automáticamente
		return "checo";
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
		// TODO Apéndice de método generado automáticamente
		return leGustaLaCerveza(carpaALaQueQuiereEntrar.getCervezaQueVende())
				&& getLeGustaMusicaTradicional() == carpaALaQueQuiereEntrar
						.getTieneBandaDeMusica();
	}
}
