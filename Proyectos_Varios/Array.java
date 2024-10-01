package Proyectos_Varios;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class Array {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<Integer>();
        Scanner teclado = new Scanner(System.in);
        String respuesta;

        System.out.println("Desea ingresar un número? (S)i/(N)o");
        respuesta = teclado.nextLine();

        while (respuesta.equalsIgnoreCase("S")) {
            System.out.println("Ingrese el número");
            numeros.add(teclado.nextInt());
            System.out.println("Desea ingresar un número? (S)i/(N)o");
            teclado.nextLine();
            respuesta = teclado.nextLine();
            
        }
        //System.out.println(numeros);
        //for(int i = 0; i < numeros.size(); i++){
         //   System.out.print(numeros.get(i) + "\t");

       // }
       // for(int x: numeros){
        //    System.out.println(x);
       // }
       /* 
        System.out.println(numeros);
       System.out.println("Ingrese un nuevo valor");
       int valorNuevo = teclado.nextInt();
       System.out.println("Ingrese la posicion del elemento entre 0 y " +  numeros.size());
       int posicion = teclado.nextInt();
       numeros.set(posicion, valorNuevo);
       System.out.println(numeros);
        */
/* 
        System.out.println("Ingrese valor a buscar");
        int valorBuscar = teclado.nextInt();
        if(numeros.contains(valorBuscar)){
            System.out.println("el valor existe");
            int posicion = numeros.indexOf(valorBuscar);
            System.out.print(" y se encuentra en la posicion " + posicion);

        }else {
            System.out.println("El valor no existe");
        }
    */
      System.out.println(numeros);
      Collections.sort(numeros);
      System.out.println(numeros);  

    }
    
}
