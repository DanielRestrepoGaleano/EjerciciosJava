import java.util.logging.Logger;
import java.util.concurrent.TimeUnit;
import java.util.TimeZone;
import java.util.Locale;

public class Foobar {
    public static final Logger LOGGER = Logger.getLogger(Foobar.class.getName());
    
    public Foobar() {
        LOGGER.info("Constructed");
    }
    
    public static void main(String[] args) {
        TimeZone.setDefault(TimeZone.getTimeZone("America/Bogota"));
        System.out.println("Default Time Zone: " + TimeZone.getDefault().getID());
        System.out.println("Default Locale: " + Locale.getDefault());
        
        
        for (int i = 0; i <= 100; i++) {
            try {
                TimeUnit.SECONDS.sleep(5); 
                new Foobar();
            } catch (InterruptedException e) {
                LOGGER.warning("Sleep interrupted: " + e.getMessage());
                Thread.currentThread().interrupt();
            }
        }
    }
}