import java.util.Scanner;
import java.util.ArrayList;
public class Empresa {
    public static void main(String[] args) {
        

        Scanner teclado = new Scanner(System.in);
        ArrayList<Empleado> emp = new ArrayList<Empleado>();
        String respuesta;
        System.out.println("Desea ingresar un nuevo registro? (S)i/(N)o");
        respuesta = teclado.next();
        while (respuesta.equalsIgnoreCase("S")) {
            Empleado empleado = new Empleado();
            System.out.println("Ingrese la cédula");
            empleado.setCedula(teclado.next());
            System.out.println("Nombre");
            empleado.setNombre(teclado.next());
            System.out.println("Mes de nacimiento");
            empleado.setMesNacimiento(teclado.nextInt());
            System.out.println("Edad");
            empleado.setEdad(teclado.nextInt());
            emp.add(empleado);
            System.out.println("Desea ingresar un nuevo registro? (S)i/(N)o");
            respuesta = teclado.next();
        }
//Imprimir cada empleado for ech


  for(Empleado empleado: emp){
            System.out.println("Nombre " + empleado.getNombre() + " edad " + empleado.getEdad());
    }
/* 
for(int i = 0; i < emp.size(); i++){
    System.out.println("Nombre " + emp.get(i).getNombre() + " Edad " + emp.get(i).getEdad());
}
*/


    }
    
}
