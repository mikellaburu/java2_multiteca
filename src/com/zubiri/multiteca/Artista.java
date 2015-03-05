package com.zubiri.multiteca;

public class Artista {

	private String nombre;
	private int anhoNacimiento;
	
	public Artista(){
		
	}

	public Artista(String nombre, int anhoNacimiento) {
	
		this.nombre = nombre;
		this.anhoNacimiento = anhoNacimiento;
	}
	
	public Artista (String linedArtista , String separador){
		
		String[] strArray = linedArtista.split(separador);
		this.setNombre(strArray[0]);
		this.setAnhoNacimiento(Integer.parseInt(strArray[1]));
	}
	
	public String formattedArtista() {

		String artistaStr = 
		"Nombre del artista:" + this.nombre + "\n" + 
		"Año de nacimiento:" + this.anhoNacimiento  + "\n";
		
		return artistaStr;
	}
	
	public String getNombre() {
		
		return nombre;
	}
	
	public void setNombre(String nombre) {
		
		this.nombre = nombre;
	}
	
	public int getAnhoNacimiento() {
		
		return anhoNacimiento;
	}

	public void setAnhoNacimiento(int anhoNacimiento) {
		
		this.anhoNacimiento = anhoNacimiento;
	}

}
