package gestionApp.Pedido;

import gestionApp.Pedido.String;
import gestionApp.Pedido.Producto.tiposProducto;

public class Orden extends Producto {
	int total ;
	private enum estado{pendiente, pagado , confirmado , rechazado};
	public ArrayList<Orden> carrito = new ArrayList<>();
	
	public Producto(int codigo, String nombre, tiposProducto tipo, double precio  ) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.tipo = tipo;
        this.precio = precio;
        Orden.carrito.add(this);
    }
	
	public int obtenertotal() {
		total= Producto.getPrecio();
		
	}
	public void cobrar() {
		
	}
	
	public void eliminarproducto() {
		
	}
	public void confirmar() {
		
	}
    
}
