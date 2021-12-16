package gestionApp.Pedido;
<<<<<<< HEAD
import java.util.ArrayList;
import java.lang.Math;
=======

import java.util.ArrayList;


>>>>>>> 1b575e356fda3874cc60ffb50a701a01dcd77537
public class Orden extends Producto {
	int total=0;
	public static int ID;
	String estado;
	public Orden(int codigo, String nombre, tiposBebidas tipo, double precio) {
		super(codigo, nombre, tipo, precio);

	}

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
		ID ++;

	}
	public void eliminarprodcto() {
		carrito.remove(productos);
	}



	public static String verCarritos() {
        String resultado = "";
        for (Producto producto : inventario) {
            resultado += "\n"+ producto.toString();

        }
        return resultado;
    }
		public int getID() {
        return ID;
    }

    @Override
    public String toString() {
        return "Producto:" + "codigo: " + codigo + "|nombre: " + nombre + "|tipo: " + tipoSandwich + tipoBebidas+"|precioCompra: " + precio + " ";
    }

	public void generarId() {
		int numero = (int) (Math.random () * 1000000);
	}
}
