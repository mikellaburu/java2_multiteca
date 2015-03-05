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
		int opcionswitch = 0;
		do {
			
			try {
				
				System.out.println("Cuantos obras quieres? ");
				seleccion = sc.nextInt();
				
			} catch (InputMismatchException exception) {
				
				System.out.println("Introdyce la cantidad de obras que quieras: ");
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
					
					opcionswitch = sc.nextInt();
					
					switch(opcionswitch) {
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
							System.out.println("No es correcta la opcion, introduce otra opcion valida.");
							break;			
					}
				}catch (InputMismatchException e){
					
					System.out.println("No has introducido un numero, mete un numero");
					sc.nextLine();
				}
				
			}while (opcionswitch == 0);
		}
				
	}
	
	public void mostrarMultiteca() {
		
		if (getMultiteca().size() == 0) {
			
			System.out.println("Todavia no hay obras");
		}
		
		for (int i = 0; i < getMultiteca().size(); i++) {
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
			
			System.out.println("No existe esa obra. Saliendo del programa.");
			System.exit(-1);
		}

		return obra;
	}
		
	
	public static void contadorObras() {
		
		setNumObras(getNumObras() + 1);
		
	}
	
	public String formattedMultiteca() {
		
		String multitecaStr = 
				"Obras:" + getMultiteca() + "\n" + 
				"Cantidad de obras:" + getNumObras()  + "\n";
				
				return multitecaStr;
		
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
