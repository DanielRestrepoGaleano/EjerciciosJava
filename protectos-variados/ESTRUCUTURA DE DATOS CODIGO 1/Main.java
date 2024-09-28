import java.util.Scanner;
//Importo el scanner para el ingreso de datos
class Nodo {  //se define el nodo
    int dato;
    Nodo siguiente;

    public Nodo(int dato) {
        this.dato = dato;
        this.siguiente = null;
    }
}

class Lista {//Se define la clase lista, dentro de esta clase se tienen todas las funciones que se van a usar.  
    private Nodo cabeza;

    public Lista() {
        this.cabeza = null;
    }
    //esta funcion me permite ingresar un dato
    public void insertar(int dato) {
        Nodo nuevo = new Nodo(dato); //se instancia un nuevo nodo
        if (cabeza == null) {
            cabeza = nuevo;
        } else {
            Nodo temp = cabeza;
            while (temp.siguiente != null) {
                temp = temp.siguiente;
            }
            temp.siguiente = nuevo;
        }
    }
    // Esta funcion me permite mostrar la lista.
    public void mostrarLista() {  
        Nodo temp = cabeza;
        while (temp != null) {
            System.out.print(temp.dato + " -> ");
            temp = temp.siguiente;
        }
        System.out.println("null");
    }
    //esta funcion me permite elimar los datos iguales que pida el usuario
    public boolean eliminarPorValor(int valor) {
        //si la lista está vacia 
        if (cabeza == null) {
            System.out.println("La lista está vacía.");
            return false;
        }
        
        boolean eliminado = false;

       //Si cabeza es diferente de null y el dato es igual al valor se desconecta el nodo y se conecta al siguiente
        while (cabeza != null && cabeza.dato == valor) {
            cabeza = cabeza.siguiente; 
            eliminado = true;
        }

      //si despues de eliminar desde el inicio la cabeza queda vacía
        if (cabeza == null) {
            return true;
        }

        //Esta linea permite eliminar el resto de nodos de la lista
        Nodo actual = cabeza;

        while (actual.siguiente != null) {
            if (actual.siguiente.dato == valor) {
                  // Salta el nodo con el valor y lo elimina
                actual.siguiente = actual.siguiente.siguiente;
                eliminado = true;
            } else {
               //esta linea avanza al siguiente nodo
                actual = actual.siguiente;
            }
        }
        return eliminado;
    }

    public void ingresarDatosPorTeclado() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de números que desea agregar a la lista:");
        int cantidad = scanner.nextInt();

        for (int i = 0; i < cantidad; i++) {
            System.out.println("Ingrese un número entero:");
            int numero = scanner.nextInt();
            insertar(numero);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        while (true){
        Lista lista = new Lista();

    //llama al metodo para ingresar los datos por teclado
        lista.ingresarDatosPorTeclado();

     //Mostrar la lista antes de eliminar algo
        System.out.println("Lista antes de eliminar:");
        lista.mostrarLista();

      
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el valor que desea eliminar:");
        int valor = scanner.nextInt();
        if(lista.eliminarPorValor(valor)){
            lista.eliminarPorValor(valor);
             System.out.println("Lista después de eliminar:");
             lista.mostrarLista();
        }else{
            System.out.println("dato no encontrado");
        }
        

      
       
        }
    }
}
// hecho por daniel restrepo galeano para la clase de estructura de datos (Uniremington)
