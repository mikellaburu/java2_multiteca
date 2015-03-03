package com.zubiri.multiteca;

public class Artista {

	private String nombre;
	private int aņoNacimiento;
	
	public Artista(){
		
	}

	public Artista(String nombre, int aņoNacimiento) {
	
		this.nombre = nombre;
		this.aņoNacimiento = aņoNacimiento;
	}
	
	public Artista (String linedArtista , String separ){
		
		String[] strArray = linedArtista.split(separ);
		this.setNombre(strArray[0]);
		this.setAņoNacimiento(Integer.parseInt(strArray[1]));
	}
	
	public String formattedArtista() {

		String ArtistaStr = 
		"NOMBRE:" + this.nombre + "\n" + 
		"AņO DE NACIMIENTO:" + this.aņoNacimiento  + "\n";
		
		return ArtistaStr;
	}
	
	public String getNombre() {
		
		return nombre;
	}
	
	public void setNombre(String nombre) {
		
		this.nombre = nombre;
	}
	
	public int getAņoNacimiento() {
		
		return aņoNacimiento;
	}

	public void setAņoNacimiento(int aņoNacimiento) {
		
		this.aņoNacimiento = aņoNacimiento;
	}

}
