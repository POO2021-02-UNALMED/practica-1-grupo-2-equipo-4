package gestionMain.gestionProducto;

import java.util.Scanner;

import gestionApp.Pedido.Producto;
import gestionApp.Pedido.Producto.tiposBebidas;
import gestionApp.Pedido.Producto.tiposSubway;

public class RegistroProducto {
    public static void registrarProducto(){
        int opcion;

        Scanner scan = new Scanner(System.in);

        do {
            
            System.out.print("\t PRODUCTOS TIENDA SUBWAY \n1. Subways \n2. Bebidas \n3. Extras \n4. Regresar");
            opcion = scan.nextInt();

                switch (opcion) {
                    case 1: 
                        registarSubway();
                        
                        break;
                    case 2:  
                        registarBebidas();
                        break;
                    case 3: 

                        break;
                    case 4: break;


            }break;

        } while (opcion != 4);
      
    }
    public static void registarSubway(){
        int opcion;
        tiposSubway tipoS;
        
        Scanner scan = new Scanner(System.in);
        do {
            
            System.out.print("\t SUBWAYS \n1. Carne: $11.999 \n2. BBQ: $12.999 \n3. Pollo: $13.999 \n4. Donwhile: $15.999 \n5. Salir");
            opcion = scan.nextInt();

                switch (opcion) {
                    case 1: 
                        tipoS = Producto.tipoSubway.CARNE;
                        Producto a = new Producto(100, "Carne", tipoS, 11.999); 
                        Producto.agregarProducto(a);   
                        break;
                    case 2:  
                        tipoS = Producto.tipoSubway.BBQ;
                        Producto b = new Producto(101, "BBQ", tipoS, 12.999);
                        Producto.agregarProducto(b);   
                        break;
                    case 3: 
                        tipoS = Producto.tipoSubway.POLLO;
                        Producto c = new Producto(102, "Pollo", tipoS, 13.999);
                        Producto.agregarProducto(c);   
                        break;
                    case 4: 
                        tipoS = Producto.tipoSubway.DONWHILE;
                        Producto d = new Producto(102, "Pollo", tipoS, 13.999);
                        Producto.agregarProducto(d);   
                        break;
                    case 5: break;


            }break;

        } while (opcion != 5);
      
    }
    
    public static void registarBebidas(){
        tiposBebidas tipoB;
        int opcion;
        Scanner scan = new Scanner(System.in);
        do {
            
            System.out.print("\t BEBIDAS \n1. Tee: $4.999 \n2. Pepsi: $4.999 \n3. Coca-Cola: $5.999 \n4. Sprite: $4.999 \n5. Salir");
            opcion = scan.nextInt();

                switch (opcion) {
                    case 1: 
                        tipoB = Producto.tipoBebidas.TE;
                        Producto a = new Producto(200, "Tee", tipoB, 11.999); 
                        Producto.agregarProducto(a);         
                        break;
                    case 2:  
                        tipoB = Producto.tipoBebidas.PEPSY;
                        Producto b = new Producto(201, "Pepsi", tipoB, 11.999); 
                        Producto.agregarProducto(b);         
                        break;
                    case 3: 
                        tipoB = Producto.tipoBebidas.COCA_COLA;
                        Producto c = new Producto(202, "Coca:Cola", tipoB, 11.999); 
                        Producto.agregarProducto(c);        
                        break;
                     case 4: 
                        tipoB = Producto.tipoBebidas.SPRITE;
                        Producto d = new Producto(2003, "Sprite", tipoB, 11.999); 
                        Producto.agregarProducto(d);        
                        break;
                    case 5: break;

            }break;

        } while (opcion != 5);
      
    }
}


