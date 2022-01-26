class RegistroCliente:
    
    def registrarCliente(opcion):
         while opcion != 2:
            try:
                print("\tIngrese los siguiente campos")
                cedula = int(input("\nCedula: "))
                nombre = str(input("\nNombre Completo: "))
                celular = int(input("\nCelular: "))
                # Agregar Cliente
                
                opcion = int(input("\n1. Para modificar algun dato \n2. Para Continuar con la Orden \n"))
                print("Sus datos de han guardado satisfactoriamente")
            except :
                print("Ingrese una opcion nuevamente: ")
                break
