package gestionApp.Pedido;

import gestionMain.gestionOrden.RegistrarOrden;

import java.util.ArrayList;
import java.util.function.DoubleBinaryOperator;

import gestionApp.Pedido.Producto;
public class Orden extend Producto {
	int codigo;
	String nombre;
	double precio;
	int ID;
	static ArrayList<Orden> carrito = new ArrayList<>();


	public void cobrar() {
		
	}
	public void anadirproducto() {
		carrito.add(productos);
		
	}
	public void eliminarprodcto() {
		carrito.remove(producto);
	}
	public void confirmar() {
		if 
	}

}
