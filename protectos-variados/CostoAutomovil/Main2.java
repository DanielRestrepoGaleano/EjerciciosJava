import java.util.Scanner;
public class Main2
{
  public static void main (String[]args)
  {
    Scanner teclado = new Scanner (System.in);
    double promedio, descuento, materia, total, des;
      System.out.println ("Ingrese el valor de la matricula: ");
      materia = teclado.nextDouble();
      System.out.println ("Ingrese le promedio que tuvo el estudiante: ");
      promedio = teclado.nextDouble();
    if (promedio >= 4)
      {
	descuento = materia - (materia*0.30);
	des = materia * 0.30;
      }
    else
      {
	descuento = materia + (materia * 0.10);
      }
    System.out.
      println ("El total a pagar de la matricula sin descuento ni iva es: " +
	       materia);
    System.out.println ("Total a pagar es: " + descuento);
  }
}