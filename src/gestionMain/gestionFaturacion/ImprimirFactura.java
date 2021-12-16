package gestionMain.gestionFaturacion;


import gestionApp.Pedido.Orden;


public class ImprimirFactura {
    public static void imprimirFacturacion(){

        System.out.print("\tFACTURA DE LA ORDEN: " + Orden.ID );
        System.out.print("\nLos productos ha pagar son: ");
        Orden.verCarritos();
        System.out.print("\nEl total ha pagar es: " + Orden.generarTotal());
        

        
    }    
}
    
