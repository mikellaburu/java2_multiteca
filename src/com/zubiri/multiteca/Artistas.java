package com.zubiri.multiteca;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

final public class Artistas {
	
	private static ArrayList<Artista> listaArtistas = new ArrayList<Artista>();	
	

	public static ArrayList<Artista> getListaArtistas() {
		return listaArtistas;
	}

	public static void setListaArtistas(ArrayList<Artista> artistas) {
		Artistas.listaArtistas = artistas;
	}
	
	public static void leerArtistas(String fichero) throws IOException {
		String linea;
		FileInputStream fis;
	    InputStreamReader isr;
	    BufferedReader br;
	    
	    fis = new FileInputStream(fichero);
    	isr = new InputStreamReader(fis, "UTF8");
    	br = new BufferedReader(isr);
    	linea = br.readLine();
		
		if (linea == null) {
			System.out.println("No hay artistas en el fichero");
		}
		
		while ((linea != null) && (linea.compareTo("") != 0)) {
			Artista artista = new Artista (linea,",");
			listaArtistas.add(artista);
			linea = br.readLine();
		}
		br.close();
 }
	
	 public static Artista buscarArtista(String nombre) {
			
			int i = 0;
			Artista artista = null;

			do {		
				if (listaArtistas.get(i).getNombre().equalsIgnoreCase(nombre)) {
					artista = (Artista)listaArtistas.get(i);
				}
				i++;
			} while ((artista == null) && (i < listaArtistas.size()));
			
			if (artista == null) {
				System.out.println("No esta ese artista en el fichero. Saliendo del programa.");
				System.exit(-1);
			}

			return artista;
		}
	 
	 public static void mostrarArtistas() {
			
			if (listaArtistas.size() == 0) {
				System.out.println("No hay artistas en el fichero");
			}
			for (int i = 0;i < listaArtistas.size();i++) {
				System.out.println(listaArtistas.get(i).formattedArtista());
			}
		}
 
 
}
