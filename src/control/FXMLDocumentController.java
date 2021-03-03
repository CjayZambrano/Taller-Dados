/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import pila.Pila;
import pila.Lanzamiento;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;
import javafx.stage.Stage;

/**
 *
 * @author usuario
 */
public class FXMLDocumentController implements Initializable {
    
    //@FXML
    //private Label label;
    
    Pila<Lanzamiento> pilaLanzamientos;
    
    //@FXML
    //private void handleButtonAction(ActionEvent event) {

    //}
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        pilaLanzamientos = new Pila<>();
        
    }

    public static void FXMLDocumentController(String[] args){
        Application.launch(args);
    }
    
    public void start(Stage stage) throws Exception {
        WebView myWebView = new WebView();
        WebEngine engine = myWebView.getEngine();
        
        Button btn = new Button("Load Google");
        btn.setOnAction(new EventHandler<ActionEvent>() {
            
            public void handle(ActionEvent event) {
                engine.load("https://wwww.google.com");
            }
        });
        
        Button btn2 = new Button("Execute JavaScript");
        btn2.setOnAction(new EventHandler<ActionEvent>() {
            
            public void handle(ActionEvent event) {
                engine.executeScript("window.location = \"https://www.youtube.com/\";");
            }
        });
        
        Button btn3 = new Button("Load Local");
        btn3.setOnAction(new EventHandler<ActionEvent>() {
            
            public void handle(ActionEvent event) {
                engine.loadContent("C:\\Users\\usuario\\Documents\\Hoja de Vida html\\Hoja de vida.html");
            }
        });
        
        VBox root = new VBox();
        root.getChildren().addAll(myWebView, btn, btn2);
        
        Scene scene = new Scene(root, 800, 500);
        stage.setScene(scene);
        
        stage.show();
    }    
}
