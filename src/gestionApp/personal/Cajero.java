package gestionApp.personal;

import java.io.Serializable;


public class Cajero extends Empleado implements Serializable {

    public Cajero(String nombre, int cedula, double sueldo, int numeroContacto, String correo) {
        super(nombre, cedula, sueldo, numeroContacto, correo);
        //TODO Auto-generated constructor stub
    }

    private String  nombre;
    private int	id;
    
    public void estadodecompra () {
    	
    }

    @Override
    public double calcularComision() {
        // TODO Auto-generated method stub
        return 0;
    }
    

    

    
}