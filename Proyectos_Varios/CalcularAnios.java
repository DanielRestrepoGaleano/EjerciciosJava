package Proyectos_Varios;
import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class CalcularAnios {
    public static void main(String[] args) {
        // Obtener la fecha actual
        LocalDate fechaActual = LocalDate.now();

        // Solicitar la fecha de nacimiento
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese su año de nacimiento:");
        int anioNacimiento = teclado.nextInt();
        System.out.println("Ingrese su mes de nacimiento:");
        int mesNacimiento = teclado.nextInt();
        System.out.println("Ingrese el día de su nacimiento:");
        int diaNacimiento = teclado.nextInt();

        // Crear la fecha de nacimiento
        LocalDate fechaNacimiento = LocalDate.of(anioNacimiento, mesNacimiento, diaNacimiento);

        // Calcular la diferencia entre la fecha actual y la fecha de nacimiento
        Period edad = Period.between(fechaNacimiento, fechaActual);

        // Imprimir la edad
        System.out.println("Usted tiene " + edad.getYears() + " años, " + edad.getMonths() + " meses, y " + edad.getDays() + " días.");
    }
}
//OTRO EJERCICIO Ingresar una hora (hora:minuto:segundo) del sistema, y hora(hora:minuto:segundo) del usuario, indicar cuantas horas minutos y segundos hay entre las horas ingresadas
/*2010/07/12 ****
  2010/09/09 ****
  2006/11/28 ****
*/