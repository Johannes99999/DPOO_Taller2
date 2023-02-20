package modelo;


public class Ingrediente implements Producto{
	//atributos
	private String nombre;
	private int costoAdicional;
	//Constructores
	public Ingrediente(String nombre, int costoAdicional)
	{
		this.nombre = nombre;
		this.costoAdicional = costoAdicional;
	}
	//métodos
	@Override
	public String getNombre()
	{
		return nombre;
	}
	
	@Override
	public int getPrecio() {
		return costoAdicional;
	}
	@Override
	public String generarTextoFactura() {
		// TODO Auto-generated method stub
		return null;
	}

}
