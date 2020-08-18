package Cerveza;

public class JarraDeCerveza {

	private double litrosQueSePuedeCargar;

	private Cerveza cervezaEnJarra;

	public JarraDeCerveza(double litros) {
		this.litrosQueSePuedeCargar = litros;
	}

	public double getLitrosQueSePuedeCargar() {
		return litrosQueSePuedeCargar;
	}

	public String marcaDeLaCervezaEnJarra() {
		return cervezaEnJarra.getMarca();
	}

	public String nacionalidadDeCerveza() {
		return cervezaEnJarra.getPaisDeOrigen();
	}

	public Cerveza getCervezaEnJarra() {
		return cervezaEnJarra;
	}

	public void cargarCervezaEnJarra(Cerveza cervezaEnJarra) {
		this.cervezaEnJarra = cervezaEnJarra;
	}

	public double calcularContenidoDeAlcoholEnJarra() {

		return this.getLitrosQueSePuedeCargar()
				* this.cervezaEnJarra.getPorcentajeDeAlcohol();
	}

}
