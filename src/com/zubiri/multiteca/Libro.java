package com.zubiri.multiteca;

import java.util.InputMismatchException;
import java.util.Scanner;

final public class Libro extends Obra{
	
	private String editorial;
	private int numPaginas = 0;
	
	public Libro(String titulo, Artista autor, int añoEdicion, String editorial, int numPaginas) {
		super (titulo,autor,añoEdicion);
		this.editorial = editorial;
		this.numPaginas = numPaginas;
	}
	
	public Libro (Scanner sc){
		
		super(sc);
		do{
			System.out.println("Escribe la editorial del libro: Random House, HarperCollins, Simon & Schuster, Penguin Group,Houghton Mifflin Harcourt");
			try {
				
				this.setEditorial(sc.next());
			}catch(Exception e){
				System.out.println("Esa editorial no es una opcion");
			}
		}while (editorial == null);
		
		do {
			try {
				System.out.println("Escribe el numero de paginas del libro: ");
		this.setNumPaginas(sc.nextInt());
			}catch (InputMismatchException e){
				System.out.println("Eso no es numero");
				sc.nextLine();
			}
		}while (numPaginas == 0);
		
	}
	
	public String getEditorial() {
		
		return editorial;
	}
	
	public void setEditorial(String editorial) throws Exception {
		
		switch (editorial){
		case "RANDOM HOUSE":
		case "Random House":
		case "HarperCollins":
		case "HARPERCOLLINS":
		case "Simon & Schuster":
		case "SIMON & SCHUSTER":
		case "Penguin Group":
		case "PENGUIN GROUP":
		case "Houghton Mifflin Harcourt":
		case "HOUGHTON MIFFLIN HARCOURT":
			this.editorial = editorial;
			break;
		default:
			throw new Exception("EDITORIALES PERMITIDAS: Random House, HarperCollins, Simon & Schuster, Penguin Group,Houghton Mifflin Harcourt" );
	}
	}
	
	public int getNumPaginas() {
		
		return numPaginas;
	}
	
	public void setNumPaginas(int numPaginas) {
		
		this.numPaginas = numPaginas;
	}
	
	public void mostrarLibro(){
		
		System.out.println("LIBRO:");
		super.mostrarObra();
		System.out.println("\tEditorial: " + this.editorial);
		System.out.println("\tNumero de paginas del libro: " + this.numPaginas);
	}
	
	public String formattedObra() {
		
		String LibroStr = 
				"EDITORIAL:" + this.editorial + "\n" + 
				"NUMERO DE PAGINAS:" + this.numPaginas  + "\n" ;
				
				return LibroStr;
		
	}

}
