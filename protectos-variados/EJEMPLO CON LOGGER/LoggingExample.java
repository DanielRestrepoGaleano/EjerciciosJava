import java.util.logging.Level;
import java.util.logging.Logger;

public class LoggingExample {

    // Creación del Logger para esta clase
    private static final Logger LOGGER = Logger.getLogger(LoggingExample.class.getName());

    public static void main(String[] args) {
        // Ejemplo de uso del Logger en lugar de System.out.println
        LOGGER.info("Esta es una información general.");

        // Ejemplo de uso del Logger para advertencias (System.err.println)
        LOGGER.warning("Este es un mensaje de advertencia.");

        // Ejemplo de uso del Logger para errores graves
        try {
            int result = divide(10, 0);
            LOGGER.info("Resultado: " + result);
        } catch (ArithmeticException e) {
            LOGGER.log(Level.SEVERE, "Ocurrió un error al dividir por cero", e);
        }
    }

    // Método que genera una excepción para mostrar el uso del Logger en manejo de errores
    private static int divide(int a, int b) {
        return a / b; // Esto generará una excepción si b es 0
    }
}
