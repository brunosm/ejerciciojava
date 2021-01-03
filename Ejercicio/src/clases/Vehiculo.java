package clases;

import java.text.DecimalFormat;

public class Vehiculo {
	
	// Atributos comunes a las clases
	private String marca;
	private String modelo;
	private double precio;
	
	public Vehiculo() {
		
	}
	
	public Vehiculo(String marca, String modelo, double precio) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.precio = precio;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
	// Metodo para formatear double con puntos y coma
	public String ConvertNum(double num) {
		String retorno="";
		DecimalFormat formateo = new DecimalFormat("###,###.00");
		retorno = formateo.format(num);
		return retorno;
	}
	
	

}
