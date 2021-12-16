package gestionApp.personal;

public class Cajero extends Empleado i{


<<<<<<< HEAD
=======
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
    

>>>>>>> 2af86afcd29c69d9ea93b1b39b1fb23610efc043
    

    
}