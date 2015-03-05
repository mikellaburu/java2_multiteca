package com.zubiri.multiteca;

import java.util.InputMismatchException;
import java.util.Scanner;

final public class Disco extends Obra{
	
	private String discografica;
	private int nCanciones = 0;
	
	public Disco(String titulo, Artista autor, int anhoEdicion, String discografica, int nCanciones) {
		super (titulo,autor,anhoEdicion);
		this.discografica = discografica;
		this.nCanciones = nCanciones;
	}
	
	public Disco (Scanner sc){
		
		super(sc);
		
		do {
			System.out.println("DISCO");
			System.out.println("Escribe el nombre de la discografica, por favor escribe el nombre entero todo en mayusculas o todo en minusculas: CBS,Virgin,Discos Suicidas,DRO,Elkar");		
			try{
				this.setDiscografica(sc.next());
			}catch(Exception e){
				System.out.println("El nombre no es correcto");
			}
		}while (discografica == null);
		do {
			try{
				
				System.out.println("Cuantas canciones tiene?");
				this.setnCanciones(sc.nextInt());
				
			}catch(InputMismatchException e){
				
				System.out.println("Eso no es numero");
				sc.nextLine();
			} 
			
		}while (nCanciones == 0);
	}
	public String getDiscografica() {
		
		return discografica;
	}
	
	public void setDiscografica(String discografica) throws Exception {
		
		switch (discografica){
		case "CBS":
		case "VIRGIN":
		case "DISCOS SUICIDAS":
		case "DRO":
		case "ELKAR":
		case "cbs":
		case "virgin":
		case "discos suicidas":
		case "dro":
		case "elkar":
			this.discografica = discografica;
			break;
		default:
			throw new Exception("Discografica no valida, debe ser: CBS, Virgin, Discos Suicidas, DRO, Elkar");
	}
		
	}
	
	public int getnCanciones() {
		
		return nCanciones;
	}
	
	public void setnCanciones(int numCanciones) {
		
		this.nCanciones = numCanciones;
	}
	
	public void mostrarDisco(){
		
		System.out.println("DISCO:");
		super.mostrarObra();
		System.out.println("\tDiscografica: " + this.discografica);
		System.out.println("\tNumero de canciones: " + this.nCanciones);
	}
	
	public String formattedObra() {
		
		String discoStr = 
				"\tDiscografica:" + this.discografica + "\n" + 
				"\tNumero de canciones:" + this.nCanciones  + "\n" ;
				
				return discoStr;
		
		
	}
}
