package modelo;


public class Ingrediente {
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

}
