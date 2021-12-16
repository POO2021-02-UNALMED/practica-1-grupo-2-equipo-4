package gestionApp.Pedido;

import java.io.Serializable;
import java.util.ArrayList;

import javax.sound.sampled.Port;

public class Producto implements Serializable {

   
    static ArrayList<Producto> productos = new ArrayList<>();
    private int codigo;
    private String nombre;
    enum tiposProducto {sandwiches,bebidas, extras,subdia};    
    enum tiposSandwiches {carne,pollo, bbq,asdf}; 

    tiposSandwiches tipoS ;                
    tiposProducto tipo;
    private double precio;




    public Producto(int codigo, String nombre, tiposProducto tipo, double precio ) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.tipo = tipo;
        this.precio = precio;
        
        
    }

  

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public tiposProducto getTipo() {
        return tipo;
    }

    public void setTipo(tiposProducto tipo) {
        this.tipo = tipo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

   public void modificarstock() {
	   
   }
   public void agregarProducto(){
       
   }
   

   
}