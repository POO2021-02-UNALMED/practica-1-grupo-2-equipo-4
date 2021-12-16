package gestionApp.Pedido;

import java.io.Serializable;
import java.util.ArrayList;

public class Producto implements Serializable {

    protected static ArrayList<Producto> inventario = new ArrayList<>();
    protected static ArrayList<Producto> productos = new ArrayList<>();
    protected static int codigo;
    protected static String nombre;
 
    public enum tiposSandwich {CARNE, POLLO, BBQ , DONWHILE}; 
    public enum tiposBebidas {TE, COCA_COLA, PEPSY, SPRITE}
    public static tiposSandwich tipoSandwich;
    public static tiposBebidas tipoBebidas;
              
    public static int ID;
    protected double precio;




    public Producto(int codigo, String nombre,tiposSandwich tipo, double precio ) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.tipoSandwich = tipoSandwich;
        this.precio = precio;
        productos.add(this);
        inventario.add(this);
        
    }
    public Producto(int codigo, String nombre,tiposBebidas tipo, double precio ) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.tipoBebidas = tipoBebidas;
        this.precio = precio;
        productos.add(this);
        inventario.add(this);
        
    }

    public static ArrayList<Producto> getInventario() {
        return productos;
    }

    public static void setInventario(ArrayList<Producto> productos) {
        Producto.productos = productos;
    }  

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public static String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public static tiposSandwich getSubway() {
        return tipoSandwich;
    }

    public void setSubway(tiposSandwich tipoSandwich) {
        this.tipoSandwich = this.tipoSandwich;
    }
    public static tiposBebidas getBebidas() {
        return tipoBebidas;
    }

    public void tipoBebidas(tiposBebidas tipo) {
        this.tipoBebidas = tipoBebidas;
    }


    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void modificarstock() {
	   
   }
    public static void agregarProducto(Producto producto){
        ID ++;
        productos.add(producto);
   }

    public static String verProductos() {
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
    public static boolean eliminarProducto(int opcion){
        for (Producto producto : inventario) {
            if (producto.codigo == codigo) {
                inventario.remove(producto);
                return true;
            }
        }

        return false;
    }
}

