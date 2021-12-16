package gestionApp.Pedido;

import gestionApp.Pedido.String;
import gestionApp.Pedido.Producto.tiposProducto;

public class Orden {
	int total ;
	String estado;
	private ArrayList<Orden> carrito = new ArrayList<>();

	public Producto(int codigo, String nombre, tiposProducto tipo, double precio ) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.tipo = tipo;
        this.precio = precio;
        Orden.carrito.add(this);
    }
	public void cobrar() {

	}
	public void anadirproducto() {

	}
	public void eliminarpedido() {

	}
	public void confirmar() {

	}

}
