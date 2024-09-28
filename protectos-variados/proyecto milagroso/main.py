class Nodo:
    def __init__(self, dato):
        self.dato = dato
        self.liga = None

def encolar_lista(pri, ult, d):
    x = Nodo(d)
    if pri is None:
        pri = x
    else:
        ult.liga = x
    ult = x
    return pri, ult

def desencolar_lista(pri, ult):
    if pri is None:
        print("No hay lista")
        return pri, ult, None
    d = pri.dato
    if pri == ult:
        pri = None
        ult = None
    else:
        pri = pri.liga
    return pri, ult, d

def imprimir_cola(pri):
    if pri is None:
        print("Cola vacC-a")
    else:
        current = pri
        while current:
            print(current.dato, end=" ")
            current = current.liga
        print()
def apilar(pila, tope, n, d):
    if tope == n:
        print("La pila estC! llena")
    else:
        tope += 1
        pila[tope] = d
    return tope

def desapilar(pila, tope):
    
    if tope == 0:
        

        def __init__(self, dato):
            self.dato = dato
            self.siguiente = None

class Pila:
    def __init__(self):
        self.cima = None

    def apilar(self, d):
        nuevo_nodo = Nodo(d)
        nuevo_nodo.siguiente = self.cima
        self.cima = nuevo_nodo

    def desapilar(self):
        if self.cima is None:
            print("La pila estC! vacC-a")
            return None
        else:
            dato = self.cima.dato
            self.cima = self.cima.siguiente
            return dato

    def imprimir_pila(self):
        if self.cima is None:
            print("La pila estC! vacC-a")
        else:
            actual = self.cima
            while actual is not None:
                print(actual.dato)
                actual = actual.siguiente

# Programa principal
pila = Pila()

# MenC: principal
pri = None
ult = None

while True:
    print("1. Para encolar un dato")
    print("2. Para desencolar un dato")
    print("3. Para mostrar la cola")
    print("4. para apilar")
    print("5. para desapilar")
    print("6. imprimir pila")
    print("0. Para salir")
    opc = int(input("Seleccione una opciC3n: "))
    
    if opc == 1:
        d = int(input("Por favor ingrese un valor para encolar: "))
        pri, ult = encolar_lista(pri, ult, d)
    elif opc == 2:
        pri, ult, d = desencolar_lista(pri, ult)
        if pri is not None:
            print("Valor desencolado:", d)
    elif opc == 3:
        imprimir_cola(pri)
    elif opc == 0:
        print("Saliendo...")
        break
    elif opc == 4:
        
        pila.apilar(d)
    elif opc == 5:
        d = pila.desapilar()
        if d is not None:
            print("Valor desapilado:", d)
    elif opc == 6:
        pila.imprimir_pila()
    else:
        print("OpciC3n no vC!lida")
        
        
        
        
        
        