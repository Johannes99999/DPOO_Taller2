package modelo;

import java.io.File;
import java.util.ArrayList;

public class Pedido {
	//Atributos
	private int numeroPedidos;
	private int idPedido;
	private String nombreCliente;
	private String direccionCliente;
	private ArrayList<Producto> pedidoItems;
	//Constructores
	public Pedido(String nombreCliente, String direccionCliente) {
	
		this.nombreCliente = nombreCliente;
		this.direccionCliente = direccionCliente;
	}
	//Métodos
	public int getIdPedido()
	{
		return idPedido;
	}
	public void agregarProducto(Producto nuevoItem)
	{
		pedidoItems.add(nuevoItem);
	}
	private int getPrecioNetoPedido()
	{
		int totalPrice = 0;
		for (int i = 0; i < pedidoItems.size(); i++) {
		    totalPrice += pedidoItems.get(i).getPrecio();
		}
		return totalPrice;

	}
	private int getPrecioTotalPedido()
	{
		return getPrecioNetoPedido() + getPrecioIVAPedido();
	}
	private int getPrecioIVAPedido()
	{
		return (int) (getPrecioNetoPedido()*0.19);
	}
	private String generarTextoFactura()
	{
		return null;
	}
	public void generarFactura(File archivo)
	{
		
	}
	

}
