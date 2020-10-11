package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import javax.swing.*;

public class Controller {

    @FXML
    TextField txtfrase;
    @FXML
    Label lblresultado;
    @FXML
    ComboBox comboBox;

    @FXML
    protected void initialize() {
        comboBox.getItems().addAll("Char At", "Ends with", "replace", "indexOf", "replaceFirst",
                "equalsIgnoreCase", "lastIndexOf", "startsWith", "compareTo", "split", "subString");
    }

    public void evento(ActionEvent event) {
        String texto = txtfrase.getText();
        switch (comboBox.getSelectionModel().getSelectedIndex()) {
            case 0: {
                char res = texto.charAt(2);
                lblresultado.setText(res + "");
                break;
            }
            case 1: {
                boolean res = texto.endsWith("ota");
                lblresultado.setText(res + "");
                break;
            }
            case 2: {
                String res = texto.replace("p", "e");
                lblresultado.setText(res);
                break;
            }
            case 3: {
                int res = texto.indexOf("p", 0);
                lblresultado.setText(res + "");
                break;
            }
            case 4: {
                String res = texto.replaceFirst("p", "e");
                lblresultado.setText(res);
                break;
            }
            case 5: {
                boolean res = texto.equalsIgnoreCase("PeLOTa");
                lblresultado.setText(res + "");
                break;
            }
            case 6: {
                int res = texto.lastIndexOf("e");
                lblresultado.setText(res + "");
                break;
            }
            case 7: {
                Boolean res = texto.startsWith("p");
                lblresultado.setText(res + "");
                break;
            }
            case 8: {
                String k = "Kiubo";
                int res = texto.compareTo(k);
                lblresultado.setText(res + "");
                break;
            }
            case 9: {
                String[] res = texto.split(":");
                for (String a : res)
                    lblresultado.setText(a);
                break;
            }
            case 10: {
                String res = texto.substring(2);
                lblresultado.setText(res);
                break;
            }
        }
    }
}
