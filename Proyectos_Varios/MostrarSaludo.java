package Proyectos_Varios;

import java.util.Date;

import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
public class MostrarSaludo {
    public static void main(String[] args) throws InterruptedException {
        //Objeto date para generar el dato
        for(int i = 0; i <= 100; i++){
        Date date = new Date();
        int dia = date.getDate();
        int mes = date.getMonth() + 1;
        int anio = date.getYear() + 1900;
        int diaSemana = date.getDay(); //0 dimingo, 1 lunes, 2 martes, etc.
        int hora = date.getHours() - 12;
        int minuto = date.getMinutes();
        int segundo = date.getSeconds();



        //Variables globales
        String nombreDia ="";
        String nombreMes = "";
        String uso = "";
       

        //Condiciones para mes y dia de la semana
        if(diaSemana == 0 ){
            nombreDia = "Domingo";
        }else if(diaSemana == 1){
            nombreDia = "Lunes";
        }else if(diaSemana == 2){
            nombreDia = "Martes";
        }else if(diaSemana == 3){
            nombreDia = "Miercoles";
        }else if(diaSemana == 4){
            nombreDia = "Jueves";
        }else if(diaSemana == 5){
            nombreDia = "Viernes";
        }else if(diaSemana == 6){
            nombreDia = "Sabado";
        }
        if(mes == 1){
            nombreMes = "Enero";
        }else if(mes == 2){
            nombreMes = "Febrero";
        }else if(mes == 3){
            nombreMes = "Marzo";
        }else if(mes == 4){
            nombreMes = "Abril";
        }else if(mes == 5){
            nombreMes = "Mayo";
        }else if(mes == 6){
            nombreMes = "Junio";
        }else if(mes == 7){
            nombreMes = "Julio";
        }else if(mes == 8){
            nombreMes = "Agosto";
        }else if(mes == 9){
            nombreMes = "Septiembre";
        }else if(mes == 10){
            nombreMes = "Octubre";
        }else if(mes == 11){
            nombreMes = "Noviembre";
        }else if(mes == 12){
            nombreMes = "Diciembre";
        }

        //Verificar si es "AM"o "PM"
        if(hora >= 0 && hora < 12){
            uso = "pm";
            }else if(hora >= 12 && hora < 24){
                uso = "am";
                }
              
                      TimeUnit.SECONDS.sleep(1); 
                    System.out.println("hoy es " + nombreDia + " " +  dia + " de " + nombreMes + " del " + anio + " y son las " + hora + ":" + minuto + ":" + segundo  + uso );
                }
       



    }
    
}
