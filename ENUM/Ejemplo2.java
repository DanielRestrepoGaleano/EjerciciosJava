package ENUM;

import java.util.Scanner;

public class Ejemplo2 {
    public static void main(String[] args) {
        try{
        Scanner teclado = new Scanner(System.in);
        String opcion;
        System.out.println("Digite una opción CONSULTA /  HOSPITALIZACION / CIRUGIA / OFTALMOLOGIA"
                + " / URGENCIAS / ORTOPEDIA / PEDIATRIA ");
        opcion = teclado.next().toUpperCase();
        Hospital hospital = Enum.valueOf(Hospital.class, opcion);
        System.out.println("Servicio " + hospital.name());
        System.out.println("Valor " + hospital.getValor());
        System.out.println("Sede " + hospital.getSede());
        System.out.println("Posicion " + hospital.ordinal());
        }catch(IllegalArgumentException error){
            System.out.println("Opción no válida");

        }



    }

}
