package gestionMain.gestionFaturacion;

import java.util.Scanner;

public class GestionFacturacion {
    public static void GestionarFactura (){
        Scanner scan = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\tMENU FACTURACION"+"\n1. Ver factura"+"\n2. Regresar"+"\n3. Salir");
            opcion = scan.nextInt();
            switch (opcion) {
                case 1: 
                    ImprimirFactura.imprimirFacturacion();
                    break;
                case 2:  

                    break;
                case 3: 
                    //SALIDA TOTAL
                    break;
            }

        }while (opcion != 3);

    }
    
}
