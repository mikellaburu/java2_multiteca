package com.zubiri.multiteca;

import java.util.ArrayList;
import java.util.Scanner;

final public class Pelicula extends Obra{

	private String productora;
	private ArrayList<Artista> interpretes;
	
	public Pelicula(String titulo, Artista autor, int anhoEdicion, String productora, ArrayList<Artista> interpretes) {
		super (titulo,autor,anhoEdicion);
		this.productora = productora;
		this.interpretes = interpretes;
	}
	
	public Pelicula (Scanner sc){
		
		super(sc);

		do{
			System.out.println("PELICULA");
			System.out.println("Nombre de la productora: Fox, Warner Bros, Filmax");
			System.out.println("Escribe todo en mayusculas o todo en minusculas por favor");
			
			try {
				
				this.setProductora(sc.next());
				
			}catch(Exception e){
				
				System.out.println("Productora no valida, debe ser: Fox, Warner Bros, Filmax");
			}
			
		}while (productora == null);
		
		System.out.println("Escribe los actores:");
		this.setInterpretes(interpretes);
	}
		
	public String getProductora() {
		
		return productora;
	}
	
	public void setProductora(String productora) throws Exception {
		
		switch (productora){
			case "FOX":
			case "WARNER BROS":
			case "FILMAX":
			case "fox":
			case "warner bros":
			case "filmax":
				this.productora = productora;
				break;
			default:
				throw new Exception("Productora no valida, debe ser: Fox, Warner Bros, Filmax" );
		}
	}
	
	public ArrayList<Artista> getInterpretes() {
		
		return interpretes;
	}
	
	public void setInterpretes(ArrayList<Artista> interpretes) {
		
		this.interpretes = interpretes;
	}
	
	public void mostrarPelicula(){
		
		System.out.println("PELICULA:");
		super.mostrarObra();
		System.out.println("\tProductora: " + this.productora);
		System.out.println("\tInterpretes: " + this.interpretes);
	}
	
	public String formattedObra() {
		
		String peliculaStr = 
			"\tProductora:" + this.productora + "\n" + 
			"\tInterpretes:" + this.interpretes  + "\n" ;
				
			return peliculaStr;
		
	}

}
