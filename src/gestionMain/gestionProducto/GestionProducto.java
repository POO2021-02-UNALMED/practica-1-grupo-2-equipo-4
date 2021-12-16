package gestionMain.gestionProducto;

import java.util.Scanner;



public class GestionProducto {
    public static void GestionarProducto(){
        int opcion;

        Scanner scan = new Scanner(System.in);
        do {
            System.out.print("\t PRODUCTOS \n1. Registrar orden:  \n2. Mostrar su orden \n3. Regresar: ");
            opcion = scan.nextInt();

                switch (opcion) {
                    case 1: 
                        RegistroProducto.registrarProducto();
                        
                        break;
                    case 2:  
                        ImprimirProducto.imprimirOrden();
                        break;
                    case 3: break;
            }break;

        } while (opcion != 3);
      
    }
}
  