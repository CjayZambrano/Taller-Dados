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
import javax.swing.JOptionPane;

/**
 *
 * @author david_orlando.mena@uao.edu.co David Orlando Mena     2180448 
 * @author frank_dan.castillo@uao.edu.co Frank Daniel Castillo  2171721
 * @author cjay.zambrano@uao.edu.co Cjay Zambrano Liñan         2151536
 * @author maria_camila.reina@uao.edu.co Maria Camila Reina     2190037
 * @date Feb 2021 
 */ 
public class FXMLDocumentController implements Initializable {
    
    //@FXML
    //private Label label;
    
    //@FXML
    //private WebView wv1;
    
    Pila<Lanzamiento> pilaLanzamientos;
    
    @FXML
    private void btnLanzamiento(ActionEvent event) {
        
        int numDado1 = (int)(Math.random()*6 + 1);;
        int numDado2 = (int)(Math.random()*6 + 1);;
        
        pilaLanzamientos.apilar(new Lanzamiento(numDado1, numDado2));
        
        String mostrar = "";            
        mostrar = pilaLanzamientos.toString();
        
        JOptionPane.showMessageDialog(null, mostrar);
        
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        pilaLanzamientos = new Pila<>();
        
    }
    
}
