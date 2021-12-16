package gestionApp.Pedido;

import gestionMain.gestionOrden.RegistrarOrden;

import java.util.ArrayList;
import java.util.function.DoubleBinaryOperator;
import gestionApp.Pedido.Producto;

public class Orden extends Producto {
	public Orden(int codigo, String nombre, tiposBebidas tipo, double precio) {
		super(codigo, nombre, tipo, precio);
		//TODO Auto-generated constructor stub
	}
	int codigo;
	String nombre;
	double precio;
	int ID;
	static ArrayList<Orden> carrito = new ArrayList<>();


	public void generartotal() {
		
		
	}
	public void anadirproducto(Producto productos) {
		carrito.add((Orden) productos);
		
	}
	public void eliminarprodcto() {
		carrito.remove(productos);
	}
	public void confirmar() {

	}

}
