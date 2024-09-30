import java.util.Scanner;
import java.util.Date;
import java.lang.Math;
public class DiferenciaHoras {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int hora, minutos, segundos;

        Date date = new Date();
        int dia = date.getDate();
        int mes = date.getMonth() + 1;
        int anio = date.getYear() + 1900;
        int diaSemana = date.getDay(); //0 dimingo, 1 lunes, 2 martes, etc.
        int horas = date.getHours();
        int minuto = date.getMinutes();
        int segundo = date.getSeconds();

        System.out.println("Ingrese la hora");
        hora = teclado.nextInt();
        System.out.println("Ingrese los minutos");
        minutos = teclado.nextInt();
        System.out.println("Ingrese los segundos");
        segundos = teclado.nextInt();
         int calcularHora = date.getHours() - hora;
         int calcularMinutos = date.getMinutes() - minutos;
         int calcularsegundos = date.getSeconds() - segundos;

         System.out.println("La diferencia de hora es: " + Math.abs(calcularHora)  + " La diferencia de minutos es: " + Math.abs(calcularMinutos)  + " La diferencia de segundos es: " + Math.abs(calcularsegundos));






    }
    
}
