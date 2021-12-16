package gestionApp.Pedido;

import java.io.Serializable;
import java.util.ArrayList;

public class Producto implements Serializable {

    private static ArrayList<Producto> inventario = new ArrayList<>();
    protected static ArrayList<Producto> productos = new ArrayList<>();
    private int codigo;
    private static String nombre;
 
    public enum tiposSubway {CARNE, POLLO, BBQ , DONWHILE}; 
    public enum tiposBebidas {TE, COCA_COLA, PEPSY, SPRITE}
    public static tiposSubway tipoSubway;
    public static tiposBebidas tipoBebidas;
              

    private double precio;




    public Producto(int codigo, String nombre,tiposSubway tipo, double precio ) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.tipoSubway = tipoSubway;
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

    public static tiposSubway getSubway() {
        return tipoSubway;
    }

    public void setSubway(tiposSubway tipoSubway) {
        this.tipoSubway = this.tipoSubway;
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
        productos.add(producto);
   }

    public static String verProductos() {

        String resultado = "";

        for (Producto producto : inventario) {


            // Se resuelve el método to string de la subclase más específica
            resultado += "\n" + producto.toString();


        }
        return resultado;
    }
    @Override
    public String toString() {
        return "Producto{" +
                "codigo=" + codigo +
                ", nombre='" + nombre + '\'' +
                ", tipo=" + tipoSubway +
                ", precioCompra=" + precio+
                '}';
    }

}