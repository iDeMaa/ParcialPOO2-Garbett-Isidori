package parcial;

import java.io.File;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		try {
			Scanner s = new Scanner(new File("Rapigrama1.in"));
			int tamanio = s.nextInt(), cantPalabras = s.nextInt();
			s.nextLine();
			if (tamanio < 2 && tamanio > 100 && cantPalabras < 1 && cantPalabras > 10000) {
				System.out.println("Error de entrada");
				System.exit(-1);
			} else {
				Diccionario diccionario = new Diccionario(cantPalabras);
				Tablero tablero = new Tablero(tamanio);
				tablero.generarTablero(s);
				diccionario.generarDiccionario(s);
				Rapigrama rapigrama = new Rapigrama(tablero, diccionario);
				rapigrama.resolver();
			}
			s.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
