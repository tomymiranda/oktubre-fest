package Persona;

import java.util.ArrayList;

import Carpa.Carpa;
import Cerveza.Cerveza;
import Cerveza.JarraDeCerveza;

public abstract class Persona {

	private double pesoDeLaPersona;
	private ArrayList<JarraDeCerveza> cerverzasIngeridas;
	private boolean leGustaMusicaTradicional = false;
	private double aguante;

	public Persona(double peso, boolean leGustaLaMusica, double aguante) {
		cerverzasIngeridas = new ArrayList<JarraDeCerveza>();
		this.pesoDeLaPersona = peso;
		this.leGustaMusicaTradicional = leGustaLaMusica;
		this.aguante = aguante;
	}

	public double getPesoDeLaPersona() {
		return pesoDeLaPersona;
	}

	public boolean getLeGustaMusicaTradicional() {
		return leGustaMusicaTradicional;
	}

	public double getAguante() {
		return aguante;
	}

	public double getCantidadDeAlchohol() {
		double total = 0;

		for (JarraDeCerveza iter : cerverzasIngeridas) {
			total = total + iter.calcularContenidoDeAlcoholEnJarra();
		}

		return total;

	}

	public boolean todasSusJarrasSonMasDe1Litro() {
		boolean esVerdad = true;
		for (JarraDeCerveza iter : cerverzasIngeridas) {
			if (iter.getLitrosQueSePuedeCargar() < 1) {
				esVerdad = false;
			}
		}
		return esVerdad;
	}

	public ArrayList<JarraDeCerveza> getCerverzasIngeridas() {
		return cerverzasIngeridas;
	}

	public void tomarCerveza(JarraDeCerveza cervezaATomar) {
		cerverzasIngeridas.add(cervezaATomar);
	}

	public boolean estaEbrio() {
		return (getCantidadDeAlchohol() * getPesoDeLaPersona()) > getAguante();

	}

	public boolean estaEntrandoEnElVicio() {
		boolean estaEntrando = false;
		double litrosDeJarraActual = 0;
		
		for (JarraDeCerveza iter : cerverzasIngeridas) {
			
			if(iter.getLitrosQueSePuedeCargar() >= litrosDeJarraActual ){
				estaEntrando = true;
				litrosDeJarraActual = iter.getLitrosQueSePuedeCargar();
			}else{
				estaEntrando = false;
			}
			
		}

		return estaEntrando;
	}

	public abstract boolean esPatriota();

	public abstract boolean leGustaLaCerveza(Cerveza cervezaQueToma);

	public abstract String toString();

	public abstract boolean quiereEntrarAlaCarpa(Carpa carpaALaQueQuiereEntrar);
}