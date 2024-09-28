class Nodo:
    def __init__(self, d):
        self.dato = d
        self.liga = None

    def retornaliga(self):
        return self.liga

    def retornadato(self):
        return self.dato


class LSL:
    def __init__(self):
        self.prim = None
        self.ult = None

    def agregar(self, nodo):
        if self.prim == None:
            self.prim = nodo
        if self.ult != None:
            self.ult.liga = nodo
        self.ult = nodo

    def primernodo(self):
        return self.prim

    def ultimonodo(self):
        return self.ult

    def vacio(self):
        if self.prim == None:
            return True
        else:
            return False

    def finderecorrido(self):
        if self.prim == None:
            return True
        else:
            return False

    def recorrer(self):
        p = self.prim
        while p != None:
            print(p.retornadato())
            p = p.retornaliga()

    def buscardondeinsertar(self, d):
        p = self.prim
        y = None
        while p != None:
            if p.dato < d:
                y = p
                p = p.liga
            else:
                return y
        return y

    def conectar(self, x, y):
        x.liga = y

    def buscarDato(self, d):
        p = self.prim
        while p != None:
            if p.dato == d:
                return p
            p = p.liga
        return None

    def borrar(self, x):
        if x == None:
            return
        if x == self.prim:
            self.prim = x.liga
        else:
            p = self.prim
            while p.liga != None:
                if p.liga == x:
                    p.liga = x.liga
                    return
                p = p.liga

    def desconectar(self, x):
        if x == None:
            return
        if x == self.ult:
            self.ult = None
        else:
            p = self.prim
            while p != None:
                if p.liga == x:
                    p.liga = None
                    return
                p = p.liga

    def ordenaAscendentemente(self):
        cambios = True
        while cambios:
            cambios = False
            p = self.prim
            while p != None:
                if p.liga != None and p.dato > p.liga.dato:
                    temp = p.dato
                    p.dato = p.liga.dato
                    p.liga.dato = temp
                    cambios = True
                p = p.liga


a = LSL()

while True:
    print("1. agregar")
    print("2. primer nodo")
    print("3. ultimo nodo")
    print("4. es vacia")
    print("5. recorrer")
    print("6. fin del recorrido")
    print("7. buscar donde insertar")
    print("8. conectar nodos")
    print("9. buscar dato")
    print("10. borrar nodo")
    print("11. desconectar nodos")
    print("12. ordenar ascendentemente")
    print("13. salir")
    
    opc = int(input("Elige una opcion: "))
    if opc == 1:
        d = int(input("Ingrese el valor: "))
        x = Nodo(d)
        a.agregar(x)
    elif opc == 2:
        p = a.primernodo()
        print(p)
    elif opc == 3:
        p = a.ultimonodo()
        print(p)
    elif opc == 4:
        p = a.vacio()
        print(p)
    elif opc == 5:
        a.recorrer()
    elif opc == 6:
        p = a.finderecorrido()
        print(p)
    elif opc == 7:
        d = int(input("Qué dato desea insertar: "))
        p = a.buscardondeinsertar(d)
        print(p)
    elif opc == 8:
        x = a.primernodo()
        y = a.ultimonodo()
        a.conectar(x, y)
    elif opc == 9:
        d = int(input("Qué dato desea buscar: "))
        p = a.buscarDato(d)
        print(p)
    elif opc == 10:
        d = int(input("Qué dato desea borrar: "))
        nodo = a.buscarDato(d)
        a.borrar(nodo)
    elif opc == 11:
        x = a.primernodo()
        a.desconectar(x)
    elif opc == 12:
        a.ordenaAscendentemente()
    elif opc == 13:
        break
    else:
        print("Opcion incorrecta")
