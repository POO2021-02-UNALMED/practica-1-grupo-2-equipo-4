package gestionMain;

import java.util.Scanner;

import gestionMain.gestionCliente.GestionCliente;

public class main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int opcion;

        do {
            try {
                System.out.print("\t MENU PRINCIPAL"+"\n1. Ingrese sus datos para poder Ordenar "+"\n2. Ordenar productos ");
                opcion = scan.nextInt();
                switch (opcion) {
                    case 1:
                        GestionCliente.GestionarCliente(); break;
                    case 2: break;
                    case 3: break;
                    case 4: break;

                }
            } catch (Exception e) {
                System.out.print("Ingrese una opcion nuevamente: ");
                opcion = scan.nextInt();
            }
        } while (opcion != 4);
    }
    public static void salirDelSistema() {

    }

}