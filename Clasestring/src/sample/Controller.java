package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import javax.swing.*;

public class Controller {

    @FXML TextField txtfrase;
    @FXML Label lblresultado;
    @FXML ComboBox comboBox;
    @FXML protected void initialize(){
        comboBox.getItems().addAll("Char At","Ends with");
    }

    public void evento(ActionEvent event){
        String texto=txtfrase.getText();
switch (comboBox.getSelectionModel().getSelectedIndex()){
    case 0:{
char res=texto.charAt(2);
lblresultado.setText(res+"");
        break;
    }
    case 1:{
boolean res=texto.endsWith("ota");
lblresultado.setText(res+"");
        break;
    }
}
    }
}
