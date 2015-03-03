package com.zubiri.multiteca;

import java.util.ArrayList;
import java.util.Scanner;

final public class Pelicula extends Obra{

	private String productora;
	private ArrayList<Artista> interpretes;
	
	public Pelicula(String titulo, Artista autor, int añoEdicion, String productora, ArrayList<Artista> interpretes) {
		super (titulo,autor,añoEdicion);
		this.productora = productora;
		this.interpretes = interpretes;
	}
	
	public Pelicula (Scanner sc){
		
		super(sc);

		do{
			System.out.println("Escribe la productora de la pelicula: Warner Bros, Universal Pictures, 20th Century Fox, Paramount Pictures, Dream Works Pictures");
			try {
				
				this.setProductora(sc.next());
			}catch(Exception e){
				System.out.println("Esa productora no es una opcion");
			}
		}while (productora == null);
		System.out.println("Escribe los artistas de la pelicula");
		this.setInterpretes(interpretes);
	}
		
	public String getProductora() {
		
		return productora;
	}
	
	public void setProductora(String productora) throws Exception {
		
		switch (productora){
		case "WARNER BROS":
		case "Warner Bros":
		case "Universal Pictures":
		case "UNIVERSAL PICTURES":
		case "20th Century Fox":
		case "20TH CENTURY FOX":
		case "Paramount Pictures":
		case "PARAMOUNT PICTURES":
		case "Dream Works Pictures":
		case "DREAM WORKS PICTURES":
			this.productora = productora;
			break;
		default:
			throw new Exception("PRODUCTORAS PERMITIDAS: Warner Bros, Universal Pictures, 20th Century Fox, Paramount Pictures, Dream Works Pictures" );
	}
	}
	
	public ArrayList<Artista> getInterpretes() {
		
		return interpretes;
	}
	
	public void setInterpretes(ArrayList<Artista> interpretes) {
		
		this.interpretes = interpretes;
	}
	
	public void mostrarLibro(){
		
		System.out.println("PELICULA:");
		super.mostrarObra();
		System.out.println("\tProductora: " + this.productora);
		System.out.println("\tInterpretes: " + this.interpretes);
	}
	public String formattedObra() {
		
		String PeliculaStr = 
				"PRODUCTORA:" + this.productora + "\n" + 
				"INTERPRETES:" + this.interpretes  + "\n" ;
				
				return PeliculaStr;
		
	}

}
