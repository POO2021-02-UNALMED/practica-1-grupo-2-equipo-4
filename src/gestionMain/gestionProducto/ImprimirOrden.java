package gestionMain.gestionProducto;

import java.util.Scanner;

import gestionApp.Pedido.Producto;

public class ImprimirOrden {
    public static void imprimirOrden() {
        int opcion;
        Scanner scan = new Scanner(System.in);
        System.out.print(Producto.getInventario());
        System.out.print(Producto.verProductos());
        do {
            System.out.print("1. Regresar : ");
            opcion = Integer.parseInt(scan.nextLine());
        } while (opcion != 1);
    }   
}