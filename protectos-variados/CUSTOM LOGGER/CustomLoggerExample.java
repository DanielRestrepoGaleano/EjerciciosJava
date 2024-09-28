import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.logging.ConsoleHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;
import java.util.logging.Handler;
import java.util.logging.LogRecord;

public class CustomLoggerExample {

    private static final Logger LOGGER = Logger.getLogger(CustomLoggerExample.class.getName());

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        List<String> userInputList = new ArrayList<>();
        String userInput;
        
        // Configuración del Logger para que solo muestre el mensaje
        removeDefaultHandlers(LOGGER);
        LOGGER.setUseParentHandlers(false);
        CustomFormatter formatter = new CustomFormatter();

        ConsoleHandler handler = new ConsoleHandler();
        handler.setFormatter(formatter);
        LOGGER.addHandler(handler);

        // Mensaje inicial
        LOGGER.info("Ingrese textos. Escriba 'salir' para terminar.");

        // Ciclo para pedir datos al usuario
        while (true) {
            LOGGER.info("Ingrese un texto:");
            userInput = teclado.nextLine();
            
            // Verifica si el usuario quiere salir del ciclo
            if (userInput.equalsIgnoreCase("q")) {
                break;
            }

            // Guarda el input en la lista y lo registra en el Logger
            userInputList.add(userInput);
            LOGGER.info("Usuario ingresó: " + userInput);
        }

        // Imprime los datos almacenados en la lista
        LOGGER.info("Lista de todos los textos ingresados:");
        for (String input : userInputList) {
            LOGGER.info(input);
        }

        teclado.close();
    }

    // Método para remover los handlers por defecto
    private static void removeDefaultHandlers(Logger logger) {
        Handler[] handlers = logger.getHandlers();
        for (Handler handler : handlers) {
            logger.removeHandler(handler);
        }
    }

    // Clase que define un formateador personalizado
    static class CustomFormatter extends SimpleFormatter {
        @Override
        public String format(LogRecord record) {
            return record.getMessage() + "\n";
        }
    }
}
