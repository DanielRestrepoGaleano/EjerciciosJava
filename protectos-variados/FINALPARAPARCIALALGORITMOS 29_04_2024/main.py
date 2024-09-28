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
        if self.pri == None:
            self.pri = x
        if self.ult == None:
            self.ult = x
        else:
            self.ult.liga = x
            self.ult = x
    
    def bdi(self, d):
        p = self.pri
        y = None
        while p != None:
            if p.dato < d:
                y = p
                p = p.liga
            else:
                
                return y
        return y
  
    def insertar(self, y, d):
        x = Nodo(d)
        if y == None:
            x.liga = self.pri
            self.pri = x
            if self.ult == None:  # Si la lista estaba vacía, actualiza self.ult
                self.ult = x
        else:
            x.liga = y.liga
            y.liga = x
            if x.liga == None:  # Si x es el último nodo, actualiza self.ult
                self.ult = x
                

    def ordenar(self):
        p = self.primer_nodo()
        if p == None:
            return 0 # Si la lista está vacía, no hay nada que ordenar

        while p != None:
            menor = p
            q = p.retorna_liga()
            while q != None:
                if q.retorna_dato() < menor.retorna_dato():
                    menor = q
                q = q.retorna_liga()

            if menor != p:
                # Intercambiar los nodos 
                temp_liga_p = p.retorna_liga()
                temp_liga_menor = menor.retorna_liga()

                ant_p = self.anterior(p)
                ant_menor = self.anterior(menor)

                if p == self.pri:
                    self.pri = menor
                else:
                    ant_p.asigna_liga(menor)

                if menor == self.ult:
                    self.ult = p
                else:
                    ant_menor.asigna_liga(p)

                if temp_liga_p == menor:
                    menor.asigna_liga(p)
                    p.asigna_liga(temp_liga_menor)
                else:
                    menor.asigna_liga(temp_liga_p)
                    ant_menor.asigna_liga(p)
                    p.asigna_liga(temp_liga_menor)

                # Actualizar p para que apunte al nodo intercambiado
                p, menor = menor, p

            p = p.retorna_liga()

    def recorrer(self):
        
        p = self.pri
        if p == None:
            print("No hay datos disponibles")
        else:
            while p != None:
                if p.retorna_liga():
                    print(f"Nodo con dato {p.retorna_dato()} apunta a nodo con dato {p.retorna_liga().retorna_dato()}")
                else:
                    print(f"Nodo final con dato {p.retorna_dato()}")
                print("----------------------")
                print(p.retorna_dato(), "-->", p.retorna_liga())
                p = p.retorna_liga()
                
    def mostrarDatos(self):
        p = self.pri
        while p != None:
            print(p.retorna_dato())
            p = p.retorna_liga()
                
    def vacia(self):
        if self.pri == None:
            return True     
        else:
            return False    
            
         
    
    def bus_da(self, d):
        x = self.pri
        y = None
        while x != None:
            if x.retorna_dato() == d:
                return x
            y = x
            x = x.retorna_liga()
        return y
    
    def borrar(self, d):
        y = self.bus_da(d)
        if y.retorna_dato() != d:
            print("El dato no se puede borrar porque no existe en la lista.")
        else:
            x = self.anterior(y)
            self.desconectar(y, x)
            
        
    
    def desconectar(self, x, y):
        if x != self.pri:
            y.asigna_liga(x.retorna_liga())
            if x == self.ult:
                self.ult = y
        else:
            self.pri = self.pri.retorna_liga()
            if self.pri == None:
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
        return p == None

    def conectar(self, x, y):
        if y == None:
            y = x.retorna_liga()
            x.asigna_liga(y)
            if y == self.ult:
                self.ult = x
        else:
            x.asigna_liga(self.pri)
            if self.pri == None:
                self.ult = x
            self.pri = x



                
ls = LSL()
while True:
    try:
        print("1. Agregar un dato nuevo ")
        print("2. Agregar un dato nuevo en la mejor posición.")
        print("3. Mostrar datos.")
        print("4. Eliminar un dato.")
        print("5. Ordenar los datos.")
        print("6. Salir del sistema.")
        opc = int(input("Ingrese una opción válida del menú: "))
        if opc == 1:
            d = int(input("Ingrese un dato a insertar: "))
            x = Nodo(d)
            ls.adicionar(x)
        elif opc == 2:
            d = int(input("Ingrese el dato que desea insertar: "))
            y = ls.bdi(d)
            ls.insertar(y, d)
        elif opc == 3:
            ls.recorrer()
            print("Los datos son: ")
            ls.mostrarDatos()
        elif opc == 4:
            
            d = int(input("Ingrese el dato que desea borrar: "))
            ls.borrar(d)
        elif opc == 5:
            ls.ordenar()
            if ls.vacia():
                print("No hay datos para ordenar")
            else:
                print("La lista fue ordenada correctamente")
        elif opc == 6:
            print("Saliendo del sistema.")
            break
        else:
            print("Opción inválida")
    except:
        print("Ha ingresado un dato erroneo, por favor verifique.")