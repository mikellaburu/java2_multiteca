package com.zubiri.multiteca;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

import com.zubiri.multiteca.Obra;

public final class Multiteca {
	
	private static ArrayList<Obra> multiteca = new ArrayList<Obra>();
	private static int numObras = 0;

	public Multiteca() {
		
	}

	public Multiteca(ArrayList<Obra> obras, int numObras) {
		
	}
	
	
	
	public Multiteca(Scanner sc) {
		
		int seleccion = -1;
		int seleccionswitch = 0;
		do {
			
		try {
		System.out.println("Cuantos obras quieres insertar? ");
		seleccion = sc.nextInt();
		} catch (InputMismatchException exception) {
			System.out.println("Mete un numero");
			sc.nextLine();
		}
	}while (seleccion < 0);
			for (int i = 0; i < seleccion; i++) {
		do {
			try {
				System.out.println("Que quieres insertar?");
			System.out.println("DISCO:--------1");
			System.out.println("LIBRO:----------2");
			System.out.println("PELICULA:--------3");
			
			seleccionswitch = sc.nextInt();
			
			switch(seleccionswitch) {
				case 1:
					Disco disco = new Disco(sc);
					getMultiteca().add(disco);
					break;
				case 2:
					Libro libro = new Libro(sc);
					getMultiteca().add(libro);
					break;
				case 3:
					Pelicula pelicula = new Pelicula(sc);
					getMultiteca().add(pelicula);
					break;
				default:
					System.out.println("No ha insertado la opcion correcta.");
					break;			
			}
		}catch (InputMismatchException e){
			System.out.println("Eso no es numero");
			sc.nextLine();
		}	
		}while (seleccionswitch == 0);
			}
				
	}
	
	public void mostrarMultiteca() {
		
		if (getMultiteca().size() == 0) {
			System.out.println("No se han cargado las obras");
		}
		for (int i = 0;i < getMultiteca().size();i++) {
			Obra obra = getMultiteca().get(i);
			obra.mostrarObra();
			
		}
	}
	
	public Obra obtainObra(int index) {
		
		int i = 0;
		Obra obra = null;

		do {		
			if (getMultiteca().get(i).equalsIgnoreCase(index)) {
				obra = (Obra)getMultiteca().get(i);
			}
			i++;
		} while ((obra == null) && (i < getMultiteca().size()));
		
		if (obra == null) {
			System.out.println("Obra: No se ha encontrado la obra en nuestra base de datos. Se cierra el programa.");
			System.exit(-1);
		}

		return obra;
	}
		
	
	public static void contadorObras() {
		setNumObras(getNumObras() + 1);
		
	}
	
	public String formattedMultiteca() {
		
		String MultimediaStr = 
				"OBRAS:" + this.getMultiteca() + "\n" + 
				"NUMERO DE OBRAS:" + this.getNumObras()  + "\n";
				
				return MultimediaStr;
		
	}

	public static int getNumObras() {
		return numObras;
	}

	public static void setNumObras(int numObras) {
		Multiteca.numObras = numObras;
	}

	public static ArrayList<Obra> getMultiteca() {
		return multiteca;
	}

	public static void setMultiteca(ArrayList<Obra> multiteca) {
		Multiteca.multiteca = multiteca;
	}
	
}
