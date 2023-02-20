package modelo;

public class Pedido {
	//Atributos
	private int numeroPedidos;
	private int idPedido;
	private String nombreCliente;
	private String direccionCliente;
	//Constructores
	public Pedido(String nombreCliente, String direccionCliente);
	{
		this.nombreCliente = nombreCliente;
		this.direccionCliente = direccionCliente;
	}
	//Métodos
	public int getIdPedido(); 
	{
		return idPedido;
	}
	public void agregarProducto(Producto nuevoItem);
	{
		
	}
	private int getPrecioNetoPedido();
	{
		
	}
	private int getPrecioTotalPedido();
	{
		
	}
	private int getPrecioIVAPedido();
	{
		
	}
	private String generarTextoFactura();
	{
		
	}
	public void generarFactura(File archivo);
	{
		
	}
	

}
