package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

public class Controller {
    @FXML
    private Text textZinsbetrag;

    @FXML
    private TextField zinssatz;
    @FXML
    private TextField anlagedauer;
    @FXML
    private TextField anlagebetrag;

    @FXML
    public void berechneZinsbetrag(ActionEvent event) {

        Zinsrechner zinsrechner = new Zinsrechner();
        double zinsbetrag = zinsrechner.berechneZinsen(Double.valueOf(zinssatz.getText()), Double.valueOf(anlagebetrag.getText()), Integer.valueOf(anlagedauer.getText()));
        textZinsbetrag.setText(zinsrechner.rundeBetrag(zinsbetrag) + " €");
    }
}
