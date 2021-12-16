package gestionMain.gestionProducto;

import java.util.Scanner;

import gestionApp.Pedido.Orden;
import gestionApp.Pedido.Producto;

public class ImprimirProducto {
    public static void imprimirOrden() {
        int opcion;
        Scanner scan = new Scanner(System.in);
        System.out.print("\nEl total hasta el momento a pagar es de: " + Orden.generarTotal());
        System.out.print("\nSus productos añadidos son: ");
        Producto.verProductos();
        do {
            System.out.print("1. Regresar : ");
            opcion = Integer.parseInt(scan.nextLine());
        } while (opcion != 1);
    }   
}