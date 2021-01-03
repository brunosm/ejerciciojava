package clases;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Ejercicio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Automovil a1 = new Automovil("Peugeot","206",200000,4);
		Moto m1 = new Moto("Honda","Titan",60000,"125cc");
		Automovil a2 = new Automovil("Peugeot","208",250000,5);
		Moto m2 = new Moto("Yamaha","YBR",80500.50,"160cc");
		
		// creo un arraylist que me va a permitir luego comparar los elementos para encontrar mayor, menor y el que contenga la Y
		ArrayList<Vehiculo> vehiculos = new ArrayList<Vehiculo>();
		vehiculos.add(a1);
		vehiculos.add(a2);
		vehiculos.add(m1);
		vehiculos.add(m2);
		
		System.out.println(a1.toString());
		System.out.println(m1.toString());
		System.out.println(a2.toString());
		System.out.println(m2.toString());
		System.out.println("=============================");
		
		// objeto aux para realizar comparaciones
		Vehiculo vehiaux = new Vehiculo();
		vehiaux = vehiculos.get(0);
		
		// for para recorrer con if para encontrar el mayor (mas caro)
	    for (Vehiculo vehi: vehiculos)
	    	if(vehi.getPrecio()>vehiaux.getPrecio())vehiaux = vehi;
	    
	    System.out.println("Vehiculo mas caro: "+vehiaux.getMarca()+" "+vehiaux.getModelo());
	    
	 // for para recorrer con if para encontrar el menor ( mas barato)
	    for (Vehiculo vehi: vehiculos)
	    	if(vehi.getPrecio()<vehiaux.getPrecio())vehiaux = vehi;
	    
	    System.out.println("Vehiculo mas barato: "+vehiaux.getMarca()+" "+vehiaux.getModelo());
	    
	 // for para recorrer con if para encontrar que contiene modelo con letra Y
	    for (Vehiculo vehi: vehiculos)
	    	if(vehi.getModelo().indexOf("Y")>-1) vehiaux = vehi;
	    
	    System.out.println("Vehículo que contiene en el modelo la letra 'Y': "+vehiaux.getMarca()+" "+vehiaux.getModelo()+" "+" $"+vehiaux.ConvertNum(vehiaux.getPrecio()));
	   
	    System.out.println("=============================");
	    System.out.println("Vehiculos Ordenados por precio de mayor a menor: ");
	    
	    // ordeno los vehiculos con comparator por su precios de mayor a menor
	    vehiculos.sort(Comparator.comparing(Vehiculo::getPrecio).reversed());
	    
	    // muestro como queda ordenado el array
	    for (int i = 0; i < vehiculos.size(); i++)
	    	System.out.println(vehiculos.get(i).getMarca()+" "+vehiculos.get(i).getModelo());
		
	}

}
