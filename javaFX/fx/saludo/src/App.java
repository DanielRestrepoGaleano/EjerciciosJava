import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class App extends Application {
    public static void main(String[] args) {
        
        launch(args);
        
    }

    @Override
    public void start(Stage arg0)  {
        Parent root;
        try{
            root = FXMLLoader.load(getClass().getResource("saludo.fxml"));
            Scene scene = new Scene(root);

            arg0.setTitle("Primer ejemplo");
            arg0.setScene(scene);
            arg0.show();
        }catch(IOException e){
            System.out.println("Error");
        }
    }
}
