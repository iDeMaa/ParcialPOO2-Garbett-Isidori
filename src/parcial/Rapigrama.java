package parcial;

import java.io.File;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class Rapigrama {
	private Tablero tablero;
	private Diccionario diccionario;
	private List<String> respuesta;
	
	public List<String> getRespuesta() {
		return respuesta;
	}

	public void setRespuesta(List<String> respuesta) {
		this.respuesta = respuesta;
	}

	public Diccionario getDiccionario() {
		return diccionario;
	}

	public void setDiccionario(Diccionario diccionario) {
		this.diccionario = diccionario;
	}

	public Tablero getTablero() {
		return tablero;
	}

	public void setTablero(Tablero tablero) {
		this.tablero = tablero;
	}

	public Rapigrama(Tablero tablero, Diccionario diccionario) {
		this.tablero = tablero;
		this.diccionario = diccionario;
		respuesta = new ArrayList<String>();
	}
	
	public void resolver(){
		//Busca sentido Este y Oeste
		for(int i = 0 ; i < tablero.getTamanio(); i++){
			for(int j = 0 ; j < diccionario.getCantPalabras(); j++){
				if(tablero.getTablero()[i].contains(diccionario.getPalabra()[j].getPalabra()) && !diccionario.getPalabra()[j].isEncontrada()){
					diccionario.getPalabra()[j].setEncontrada(true);
					respuesta.add(Integer.toString(j+1) + "\tE");
				} else if (tablero.getTablero()[i].contains(diccionario.getPalabra()[j].invertirPalabra()) && !diccionario.getPalabra()[j].isEncontrada()){
					diccionario.getPalabra()[j].setEncontrada(true);
					respuesta.add(Integer.toString(j+1) + "\tO");
				}
			}
		}
		
		//Busca sentido Norte y Sur
		String aux = "";
		for(int i = 0 ; i < tablero.getTamanio(); i++){
			for(int j = 0 ; j < tablero.getTamanio(); j++){
				aux += tablero.getTablero()[j].charAt(i);
			}
			for(int j = 0 ; j < diccionario.getCantPalabras() ; j++){
				if(aux.contains(diccionario.getPalabra()[j].getPalabra()) && !diccionario.getPalabra()[j].isEncontrada()){
					diccionario.getPalabra()[j].setEncontrada(true);
					respuesta.add(Integer.toString(j+1) + "\tS");
				} else if(aux.contains(diccionario.getPalabra()[j].invertirPalabra()) && !diccionario.getPalabra()[j].isEncontrada()){
					diccionario.getPalabra()[j].setEncontrada(true);
					respuesta.add(Integer.toString(j+1) + "\tN");
				}
			}
			aux = "";
		}
		
		try{
			PrintWriter pw = new PrintWriter(new File("Rapigrama1.out"));
			for(int i = 0 ; i < respuesta.size(); i++){
				pw.println(respuesta.get(i));
			}
			pw.close();
		} catch (Exception e){
			e.printStackTrace();
		}
	}
}
