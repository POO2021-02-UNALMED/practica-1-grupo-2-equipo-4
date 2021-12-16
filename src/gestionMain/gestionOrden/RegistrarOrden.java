package gestionMain.gestionOrden;

import java.util.Scanner;
import gestionApp.Pedido.Orden;


public class RegistrarOrden {
    public static void registradorOrden() {
        int opcion;
        Scanner scan = new Scanner(System.in);

        do {
            
            System.out.print("\t PRODUCTOS SUBWAY \n1. Subways del Dia \n2. Todos los Sandwiches \n3. Bebidas \n4. Adiciones");
            opcion = scan.nextInt();
            try {
                switch (opcion) {
                    case 1: 
                        
                        break;
                    case 2:  

                        break;
                    case 3: 

                        break;
                    case 4: break;
                    case 5: break;
                    case 6: break;
                }
            } catch (Exception e) {
                System.out.print("Ingrese una opcion nuevamente: ");
                opcion = scan.nextInt();
            }

            opcion = scan.nextInt();
        } while (opcion != 1);

    }
    
}
    
