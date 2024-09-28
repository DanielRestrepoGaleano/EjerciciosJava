class Nodo:
    def __init__(self, dato):
        self.dato = dato
        self.siguiente = None


def crear_vector():
    vector = []
    tamaño = int(input("Ingrese el tamaño del vector: "))
    for i in range(tamaño):
        elemento = int(input(f"Ingrese el elemento {i + 1}: "))
        vector = agregar_elemento_vector(vector, elemento)
    return vector


def agregar_elemento_vector(vector, elemento):
    vector += [elemento]
    return vector


def mostrar_vector_recursivo(vector, indice=0):
    if indice < longitud_vector(vector):
        print(vector[indice])
        mostrar_vector_recursivo(vector, indice + 1)


def sumar_vector_recursivo(vector, indice=0):
    if indice < longitud_vector(vector):
        return vector[indice] + sumar_vector_recursivo(vector, indice + 1)
    else:
        return 0


def longitud_vector(vector):
    if vector == []:
        return 0
    else:
        return 1 + longitud_vector(vector[1:])


def crear_lista():
    cabeza = None
    cola = None
    tamaño = int(input("Ingrese el tamaño de la lista: "))
    for i in range(tamaño):
        elemento = int(input(f"Ingrese el elemento {i + 1}: "))
        nuevo_nodo = Nodo(elemento)
        if cabeza is None:
            cabeza = nuevo_nodo
            cola = nuevo_nodo
        else:
            cola.siguiente = nuevo_nodo
            cola = nuevo_nodo
    return cabeza


def mostrar_lista_recursivo(cabeza):
    if cabeza:
        print(cabeza.dato)
        mostrar_lista_recursivo(cabeza.siguiente)


def sumar_lista_recursivo(cabeza):
    if cabeza:
        return cabeza.dato + sumar_lista_recursivo(cabeza.siguiente)
    else:
        return 0


def mostrar_lista_inversa_recursivo(cabeza):
    if cabeza:
        mostrar_lista_inversa_recursivo(cabeza.siguiente)
        print(cabeza.dato)


def menu_principal():
    vector = []
    lista = None
    
    while True:
        print("Menú")
        print("1. Crear vector")
        print("2. Crear una lista simplemente ligada")
        print("3. Mostrar vector ")
        print("4. Mostrar lista ")
        print("5. Salir")
        opcion = int(input("Seleccione una opción: "))
        
        if opcion == 1:
            vector = crear_vector()
            while True:
                print("\nSubmenú del vector")
                print("1. Mostrar datos del vector ")
                print("2. Sumar los datos del vector")
                print("3. Regresar al menú principal")
                sub_opcion = int(input("Seleccione una opción: "))
                
                if sub_opcion == 1:
                    mostrar_vector_recursivo(vector)
                elif sub_opcion == 2:
                    resultado = sumar_vector_recursivo(vector)
                    print("La suma de los datos del vector es:", resultado)
                elif sub_opcion == 3:
                    break
                else:
                    print("Opción inválida, intente de nuevo.")
        
        elif opcion == 2:
            lista = crear_lista()
            while True:
                print("\nSubmenú de la lista simplemente ligada")
                print("1. Mostrar datos de la lista ")
                print("2. Mostrar la suma de los datos ")
                print("3. Mostrar los datos de la lista de atrás hacia adelante")
                print("4. Regresar al menú principal")
                sub_opcion = int(input("Seleccione una opción: "))
                
                if sub_opcion == 1:
                    mostrar_lista_recursivo(lista)
                elif sub_opcion == 2:
                    resultado = sumar_lista_recursivo(lista)
                    print("La suma de los datos de la lista es:", resultado)
                elif sub_opcion == 3:
                    mostrar_lista_inversa_recursivo(lista)
                elif sub_opcion == 4:
                    break
                else:
                    print("Opción inválida, intente de nuevo.")
        
        elif opcion == 3:
            if vector:
                mostrar_vector_recursivo(vector)
            else:
                print("El vector no ha sido creado.")

        elif opcion == 4:
            if lista:
                mostrar_lista_recursivo(lista)
            else:
                print("La lista no ha sido creada.")
        
        elif opcion == 5:
            print("Saliendo del programa.")
            break
        else:
            print("Opción inválida, intente de nuevo.")

menu_principal()
