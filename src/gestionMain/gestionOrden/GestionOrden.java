package gestionMain.gestionOrden;

import java.util.Scanner;

public class GestionOrden {
    public static void GestionarOrden() {
        Scanner scan = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\tMENU PARA ORDEN"+"\n1. Ingrese su orden de Productos"+"\n2. Editar Orden "+"\n3. Mostrar Orden");
            opcion = scan.nextInt();
            switch (opcion) {
                case 1: 
                    RegistrarOrden.registradorOrden();
                    break;
                case 2:  
                    ModificarOrden.modificadorOrden();
                    break;
                case 3: 
                    EliminarOrden.eliminadorOrden();
                    break;
                case 4: break;
                case 5: break;
                case 6: break;
            }

        }while (opcion != 6);
    }
}    

    

