package com.zubiri.multiteca;

import java.util.InputMismatchException;
import java.util.Scanner;

public abstract class Obra {
	
	private String titulo;
	private Artista autor;
	private int anhoEdicion = 0;
	
	public Obra() {
		
	}
	
	public Obra(String titulo, Artista autor, int anhoEdicion) {
	
		this.titulo = titulo;
		this.autor = autor;
		this.anhoEdicion = anhoEdicion;
	}
	
	public Obra(Scanner sc) {
		
		System.out.println("Titulo de la obra:");
		this.setTitulo(sc.next());

		do {
			try {
		System.out.println("A�o de edicion de la obra:");
		this.setAnhoEdicion(sc.nextInt());
			}catch(InputMismatchException exception){
				System.out.println("Eso no es numero");
				sc.nextLine();
			}
		} while (anhoEdicion == 0);
		System.out.println("Autor de la obra:");
		this.setAutor(Artistas.buscarArtista(sc.next()));
		
	}
	
	public Artista getAutor() {
		
		return autor;
	}

	public void setAutor(Artista autor) {
		
		this.autor = autor;
	}

	public int getAnhoEdicion() {
		
		return anhoEdicion;
	}

	public void setAnhoEdicion(int anhoEdicion) {
		
		this.anhoEdicion = anhoEdicion;
	}

	public String getTitulo() {
		
		return titulo;
	}
	
	public void setTitulo(String tit){
		this.titulo = tit;
	}
	
	public void mostrarObra () {
		System.out.println("\tTitulo:" + this.getTitulo());
		System.out.println("\tAño de edicion:" + this.getAnhoEdicion());
		System.out.println("\tArtista: " + this.getAutor().getNombre());
		System.out.println("\t");
	}

	public boolean equalsIgnoreCase(int index) {
		// TODO Auto-generated method stub
		return false;
	}
	
	
	public String formattedObra() {
		
		String ObraStr = 
				"Titulo:" + this.titulo + "\n" + 
				"Autor:" + this.autor  + "\n" +
				"Año de edicion:" + this.anhoEdicion  + "\n" ;
				
				return ObraStr;
		
	}
}