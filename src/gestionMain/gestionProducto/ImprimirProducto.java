package gestionMain.gestionProducto;

import java.util.Scanner;

import gestionApp.Pedido.Orden;
import gestionApp.Pedido.Producto;

public class ImprimirProducto {
    public static void imprimirOrden() {
        int opcion;
        Scanner scan = new Scanner(System.in);
        System.out.print(Orden.generarTotal());
        do {
            System.out.print("1. Regresar : ");
            opcion = Integer.parseInt(scan.nextLine());
        } while (opcion != 1);
    }   
}