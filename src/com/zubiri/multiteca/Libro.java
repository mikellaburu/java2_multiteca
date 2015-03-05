package com.zubiri.multiteca;

import java.util.InputMismatchException;
import java.util.Scanner;

final public class Libro extends Obra{
	
	private String editorial;
	private int numPaginas = 0;
	
	public Libro(String titulo, Artista autor, int anhoEdicion, String editorial, int numPaginas) {
		super (titulo,autor,anhoEdicion);
		this.editorial = editorial;
		this.numPaginas = numPaginas;
	}
	
	public Libro (Scanner sc){
		
		super(sc);
		
		do{
			System.out.println("LIBRO");
			System.out.println("Cual es la editorial del libro? Opciones: Elkar, RAMA, Cambribge");
			System.out.println("El nombre de editorial escribe todo en mayusculas o todo en minusculas por favor");
			
			try {
				
				this.setEditorial(sc.next());
				
			}catch(Exception e){
				
				System.out.println("Editorial no valida, debe ser: Elkar, RAMA, Cambridge");
			}
			
		}while (editorial == null);
		
		do {
			try {
				
				System.out.println("Cuantas paginas tiene? ");
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
			case "ELKAR":
			case "RAMA":
			case "CAMBRIDGE":
			case "elkar":
			case "rama":
			case "cambridge":
				this.editorial = editorial;
				break;
			default:
				throw new Exception("Editorial no valida, debe ser: Elkar, RAMA, Cambridge" );
		}
	}
	
	public int getNumPaginas() {
		
		return numPaginas;
	}
	
	public void setNumPaginas(int paginas) {
		
		this.numPaginas = paginas;
	}
	
	public void mostrarLibro(){
		
		System.out.println("LIBRO:");
		super.mostrarObra();
		System.out.println("\tEditorial: " + this.editorial);
		System.out.println("\tNumero de paginas: " + this.numPaginas);
	}
	
	public String formattedObra() {
		
		String libroStr = 
			"\tEditorial:" + this.editorial + "\n" + 
			"\tNumero de paginas:" + this.numPaginas  + "\n" ;
				
			return libroStr;
		
	}

}
