/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import pila.Pila;
import pila.Lanzamiento;
import java.net.URL;
import java.util.LinkedList;
import java.util.ResourceBundle;
import java.util.Timer;
import java.util.TimerTask;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;
import javafx.stage.Stage;
import javax.swing.JOptionPane;
import pila.OperacionesPila;
import pila.Tools;

/**
 *
 * @author david_orlando.mena@uao.edu.co David Orlando Mena 2180448
 * @author frank_dan.castillo@uao.edu.co Frank Daniel Castillo 2171721
 * @author cjay.zambrano@uao.edu.co Cjay Zambrano Liñan 2151536
 * @author maria_camila.reina@uao.edu.co Maria Camila Reina 2190037
 * @date Feb 2021
 */
public class FXMLDocumentController implements Initializable {

    private LinkedList<Lanzamiento> valoresRepetidos;
    private LinkedList<Lanzamiento> valores;

    @FXML
    private Label label;

    @FXML
    private TextField txtnum1;

    @FXML
    private TextField txtnum2;

    @FXML
    private TextField txtvalorRecibido;

    @FXML
    private TextArea txtA1;

    @FXML
    private WebView wv1;
    private WebEngine engine;

    Pila<Lanzamiento> pilaLanzamientos;
    Pila<Lanzamiento> numRepetidos;
    Timer timer;

    @FXML
    private void btnLanzamiento(ActionEvent event) {

        TimerTask task = new TimerTask() {
            @Override
            public void run() {
                int numDado1 = (int) (Math.random() * 6 + 1);
                int numDado2 = (int) (Math.random() * 6 + 1);
                Lanzamiento lanzar = new Lanzamiento(numDado1, numDado2);

                pilaLanzamientos.apilar(lanzar);
                Platform.runLater(() -> engine.loadContent(Tools.convertirPilaAHtml(pilaLanzamientos)));
                //txtA1.setText(pilaLanzamientos.toString());

            }
        };
        timer.schedule(task, 30, 4000);

    }

    @FXML
    private void btnMostrarUltimoLanzamiento(ActionEvent event) {
        Pila<Lanzamiento> ultimo = OperacionesPila.obtenerUltimo(pilaLanzamientos);
        JOptionPane.showMessageDialog(null, ultimo.toString());
    }

    @FXML
    private void btnParar(ActionEvent event) {
        timer.cancel();
    }

    @FXML
    private void btnNumRepetidos(ActionEvent event) {
        int valor;
        valor = Integer.parseInt(txtvalorRecibido.getText());
        numRepetidos = OperacionesPila.obtenerNumRepetido(pilaLanzamientos, valor);

        JOptionPane.showMessageDialog(null, "Las veces que ha salido el valor introducido son:"+numRepetidos.toString());
    }

    @FXML
    private void btnNumPares(ActionEvent event) {
        int valor1;
        int valor2;
        int vecesPar;
        Lanzamiento par= new Lanzamiento();
        valor1 = Integer.parseInt(txtnum1.getText());
        valor2 = Integer.parseInt(txtnum2.getText());
        Pila<Lanzamiento> parVeces = OperacionesPila.obtenerPar(pilaLanzamientos, valor1, valor2);
        par= parVeces.desapilar();
        vecesPar= par.getNumDado1();
        JOptionPane.showMessageDialog(null, "El número de veces que ha salido este par es de: "+ vecesPar+ " veces.");

    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {

        pilaLanzamientos = new Pila<>();
        timer = new Timer();
        numRepetidos = new Pila<>();
        engine = wv1.getEngine();

    }
}
