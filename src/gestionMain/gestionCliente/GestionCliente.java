package gestionMain.gestionCliente;

import java.util.Scanner;

import gestionMain.main;

public class GestionCliente {

    public static void GestionarCliente() {
        Scanner scan = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\tMENU PARA CLIENTE"+"\n1. Ingrese sus datos para hacer su pedido: "+"\n2. Editar datos Ingresados: "+"\n3. Mostrar info del Cliente: \n4. Regresar ");
            opcion = scan.nextInt();
            switch (opcion) {
                case 1: 
                    RegistroCliente.registrarCliente();
                    break;
                case 2:  
                    EditarCliente.editarCliente();
                    break;
                case 3: 
                    MostrarCliente.mostrarClientes();
                    break;
                case 4: 
                    main.menuPrincipal();
                    break;

            }

        }while (opcion != 4);
    }
}    
