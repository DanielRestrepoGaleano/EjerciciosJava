import javax.swing.JOptionPane;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class Controlador {

    @FXML
    private TextField nombre;

    @FXML
    void aceptarclick(ActionEvent event) {
        JOptionPane.showMessageDialog(null, "Bienvenido " + nombre.getText().toString());
        

    }

}