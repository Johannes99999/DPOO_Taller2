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
	public String getNombre()
	{
		return nombre;
	}
	public int getCostoAdicional()
	{
		return costoAdicional;
	}
	@Override
	public int getPrecio() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public String generarTextoFactura() {
		// TODO Auto-generated method stub
		return null;
	}

}