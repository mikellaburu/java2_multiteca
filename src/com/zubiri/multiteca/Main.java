package com.zubiri.multiteca;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public final class Main {

		public static void main(String[] args) throws IOException  {
			
			int opcion = -1;
			Scanner sc = new Scanner(System.in);
			Multiteca multiteca = null;
			
			if (args.length == 0) {
				
				System.out.println("El numero de argumentos no es valido:");
				System.out.println("java main.java <fichero_artistas>");
				System.exit(-1);
			} 
			
	    	//Leer  fichero artistas
			Artistas.leerArtistas(args[0]);

			do {
				try {
					//Visualizar menu principal
					System.out.println("Mostrar artistas-----------------------------1");
					System.out.println("Solicitar obras------------------------------2");
					System.out.println("Mostrar obras--------------------------------3");
					System.out.println("Salir del programa---------------------------4");
					   
					opcion = sc.nextInt();
					switch (opcion) {
						
						case 1: //Mostrar artistas
							Artistas.mostrarArtistas();
							break;
							
						case 2: //Solicitar obras
							multiteca = new Multiteca(sc);
							break;
						case 3: //Mostrar  obras
							if (multiteca == null) {
								System.out.println("No es posible mostrar las obras sin haber sido solicitados");
							}
							multiteca.mostrarMultiteca();
							break;
						case 4: 
							System.out.println("Saliendo del programa Multiteca");
							System.exit(-1);
							break;
						default:
							System.out.println("No ha insertado la opcion correcta");
					}
					
				}catch(InputMismatchException ime){
					
					System.out.println("Error, No has introducido un numero, mete un numero del menu");
					sc.nextLine();
				}
				
			} while (opcion != 4);
			
			sc.close();
		}
		

	}

