package gestionMain;

import java.util.Scanner;

import gestionMain.gestionCliente.GestionCliente;
import gestionMain.gestionFaturacion.ImprimirFactura;
import gestionMain.gestionProducto.GestionProducto;

public class main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int opcion1;

               
        do {
            try {
                System.out.print("\t MENU PRINCIPAL "+"\n1. Iniciar pedido "+"\n2. Salir: \n");
                opcion1 = scan.nextInt();
                switch (opcion1) {
                    case 1: 
                        menuPrincipal();
                        break;
                    case 2: break;//SALIR

                }
            } catch (Exception e) {
                System.out.print("Ingrese una opcion nuevamente: ");
                opcion1 = scan.nextInt();
            }
        } while (opcion1 != 2);
    }
    public static void menuPrincipal() {

        Scanner scann = new Scanner(System.in);
        int opcion;
        do {
            System.out.print("MENU CLIENTE: \n1. Ingresar datos para continuar con la orden  \n2. Realizar orden \n3. Factura y Salir: \n");
            opcion = scann.nextInt();
            try  {
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


                }
            } catch (Exception e) {
                System.out.print("Ingrese una opcion nuevamente: ");
                opcion = scann.nextInt();
            }
        } while (opcion != 3);
    }   

}
