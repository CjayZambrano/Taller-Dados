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
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.layout.VBox;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;
import javafx.stage.Stage;
import javax.swing.JOptionPane;
import pila.OperacionesPila;

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
    private TextArea txtA1;

    //@FXML
    //private WebView wv1;
    Pila<Lanzamiento> pilaLanzamientos;
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
                txtA1.setText(pilaLanzamientos.toString());

            }
        };
        timer.schedule(task, 30, 4000);

        //String mostrar = "";
        //mostrar = pilaLanzamientos.toString();
        //JOptionPane.showMessageDialog(null, mostrar);
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {

        pilaLanzamientos = new Pila<>();
        timer = new Timer();

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
        Pila<Lanzamiento> numRepetidos = OperacionesPila.obtenerNumRepetido(pilaLanzamientos);
        valoresRepetidos.clear();

        int valor1 = 0;
        int valor2 = 0;
        int valor3 = 0;
        int valor4 = 0;
        int valor5 = 0;
        int valor6 = 0;

        while (!numRepetidos.estaVacia()) {
            Lanzamiento auxiliar = numRepetidos.desapilar();
            int valordado1 = auxiliar.getNumDado1();
            int valordado2 = auxiliar.getNumDado2();

            if (valordado1 == 1) {
                valor1++;

            }
            if (valordado1 == 2) {
                valor2++;

            }
            if (valordado1 == 3) {
                valor3++;

            }
            if (valordado1 == 4) {
                valor4++;

            }
            if (valordado1 == 5) {
                valor5++;

            }
            if (valordado1 == 6) {
                valor6++;

            }
            if (valordado2 == 1) {
                valor1++;

            }
            if (valordado2 == 2) {
                valor2++;

            }
            if (valordado2 == 3) {
                valor3++;

            }
            if (valordado2 == 4) {
                valor4++;

            }
            if (valordado2 == 5) {
                valor5++;

            }
            if (valordado2 == 6) {
                valor6++;

            }
        }
        valoresRepetidos.add(new Lanzamiento(1, valor1));
        valoresRepetidos.add(new Lanzamiento(2, valor2));
        valoresRepetidos.add(new Lanzamiento(3, valor3));
        valoresRepetidos.add(new Lanzamiento(4, valor4));
        valoresRepetidos.add(new Lanzamiento(5, valor5));
        valoresRepetidos.add(new Lanzamiento(6, valor6));

        JOptionPane.showMessageDialog(null, numRepetidos.toString());
    }

    @FXML
    private void btnNumPares(ActionEvent event) {
        Pila<Lanzamiento> parVeces = OperacionesPila.obtenerParR(pilaLanzamientos);
        valores.clear();

        int valor1 = 0;
        int valor2 = 0;
        int valor3 = 0;
        int valor4 = 0;
        int valor5 = 0;
        int valor6 = 0;

        while (!parVeces.estaVacia()) {
            Lanzamiento auxiliar = parVeces.desapilar();
            int valordado1 = auxiliar.getNumDado1();
            int valordado2 = auxiliar.getNumDado2();

            if (valordado1 == 1 && valordado2 == 1) {
                valor1++;

            }
            if (valordado1 == 2 && valordado2 == 2) {
                valor2++;

            }
            if (valordado1 == 3 && valordado2 == 3) {
                valor3++;

            }
            if (valordado1 == 4 && valordado2 == 4) {
                valor4++;

            }
            if (valordado1 == 5 && valordado2 == 5) {
                valor5++;

            }
            if (valordado1 == 6 && valordado2 == 6) {
                valor6++;

            }
        }
        valores.add(new Lanzamiento(1, valor1));
        valores.add(new Lanzamiento(2, valor2));
        valores.add(new Lanzamiento(3, valor3));
        valores.add(new Lanzamiento(4, valor4));
        valores.add(new Lanzamiento(5, valor5));
        valores.add(new Lanzamiento(6, valor6));

        JOptionPane.showMessageDialog(null, parVeces.toString());

    }

}
