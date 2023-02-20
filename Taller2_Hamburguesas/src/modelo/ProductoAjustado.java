package modelo;

public class ProductoAjustado implements Producto {

	//Constructores
	public ProductoAjustado (ProductoMenu base)
	{
		this.base = base;
	}
	//HER MA DET LEGGES TIL HVORDAN MAN LEGGER TIL OG TREKKER FRA INGREDIENSER.

	@Override
	public int getPrecio() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String getNombre() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String generarTextoFactura() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
