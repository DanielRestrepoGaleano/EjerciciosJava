import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Controlador {

    @FXML
    private Button buttonExit;

    @FXML
    private Button calculo;

    @FXML
    private Label pHora;

    @FXML
    private Label pMinutos;

    @FXML
    private Label pResultado;

    @FXML
    private Label pSegundos;

    @FXML
    private TextField sHora;

    @FXML
    private TextField sMinuto;

    @FXML
    private TextField sResultado;

    @FXML
    private TextField sSegundo;

    @FXML
    private Button salir;

    @FXML
    void calcularClick(ActionEvent event) {
        int hora = Integer.parseInt(sHora.getText());
        int minutos = Integer.parseInt(sMinuto.getText());
        int segundos = Integer.parseInt(sSegundo.getText());
        int total = hora * 3600 + minutos * 60 + segundos;
        sResultado.setText(String.valueOf(total));

    }

    @FXML
    void salirClick(ActionEvent event) {
        System.exit(0);
    }

}
