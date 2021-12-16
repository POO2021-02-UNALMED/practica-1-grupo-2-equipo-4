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
	double total = 0;
	int ID;
	String estado;
	
	static ArrayList<Orden> carrito = new ArrayList<>();


	public static double generarTotal() {
        double total = 0;

        for (Producto producto : productos) {
            total += producto.getPrecio();
			
        }
		return total;

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
