package gestionMain;

import java.util.Scanner;

import gestionMain.gestionCliente.GestionCliente;
import gestionMain.gestionCompra.GestionCompra;
import gestionMain.gestionOrden.GestionOrden;
import gestionMain.gestionPago.GestionPago;

public class main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int opcion;

               
        do {
            try {
                System.out.print("\t MENU PRINCIPAL"+"\n1. Iniciar pedido "+"\n2. Salir \n ");
                opcion = scan.nextInt();
                

                switch (opcion) {
                    case 1: 
                        System.out.print("\t Ingrese los siguientes datos: ");
                        menuPrincipal();
                        break;
                    case 2: break;//SALIR
                    case 3: break;
                    case 4: break;

                }
            } catch (Exception e) {
                System.out.print("Ingrese una opcion nuevamente: ");
                opcion = scan.nextInt();
            }
        } while (opcion != 2);
    }
    public static void menuPrincipal() {
        Scanner scan = new Scanner(System.in);
        int opcion = 1;
        do {
            try {

                switch (opcion) {
                    case 1: 
                        GestionCliente.GestionarCliente(); 
                        opcion = 3;
                        break;
                    case 2: 
                        GestionOrden.GestionarOrden();
                        break;
                    case 3: 
                        GestionCompra.GestionarCompras();
                        break;
                    case 4: 
                        GestionPago.GestionarPago();
                    case 5: 
                        break;

                }
            } catch (Exception e) {
                System.out.print("Ingrese una opcion nuevamente: ");
                opcion = scan.nextInt();
            }
        } while (opcion != 2);

    }

}
