package com.zubiri.multiteca;

import java.util.InputMismatchException;
import java.util.Scanner;

final public class Disco extends Obra{
	
	private String discografia;
	private int nCanciones = 0;
	
	public Disco(String titulo, Artista autor, int añoEdicion, String discografia, int nCanciones) {
		super (titulo,autor,añoEdicion);
		this.discografia = discografia;
		this.nCanciones = nCanciones;
	}
	
	public Disco (Scanner sc){
		
		super(sc);
		do {
			System.out.println("Escribe la discografia del disco : Universal Music-Sony Music-Warner Music ");		
			try{
				this.setDiscografia(sc.next());
			}catch(Exception e){
				System.out.println("Esa no es la discografia");
			}
		}while (discografia == null);
		do {
			try{
				System.out.println("Escribe el numero de canciones");
				this.setnCanciones(sc.nextInt());
			}catch(InputMismatchException e){
				System.out.println("Eso no es numero");
				sc.nextLine();
			} 
		}while (nCanciones == 0);
	}
	public String getDiscografia() {
		
		return discografia;
	}
	
	public void setDiscografia(String discografia) throws Exception {
		
		switch (discografia){
		case "UNIVERSAL MUSIC":
		case "Universal Music":
		case "UNIVERSAL":
		case "Universal":
		case "SONY MUSIC":
		case "Sony Music":
		case "SONY":
		case "Sony":
		case "WARNER MUSIC":
		case "Warner Music":
		case "WARNER":
		case "Warner":
			this.discografia = discografia;
			break;
		default:
			throw new Exception("DISCOGRAFIAS PERMITIDAS: Universal Music, Sony Music, Warner Music");
	}
		
	}
	
	public int getnCanciones() {
		
		return nCanciones;
	}
	
	public void setnCanciones(int nCanciones) {
		
		this.nCanciones = nCanciones;
	}
	
	public void mostrarDisco(){
		
		System.out.println("MANZANA:");
		super.mostrarObra();
		System.out.println("\tDiscografia: " + this.discografia);
		System.out.println("\tNumero de canciones del disco: " + this.nCanciones);
	}
	public String formattedObra() {
		
		String DiscoStr = 
				"DISCOGRAFIA:" + this.discografia + "\n" + 
				"NUMERO DE CANCIONES:" + this.nCanciones  + "\n" ;
				
				return DiscoStr;
		
		
	}
}
