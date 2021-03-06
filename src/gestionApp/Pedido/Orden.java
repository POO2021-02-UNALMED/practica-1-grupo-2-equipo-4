package gestionApp.Pedido;
import java.util.ArrayList;
import java.lang.Math;
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
		public static int getID() {
        return ID;
    }
		public void setID(int ID) {
        this.ID = ID;
    }
    @Override
    public String toString() {
        return "Producto:" + "codigo: " + codigo + "|nombre: " + nombre + "|tipo: " + tipoSandwich + tipoBebidas+"|precioCompra: " + precio + " ";
    }

	public void generarId() {
		int numero = (int) (Math.random () * 1000000);
	}
}
