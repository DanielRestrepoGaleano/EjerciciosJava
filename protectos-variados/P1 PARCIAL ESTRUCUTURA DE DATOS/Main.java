// Clase Nodo
class Nodo {
    int dato;
    Nodo siguiente;

    public Nodo(int dato) {
        this.dato = dato;
        this.siguiente = null;
    }
}

// Clase Lista simplemente ligada
class Lista {
    Nodo cabeza;

    public Lista() {
        this.cabeza = null;
    }

    // Método para agregar un nodo al final de la lista
    public void agregar(int dato) {
        Nodo nuevoNodo = new Nodo(dato);
        if (cabeza == null) {
            cabeza = nuevoNodo;
        } else {
            Nodo temp = cabeza;
            while (temp.siguiente != null) {
                temp = temp.siguiente;
            }
            temp.siguiente = nuevoNodo;
        }
    }

    // Método para mostrar los datos y las direcciones de memoria 
    public void mostrar() {
        Nodo temp = cabeza;
        
        while (temp != null) {
            System.out.println("Dato: " + temp.dato + " | Dirección de memoria: " + temp.siguiente);
            temp = temp.siguiente;
            
        }
    }
}

// Clase Principal
public class Main {
    public static void main(String[] args) {
        Lista lista = new Lista();

        // Agregar los datos a la lista
        lista.agregar(10);
        lista.agregar(30);
        lista.agregar(50);
        lista.agregar(70);
        lista.agregar(80);
        lista.agregar(90);
        lista.agregar(95);

        
        lista.mostrar();
    }
}
