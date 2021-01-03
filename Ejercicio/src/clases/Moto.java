package clases;

public class Moto extends Vehiculo {

	private String cilindrada;
	
	

	public Moto(String marca,String modelo, double precio,String cilindrada) {
		super(marca,modelo,precio);
		this.cilindrada = cilindrada;
	}

	public String getCilindrada() {
		return cilindrada;
	}

	public void setCilindrada(String cilindrada) {
		this.cilindrada = cilindrada;
	}
	
	public String toString() {
		String descripcion="Marca: "+this.getMarca()+" // Modelo: "+this.getModelo()+" // Cilindrada: "+this.getCilindrada()+" // Precio: $"+ConvertNum(this.getPrecio());
		return descripcion;
	}
	
}
