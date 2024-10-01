package Proyectos_Varios;
import java.util.Date;
public class Fechas {

    public static void main(String[] args) {
        
        Date date = new Date();
        int dia = date.getDate();
        int mes = date.getMonth() + 1;
        int anio = date.getYear() + 1900;
        int diaSemana = date.getDay(); //0 dimingo, 1 lunes, 2 martes, etc.
        int hora = date.getHours();
        int minuto = date.getMinutes();
        int segundo = date.getSeconds();

        System.out.println("dia " + dia );

        System.out.println("mes " + mes);
        System.out.println("año " + anio);
        System.out.println("dia de la semana " + diaSemana);
        System.out.println("hora " + hora);
        System.out.println("Minuto " + minuto);
        System.err.println("segundos " + segundo);





        

    }
}
