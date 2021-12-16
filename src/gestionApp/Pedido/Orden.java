package gestionApp.Pedido;

import gestionMain.gestionOrden.RegistrarOrden;

import java.util.ArrayList;
import java.util.function.DoubleBinaryOperator;
import gestionApp.Pedido.Producto;
import static java.lang.Math. *;

public class Orden extends Producto {
	int total=0;
	int ID;
	String estado;
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
	public static int getID(int ID){
		return ID;
	}
	public void set(int ID){
		this.ID = ID;
		
	}

	public void generarId() {
		ID = (int)(Math.random()*(79-28+1)+22);
	}
}
