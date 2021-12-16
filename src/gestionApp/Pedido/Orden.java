package gestionApp.Pedido;

import gestionMain.gestionOrden.RegistrarOrden;

import java.util.ArrayList;
import java.util.function.DoubleBinaryOperator;
import gestionApp.Pedido.Producto;

public class Orden {
	int codigo;
	String nombre;
	double precio;
	int ID;
	static ArrayList<Orden> carrito = new ArrayList<>();

	public void Producto(int codigo, String nombre, double precio,int ID ) {
        this.codigo = codigo;
        this.nombre = nombre;
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
