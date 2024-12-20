class Nodo:
    def __init__(self, d):
        self.dato = d
        self.liga = None
    
    def retorna_liga(self):
        return self.liga
    
    def retorna_dato(self):
        return self.dato
    
    def asigna_liga(self, li):
        self.liga = li
    
    def asigna_dato(self, d):
        self.dato = d
   
class LSL:
    def __init__(self):
        self.pri = None
        self.ult = None
    
    def adicionar(self, x):
        if self.pri is None:
            self.pri = x
        if self.ult is not None:
            self.ult.liga = x
        self.ult = x
    
    def bdi(self, d):
        p = self.pri
        y = None
        while p is not None:
            if p.dato < d:
                y = p
            p = p.liga
        return y
    
    def insertar(self, y, d):
        x = Nodo(d)
        if y is None:
            x.liga = self.pri
            self.pri = x
        else:
            x.liga = y.liga
            y.liga = x
        if x.liga is None:
            self.ult = x
    
    def ordenar(self):
        p = self.primer_nodo()
        if p is None:
            return  # Si la lista está vacía, no hay nada que ordenar

        while p is not None:
            menor = p
            q = p.retorna_liga()
            while q is not None:
                if q.retorna_dato() < menor.retorna_dato():
                    menor = q
                q = q.retorna_liga()

            if menor != p:
                # Intercambiamos los datos de los nodos
                temp = p.retorna_dato()
                p.asigna_dato(menor.retorna_dato())
                menor.asigna_dato(temp)

            p = p.retorna_liga()

    def recorrer(self):
        p = self.pri
        while p is not None:
            print(p.retorna_dato())
            p = p.retorna_liga()
    
    def bus_da(self, d):
        x = self.pri
        y = None
        while x is not None:
            if x.retorna_dato() == d:
                return x
            y = x
            x = x.retorna_liga()
        return y
    
    def borrar(self, x, y):
        if x is None:
            print('El dato no existe')
            return
        self.desconectar(x, y)
    
    def desconectar(self, x, y):
        if x != self.pri:
            y.asigna_liga(x.retorna_liga())
            if x == self.ult:
                self.ult = y
        else:
            self.pri = self.pri.retorna_liga()
            if self.pri is None:
                self.ult = None
    
    def primer_nodo(self):
        return self.pri
    
    def ultimo_nodo(self):
        return self.ult
    
    def anterior(self, p):
        q = self.primer_nodo()
        ant = None
        while q != p:
            ant = q
            q = q.retorna_liga()
        return ant
    
    def fin_de_recorrido(self, p):
        return p is None
                
ls = LSL()
while True:
    print('1. Adicionar')
    print('2. Buscar dato a insertar.')
    print('3. Recorrer.')
    print('4. Borrar.')
    print('5. Ordenar.')
    print('6. Salir.')
    opc = int(input('Ingrese la opción que desea: '))
    if opc == 1:
        d = int(input('Ingrese un dato a insertar: '))
        x = Nodo(d)
        ls.adicionar(x)
    elif opc == 2:
        d = int(input('Ingrese el dato que desea insertar: '))
        y = ls.bdi(d)
        ls.insertar(y, d)
    elif opc == 3:
        ls.recorrer()
    elif opc == 4:
        d = int(input('Ingrese el dato que desea borrar: '))
        y = ls.bus_da(d)
        ls.borrar(y, ls.anterior(y))
    elif opc == 5:
        ls.ordenar()
        print('Lista ordenada correctamente')
        #ls.recorrer()
    elif opc == 6:
        print('Adiós.')
        break
    else:
        print('Opción inválida. Intente de nuevo.')
