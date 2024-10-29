import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class App extends Application {
    public static void main(String[] args) {
        /*
         * Crear proyecto
         * adicionar librerias
         * configurar el launch.json
         * crear el archivo controlador
         * diseño de la escena
         */


        launch(args);

    }

    @Override
    public void start(Stage arg0)  {
       Parent root;
       try{
        root = FXMLLoader.load(getClass().getResource("calculo.fxml"));
        Scene scene = new Scene(root);
        arg0.setTitle("Cálculo matemático");
        arg0.setScene(scene);
        arg0.show();

       }catch(IOException err){
        System.out.println(err.getMessage());
       }
    }
}
