import java.util.Scanner;

class Nodo {
    int dato;
   
    Nodo siguiente;
    Nodo anterior;

    public Nodo(int dato) {
        this.dato = dato;
      
        this.siguiente = null;
        this.anterior = null;
    }
}

class ListaDoble {
    Nodo cabeza;
    Nodo cola;

    public ListaDoble() {
        this.cabeza = null;
        this.cola = null;
    }

    public void agregar(int dato) {
        Nodo nuevoNodo = new Nodo(dato);
        if (cabeza == null) {
            cabeza = nuevoNodo;
            cola = nuevoNodo;
        } else {
            cola.siguiente = nuevoNodo;
            nuevoNodo.anterior = cola;
            cola = nuevoNodo;
        }
        System.out.println("Nodo agregado con éxito.");
    }

    public void recorrerDI() {
        if (cabeza == null) {
            System.out.println("La lista está vacía.");
            return;
        }

        Nodo actual = cabeza;
        System.out.println("Recorrido de izquierda a derecha (DI):");
        while (actual != null) {
            System.out.println("Dato: " + actual.dato + " Dirección: " + actual.siguiente);
            actual = actual.siguiente;
        }
    }

    public void recorrerID() {
        if (cola == null) {
            System.out.println("La lista está vacía.");
            return;
        }

        Nodo actual = cola;
        System.out.println("Recorrido de derecha a izquierda (ID):");
        while (actual != null) {
            System.out.println("Dato: " + actual.dato + " Dirección: " + actual.siguiente);
            actual = actual.anterior;
        }
    }
}

public class Main {
    public static void main(String[] args) {
        ListaDoble lista = new ListaDoble();
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\nMenú de Opciones:");
            System.out.println("1. Agregar nodo a la lista");
            System.out.println("2. Recorrer la lista de izquierda a derecha (DI)");
            System.out.println("3. Recorrer la lista de derecha a izquierda (ID)");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el dato: ");
                    int dato = scanner.nextInt();
                    scanner.nextLine();  // Consumir la nueva línea
                 
                    lista.agregar(dato);
                    break;
                case 2:
                    lista.recorrerDI();
                    break;
                case 3:
                    lista.recorrerID();
                    break;
                case 4:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción no válida. Intente nuevamente.");
                    break;
            }
        } while (opcion != 4);

        scanner.close();
    }
}
