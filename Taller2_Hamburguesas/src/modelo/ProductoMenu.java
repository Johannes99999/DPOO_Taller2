package modelo;

public class ProductoMenu {
	//atributos
	private String nombre;
	private int precioBase;
	//Constructores
	public ProductoMenu(String nombre, int precioBase)
	{
		this.nombre = nombre;
		this.precioBase = precioBase;
	}
	//métodos
	public String getNombre()
	{
		return nombre;
	}
	public int getPrecio()
	{
		return precioBase;
	}
	public String generarTextoFactura()
	{
		return "Su menu cuesta " + precioBase*1.19 + ". (" + precioBase + " + " + precioBase*0.19 + "en VAT.";		
	}
}
