package com.zubiri.multiteca;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public final class Main {

		public static void main(String[] args) throws IOException  {
			
			int seleccion = -1;
			Scanner sc = new Scanner(System.in);
			Multiteca multiteca = null;
			
			if (args.length == 0) {
				System.out.println("El numero de argumentos no es valido:");
				System.out.println("java main.java <fichero_artistas>");
				System.exit(-1);
			} 
	    	//Leemos la lista de distribuidores del fichero.
			Artistas.leerArtistas(args[0]);

			do {
				try {
				//Visualiza por terminal (stdout) las opciones del men
				System.out.println("Mostrar Artistas-----------------------------1");
				System.out.println("Solicitar obras------------------------------2");
				System.out.println("Mostrar obras--------------------------------3");
				System.out.println("SALIR DEL PROGRAMA---------------------------4");
				   
				seleccion = sc.nextInt();
				switch (seleccion) {
					
					case 1: //Mostrar distribuidores
						Artistas.mostrarArtistas();
						break;
						
					case 2: //Solicitar productos
						multiteca = new Multiteca(sc);
						break;
					case 3: //Mostrar productos
						if (multiteca == null) {
							System.out.println("No es posible mostrar productos sin haber sido solicitados");
						}
						multiteca.mostrarMultiteca();
						break;
					case 4: //Salimos
						break;
					default:
						System.out.println("No ha insertado la opcion correcta");
				}
				}catch(InputMismatchException exception){
					System.out.println("Eso no es numero");
					sc.nextLine();
				}
			} while (seleccion != 4);
			System.out.println("Gracias por usar nuestro programa. Que tenga un buen dia!");
			sc.close();
		}
		

	}

