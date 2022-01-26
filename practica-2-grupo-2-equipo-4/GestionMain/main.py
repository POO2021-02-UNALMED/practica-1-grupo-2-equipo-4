from gestionCliente.GestionCliente import GestionCliente

def menuPrincipal(opcion):
    
    while opcion != 2:
        print("MENU CLIENTE: \n1. Ingresar datos para continuar con la orden  \n2. Realizar orden \n3. Factura y Salir: \n")
        try:
            opcion = int(input())
            if opcion == 1:
                GestionCliente.gestionarCliente(opcion)
            if opcion == 2:
                break
            if opcion == 3:
                break
        
        except :
            print("Ingrese una opcion nuevamente: ")
            break

def primerMenu (opcion):
    while opcion != 2:
        print("\t MENU PRINCIPAL "+"\n1. Iniciar pedido "+"\n2. Salir: \n")
        try:
            opcion = int(input())
            if opcion == 1:
                menuPrincipal(opcion)
                gestionCliente.GestionCliente.asdf()
                break
            if opcion == 2:
                break
            
        except :
            print("Ingrese una opcion nuevamente: ")
            break
if __name__ == "__main__":
    opcion = 0
    primerMenu(opcion)
    
        
    

