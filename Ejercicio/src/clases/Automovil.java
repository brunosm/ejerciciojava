package clases;

public class Automovil extends Vehiculo {
	
	private int numeroPuertas;
	
	
	
	public Automovil(String marca,String modelo, double precio, int numeroPuertas) {
		super(marca,modelo,precio);
		this.numeroPuertas = numeroPuertas;
	}


	public int getNumeroPuertas() {
		return numeroPuertas;
	}
	

	public void setNumeroPuertas(int numeroPuertas) {
		this.numeroPuertas = numeroPuertas;
	}
	
	
	public String toString() {
		String descripcion="Marca: "+this.getMarca()+" // Modelo: "+this.getModelo()+" // Puertas: "+this.getNumeroPuertas()+" // Precio: $"+ConvertNum(this.getPrecio());
		return descripcion;
	}
	
	
	

}
