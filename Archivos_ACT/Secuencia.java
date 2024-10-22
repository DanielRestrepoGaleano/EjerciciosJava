package Archivos_ACT;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
public class Secuencia {
    public static void main(String[] args) {

        calculoNumeros();

   
    }

    public static void calculoNumeros(){
        try{
        String[] datos = { "17-52-26-13-40-20-10-5-16-6-4-2-1" };
        String arreglo[] = datos[0].split("-");

        int entero = 0;
        int modulo = 0;
        for (String dato : arreglo) {
            entero = Integer.parseInt(dato);
            modulo = entero % 2;
            if(entero == 0 ){
                entero = entero/2;
            }else{
                entero = entero*3+1;
            }
            System.out.println("dato: " + entero);
            
            FileWriter filewriter = new FileWriter("secuencia.txt", true);
        filewriter.write(entero + "\n");
        filewriter.close();
            
                
            
    
            
        }
       
    }catch(IOException err){
        System.out.println("Error al escribir en el archivo");
    }
    }


}
