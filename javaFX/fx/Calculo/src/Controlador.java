import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class Controlador {

    @FXML
    private TextField PrimerValor;

    @FXML
    private TextField SegundoValor;

    @FXML
    private TextField resultado;

    @FXML
    void calcularClick(ActionEvent event) {
        float pValor = Float.parseFloat(PrimerValor.getText().toString());
        float sValor = Float.parseFloat(SegundoValor.getText().toString());

        float total = pValor + sValor;

        resultado.setText("" + total);
    }

    @FXML
    void salirClick(ActionEvent event) {
        System.exit(0);

    }

}
