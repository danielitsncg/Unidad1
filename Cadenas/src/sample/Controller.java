package sample;

import com.sun.org.apache.xpath.internal.objects.XNull;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class Controller {
    @FXML Label lbl_lineas;
    @FXML TextArea txt_receta;
    @FXML protected void initialize(){
try {
    File f = new File("./src/sample/archivo.txt");
    BufferedReader br = new BufferedReader(new FileReader(f));
    String texto="";
    while ( (texto = br.readLine())!=null){
        txt_receta.appendText("\n"+texto);
    }
}catch (Exception e){
    txt_receta.setText(e.getMessage());
}
    }
    public void Procesar(ActionEvent event){
        String[] arregloLineas = txt_receta.getText().split("\n");
        lbl_lineas.setText("Lineas: " +arregloLineas.length);
        boolean encontro=false;
        for (int x=0;x<arregloLineas.length;x++){
            if (arregloLineas[x].contains("queso")){
                String[] arr2=arregloLineas[x].split(" ");
                System.out.println(arr2[0]);
            }
            if (arregloLineas[x].contains("manzanas")){
                String[] arr2= arregloLineas[x].split(" ");
                System.out.println("unidad: "+ arr2[1]);
            }
            if (encontro){
                System.out.println(arregloLineas[x]);
            }
            if (arregloLineas[x].contains("******")){
                encontro=true;
            }
        }
    }
}
