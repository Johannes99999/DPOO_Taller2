package modelo;

import java.util.ArrayList;

public class Combo implements Producto {
	//atributos
	private double descuento;
	private String nombreCombo;
	ArrayList<Producto> productos = new ArrayList<Producto>();
	//Constructores
	public Combo(String nombreCombo, double descuento)
	{
		this.nombreCombo = nombreCombo;
		this.descuento = descuento;
	}
	public void agregarItemACombo(Producto itemCombo)
	{
		productos.add(itemCombo);
	}
	@Override	
	public int getPrecio() {
	int precio = 0;
	for (Producto prod : productos) { 		      
	     precio += prod.getPrecio(); 		
	     }  
	return (int)(precio*descuento);
	}
	@Override
	public String getNombre() {
		return nombreCombo;
	}
	@Override
	public String generarTextoFactura() {
		// TODO Auto-generated method stub
		return null;
	}
}