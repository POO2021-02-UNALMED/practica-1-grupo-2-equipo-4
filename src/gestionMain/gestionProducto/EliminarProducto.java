package gestionMain.gestionProducto;

import java.util.Scanner;

import gestionApp.Pedido.Producto;

public class EliminarProducto {
    public static void eliminarProductos(){
        int opcion;

        Scanner scan = new Scanner(System.in);
        do {
            System.out.print("\t ELIMINAR PRODUCTO \n1. Para eliminar \n2. Salir");
            opcion = scan.nextInt();
                switch (opcion) {
                    case 1:
                        Producto.verProductos(); 
                        System.out.print("Ingrese el codigo del producto que desea eliminar ");
                        opcion = scan.nextInt();
                        boolean eliminado = Producto.eliminarProducto(opcion);
                        if (!eliminado ) {
                            System.out.println("Codigo no existente");
                        }
                        else {
                            System.out.println("El producto " + opcion + " se ha eliminado satisfactoriamente ");
                            break;
                        }
                    case 2: break;
            }break;
        } while (opcion != 2);
      
    }
}

  