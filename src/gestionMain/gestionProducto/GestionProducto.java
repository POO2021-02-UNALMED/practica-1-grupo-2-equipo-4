package gestionMain.gestionProducto;

import java.util.Scanner;



public class GestionProducto {
    public static void GestionarProducto(){
        int opcion;

        Scanner scan = new Scanner(System.in);
        do {
            System.out.print("\t PRODUCTOS \n1. Registro \n2. Imprimir  \n3. Extras \n4. Regresar");
            opcion = scan.nextInt();

                switch (opcion) {
                    case 1: 
                        RegistroProducto.registrarProducto();
                        
                        break;
                    case 2:  
                        ImprimirOrden.imprimirOrden();
                        break;
                    case 3: 

                        break;
                    case 4: break;
            }break;

        } while (opcion != 4);
      
    }
}
  