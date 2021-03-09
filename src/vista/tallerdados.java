/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author david_orlando.mena@uao.edu.co David Orlando Mena     2180448 
 * @author frank_dan.castillo@uao.edu.co Frank Daniel Castillo  2171721
 * @author cjay.zambrano@uao.edu.co Cjay Zambrano Liñan         2151536
 * @author maria_camila.reina@uao.edu.co Maria Camila Reina     2190037
 * @date Feb 2021
 * @version 1.0
 */ 
public class tallerdados extends Application {
    
    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));
        
        Scene scene = new Scene(root);
        
        stage.setScene(scene);
        stage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
