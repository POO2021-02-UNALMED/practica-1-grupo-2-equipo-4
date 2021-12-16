package gestionApp.Pedido;


import java.util.ArrayList;


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
	public static String verCarritos() {
        String resultado = "";
        for (Producto producto : inventario) {
            resultado += "\n"+ producto.toString();

        }
        return resultado;
    }
    
    @Override
    public String toString() {
        return "Producto:" + "codigo: " + codigo + "|nombre: " + nombre + "|tipo: " + tipoSandwich + tipoBebidas+"|precioCompra: " + precio + " ";
    }

	
}
