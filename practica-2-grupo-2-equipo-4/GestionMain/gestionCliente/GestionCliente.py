from gestionCliente.RegistroCliente import RegistroCliente

class GestionCliente:
    
    opcion = 0
        
    def gestionarCliente(opcion):
        
        while opcion != 2:
                print("MENU CLIENTE: \n1. Ingresar datos para continuar con la orden  \n2. Realizar orden \n3. Factura y Salir: \n")
                try:
                    opcion = int(input())
                    if opcion == 1:
                        RegistroCliente.registrarCliente(opcion)
                        
                        break
                    if opcion == 2:

                        break
                    if opcion == 3:

                        break
                
                except :
                    print("Ingrese una opcion nuevamente: ")
                    break
