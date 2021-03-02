/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import pila.Pila;
import datos.Estudiante;

/**
 *
 * @author usuario
 */
public class MainEjemploPila {

    public static void main(String[] args) {
        Pila<Estudiante> pilaE = new Pila<>();
        pilaE.apilar(new Estudiante("201456", "Ingeniería Multimedia", "Mario", "Calle 48", "56389"));
        pilaE.apilar(new Estudiante("204236", "Ingeniería Informatica", "David", "Calle 50", "90853"));
        pilaE.apilar(new Estudiante("208743", "Comunicación Social", "Laura", "Calle 13", "53640"));
        pilaE.apilar(new Estudiante("209054", "Ingeniería Ambiental", "Camila", "Calle 20", "54637"));

        System.out.println("Estudiantes \n" + pilaE.toString());

        pilaE.desapilar();
        System.out.println("Cola d \n" + pilaE.toString());
    }
}
