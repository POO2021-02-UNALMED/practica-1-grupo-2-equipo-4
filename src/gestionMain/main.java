package gestionMain;

import java.util.Scanner;

import gestionMain.gestionCliente.GestionCliente;
import gestionMain.gestionFaturacion.ImprimirFactura;
import gestionMain.gestionProducto.GestionProducto;

public class main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int opcion;

               
        do {
            try {
                System.out.print("\t MENU PRINCIPAL "+"\n1. Iniciar pedido "+"\n2. Salir");
                opcion = scan.nextInt();
                switch (opcion) {
                    case 1: 
                        menuPrincipal();
                        break;
                    case 2: break;//SALIR
                    case 3: break;
                }
            } catch (Exception e) {
                System.out.print("Ingrese una opcion nuevamente: ");
                opcion = scan.nextInt();
            }
        } while (opcion != 2);
    }
    public static void menuPrincipal() {
        System.out.print("MENU CLIENTE: \n1. Ingresar datos para continuar con la orden  \n2. Realizar orden \n3. Factura \n4. Salir : \n");
        Scanner scan = new Scanner(System.in);
        int opcion = scan.nextInt();
        do {
            try {
                switch (opcion) {
                    case 1: 
                        GestionCliente.GestionarCliente(); 
                        break;
                    case 2: 
                        GestionProducto.GestionarProducto();
                        break;
                    case 3:
                        ImprimirFactura.imprimirFacturacion();
                        break;
                    case 4: break;

                }
            } catch (Exception e) {
                System.out.print("Ingrese una opcion nuevamente: ");
                opcion = scan.nextInt();
            }
        } while (opcion != 5);
    }

}
