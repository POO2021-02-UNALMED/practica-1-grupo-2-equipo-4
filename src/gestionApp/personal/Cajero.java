package gestionApp.personal;

import java.io.Serializable;


public class Cajero extends Empleado implements Serializable {

    public Cajero(String nombre, int cedula, double sueldo, int numeroContacto, String correo) {
        super(nombre, cedula, sueldo, numeroContacto, correo);
    }

    private String  nombre;
    private int	id;
    
    public void estadodecompra () {
    }
    @Override
    public double calcularComision() {

        return 0;
    }
    

    

    
}