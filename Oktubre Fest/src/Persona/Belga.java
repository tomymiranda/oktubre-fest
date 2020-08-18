package Persona;

import Carpa.Carpa;
import Cerveza.Cerveza;
import Cerveza.JarraDeCerveza;

public class Belga extends Persona {

	public Belga(double peso, boolean leGustaLaMusica, double aguante) {
		super(peso, leGustaLaMusica, aguante);
		// TODO Ap�ndice de constructor generado autom�ticamente
	}

	@Override
	public boolean leGustaLaCerveza(Cerveza cervezaQueToma) {
		return cervezaQueToma.getCantidadDeLupus() > 4;
			
		

	}

	@Override
	public String toString() {
		// TODO Ap�ndice de m�todo generado autom�ticamente
		return "Belga";
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
		// TODO Ap�ndice de m�todo generado autom�ticamente
		return leGustaLaCerveza(carpaALaQueQuiereEntrar.getCervezaQueVende())
				&& getLeGustaMusicaTradicional() == carpaALaQueQuiereEntrar
						.getTieneBandaDeMusica();
	}
}
