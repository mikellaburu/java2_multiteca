package com.zubiri.multiteca;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

final public class Artistas {
	
	private static ArrayList<Artista> listaArtista = new ArrayList<Artista>();	
	

	public static ArrayList<Artista> getListaArtista() {
		return listaArtista;
	}

	public static void setListaArtista(ArrayList<Artista> listaArtista) {
		Artistas.listaArtista = listaArtista;
	}
	
	public static void leerArtistas(String fichero) throws IOException {
		String linea;
		FileInputStream f;
	    InputStreamReader fr;
	    BufferedReader br;
	    
	    f = new FileInputStream(fichero);
    	fr = new InputStreamReader(f, "UTF8");
    	br = new BufferedReader(fr);
    	linea = br.readLine();
		
		if (linea == null) {
			System.out.println("No existen artistas en el fichero");
		}
		
		while ((linea != null) && (linea.compareTo("") != 0)) {
			Artista artista = new Artista (linea,",");
			listaArtista.add(artista);
			linea = br.readLine();
		}
		br.close();
 }
	
	 public static Artista buscarArtista(String nombre) {
			
			int i = 0;
			Artista artista = null;

			do {		
				if (listaArtista.get(i).getNombre().equalsIgnoreCase(nombre)) {
					artista = (Artista)listaArtista.get(i);
				}
				i++;
			} while ((artista == null) && (i < listaArtista.size()));
			
			if (artista == null) {
				System.out.println("Artista: No se ha encontrado el artista en nuestra base de datos. Se cierra el programa.");
				System.exit(-1);
			}

			return artista;
		}
	 
	 public static void mostrarArtistas() {
			
			if (listaArtista.size() == 0) {
				System.out.println("No se han cargado los artistas del fichero");
			}
			for (int i = 0;i < listaArtista.size();i++) {
				System.out.println(listaArtista.get(i).formattedArtista());
			}
		}
 
 
}
