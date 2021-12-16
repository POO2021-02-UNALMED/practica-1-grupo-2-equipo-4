package gestionMain.gestionProducto;

import java.util.Scanner;

import gestionMain.main;



public class GestionProducto {
    public static void GestionarProducto(){
        int opcion2;
        Scanner scan = new Scanner(System.in);
        System.out.print("\t PRODUCTOS \n1. Registrar orden:  \n2. Mostrar su orden: \n3. Eliminar producto de orden: \n4. Regresar: \n");
        opcion2 = scan.nextInt();
        do {
            try {
                switch (opcion2) {
                    case 1: 
                        RegistroProducto.registrarProducto();
                        break;
                    case 2:  
                        ImprimirProducto.imprimirOrden();
                        break;
                    case 3:
                        EliminarProducto.eliminarProductos();
                        break;
                    case 4: 
                        main.menuPrincipal();
                        break;
                    }
                } catch (Exception e) {
                    System.out.print("Ingrese una opcion nuevamente: ");
                    opcion2 = scan.nextInt();
                }
        } while (opcion2 != 4);
}       
}
    