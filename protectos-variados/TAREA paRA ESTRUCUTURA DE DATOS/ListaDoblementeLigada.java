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

class ListaDoblementeLigada {
    private Nodo cabeza;

    public ListaDoblementeLigada() {
        this.cabeza = null;
    }

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
            nuevoNodo.anterior = temp;
        }
    }

    public void borrar(int dato) {
        Nodo temp = cabeza;
        while (temp != null) {
            if (temp.dato == dato) {
                if (temp.anterior != null) {
                    temp.anterior.siguiente = temp.siguiente;
                }
                if (temp.siguiente != null) {
                    temp.siguiente.anterior = temp.anterior;
                }
                if (temp == cabeza) {
                    cabeza = temp.siguiente;
                }
                return;
            }
            temp = temp.siguiente;
        }
        System.out.println("Dato no encontrado.");
    }

    public void mostrar() {
        Nodo temp = cabeza;
        while (temp != null) {
            System.out.print(" [" + temp.dato + "] ");
            temp = temp.siguiente;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        ListaDoblementeLigada lista = new ListaDoblementeLigada();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            
            System.out.println("Seleccione una opción:" );
            System.out.println("1. Para agregar un dato " );
            System.out.println("2. Para borrar un dato " );
            System.out.println("3. Para Mostrar la lista " );
            System.out.println("4. Para salir " );
            
            String opcion = scanner.nextLine();

            switch (opcion) {
                case "1":
                    System.out.println("Ingrese el dato a agregar:");
                    int datoAgregar = scanner.nextInt();
                    lista.agregar(datoAgregar);
                    scanner.nextLine(); // Consumir el salto de línea
                    break;
                case "2":
                    System.out.println("Ingrese el dato a borrar:");
                    int datoBorrar = scanner.nextInt();
                    lista.borrar(datoBorrar);
                    scanner.nextLine(); // Consumir el salto de línea
                    break;
                case "3":
                    lista.mostrar();
                    break;
                case "4":
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        }
    }
}
