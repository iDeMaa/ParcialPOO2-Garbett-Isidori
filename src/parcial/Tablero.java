package parcial;

import java.util.Scanner;

public class Tablero {
	private int tamanio;
	private String[] tablero;

	public int getTamanio() {
		return tamanio;
	}

	public void setTamanio(int tamanio) {
		this.tamanio = tamanio;
	}

	public String[] getTablero() {
		return tablero;
	}

	public void setTablero(String[] tablero) {
		this.tablero = tablero;
	}

	public Tablero(int tamanio) {
		this.tamanio = tamanio;
		this.tablero = new String[tamanio];
	}

	public void generarTablero(Scanner s) {
		for (int i = 0; i < this.getTamanio(); i++) {
			this.tablero[i] = s.nextLine();
		}
	}
}
