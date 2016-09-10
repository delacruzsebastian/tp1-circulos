package ar.edu.unlam.tp1;

public class Circulo {
	private Double longitud;
	private Double area;
	private Double radio;
	
	public Circulo(){
		this.longitud = Double.parseDouble("0");
		this.area = Double.parseDouble("0");
		this.radio = Double.parseDouble("0");		
	}

	public Circulo(Double radio){
		this.radio = radio;
		this.area = Math.PI * Math.pow(radio, 2);
		this.longitud = 2.0 * Math.PI * radio;
	}	
	
	public void crearCirculo(Double radio){
		this.radio = radio;
		this.area = Math.PI * Math.pow(radio, 2);
		this.longitud = 2.0 * Math.PI * radio;
	}
	
	public Double mostrarArea(){
		return this.area;
	}
	
	public Double mostrarLongitud(){
		return this.longitud;
	}
	
	public Double mostrarRadio(){
		return this.radio;
	}	

	
}
