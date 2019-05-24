package parcial;

public class Palabra {
	private String palabra;
	private boolean encontrada;

	public String getPalabra() {
		return palabra;
	}

	public void setPalabra(String palabra) {
		this.palabra = palabra;
	}

	public boolean isEncontrada() {
		return encontrada;
	}

	public void setEncontrada(boolean encontrada) {
		this.encontrada = encontrada;
	}

	public Palabra(String palabra) {
		this.palabra = palabra;
		this.encontrada = false;
	}

	public String invertirPalabra(){
		String palabraInvertida = "";
		for(int i = palabra.length() ; i > 0; i--){
			palabraInvertida += palabra.charAt(i-1);
		}
		return palabraInvertida;
	}
}
