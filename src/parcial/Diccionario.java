package parcial;

import java.util.Scanner;

public class Diccionario {
	private int cantPalabras;
	private Palabra[] palabra;

	public int getCantPalabras() {
		return cantPalabras;
	}

	public void setCantPalabras(int cantPalabras) {
		this.cantPalabras = cantPalabras;
	}

	public Palabra[] getPalabra() {
		return palabra;
	}

	public void setPalabra(Palabra[] palabra) {
		this.palabra = palabra;
	}

	public Diccionario(int cantPalabras) {
		this.cantPalabras = cantPalabras;
		this.palabra = new Palabra[cantPalabras];
	}
	
	public void generarDiccionario(Scanner s){
		for(int i = 0; i<this.cantPalabras; i++){
			this.palabra[i] = new Palabra(s.nextLine());
		}
	}
}
