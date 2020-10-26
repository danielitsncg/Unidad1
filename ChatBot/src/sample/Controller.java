package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.VBox;

public class Controller {

    @FXML
    VBox vbox;
    @FXML
    TextField txtmensaje;

    public void enter(KeyEvent event){
        if (event.getCode()== KeyCode.ENTER){
        Label label = new Label("Usuario dice:" +txtmensaje.getText());
        vbox.getChildren().add(label);


            String respuesta = chatBot(txtmensaje.getText().toLowerCase());
            Label label2 = new Label(respuesta);
            vbox.getChildren().add(label2);
        }
    }
    boolean pidioPieza=false;
    
    public String chatBot(String mensaje){
        String respuesta = "ChatBot dice: Podrias repetir la pregunta";
        if (mensaje.contains("hola")){
            respuesta="Chat bot dice: Muy bien y usted? en que le puedo ayudar";

        }else if (mensaje.contains("pieza")){
            respuesta="Chat bot dice: Escriba la marca modelo y cual pieza necesita";
            pidioPieza=true;

        }else if (pidioPieza){
            String[] datos= mensaje.split(" ");
            String modelo=datos[1];
            int indice1=mensaje.indexOf(modelo)+modelo.length();
            int indice2=mensaje.length();
            String pieza= mensaje.substring(indice1,indice2);
            respuesta="Chat bot dice: La pieza " +pieza+" del auto "+datos[0]+" "+datos[1]+" Si la tenemos en existencia ";
            pidioPieza=false;
        }

        return respuesta;
    }
}
