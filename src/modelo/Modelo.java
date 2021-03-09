/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import pila.Lanzamiento;
import pila.OperacionesPila;
import pila.Pila;

/**
 *
 * @author david_orlando.mena@uao.edu.co David Orlando Mena 2180448
 * @author frank_dan.castillo@uao.edu.co Frank Daniel Castillo 2171721
 * @author cjay.zambrano@uao.edu.co Cjay Zambrano Liñan 2151536
 * @author maria_camila.reina@uao.edu.co Maria Camila Reina 2190037
 * @date Feb 2021
 * @version 1.0
 */
public class Modelo {

    public static Pila<Lanzamiento> obtenerUltimo(Pila<Lanzamiento> pilaOriginal) {
        Pila<Lanzamiento> pilaUltimo = new Pila<>();
        Pila<Lanzamiento> pilaDuplicada = OperacionesPila.duplicar(pilaOriginal);
        pilaUltimo.apilar(pilaDuplicada.desapilar());
        return pilaUltimo;
    }

    @SuppressWarnings(value = "unchecked")
    public static Pila<Lanzamiento> obtenerPar(Pila<Lanzamiento> pilaOriginal, int valorp1, int valorp2) {
        Pila<Lanzamiento> pilaPar = new Pila<>();
        Pila<Lanzamiento> pilaDuplicada = OperacionesPila.duplicar(pilaOriginal);
        int cont = 0;
        int valorppp = 0;
        while (!pilaDuplicada.estaVacia()) {
            Lanzamiento elemento1 = pilaDuplicada.desapilar();
            Lanzamiento elemento = elemento1;
            int valor1 = elemento.getNumDado1();
            int valor2 = elemento.getNumDado2();
            if (valor1 == valorp1 && valor2 == valorp2) {
                cont++;
            }
            Lanzamiento nPar = new Lanzamiento(cont, 0);
            pilaPar.apilar(nPar);
        }
        return pilaPar;
    }

    @SuppressWarnings(value = "unchecked")
    public static Pila<Lanzamiento> obtenerNumRepetido(Pila<Lanzamiento> pilaOriginal, int valorRepetido) {
        Pila<Lanzamiento> pilaNumRepetido = new Pila<>();
        Pila<Lanzamiento> pilaDuplicada = OperacionesPila.duplicar(pilaOriginal);
        int repetidoDado1 = 0;
        int repetidoDado2 = 0;
        while (!pilaDuplicada.estaVacia()) {
            Lanzamiento elemento1 = pilaDuplicada.desapilar();
            Lanzamiento elemento = elemento1;
            int valor1 = elemento.getNumDado1();
            int valor2 = elemento.getNumDado2();
            if (valor1 == valorRepetido) {
                repetidoDado1++;
            }
            if (valor2 == valorRepetido) {
                repetidoDado2++;
            }
        }
        Lanzamiento elemento3 = new Lanzamiento(repetidoDado1, repetidoDado2);
        pilaNumRepetido.apilar(elemento3);
        return pilaNumRepetido;
    }
    
    @SuppressWarnings(value = "unchecked")
    public static Pila<Lanzamiento> obtenerParPromedio(Pila<Lanzamiento> pilaOriginal, int valorp1) {
        Pila<Lanzamiento> pilaParPromedio = new Pila<>();
        Pila<Lanzamiento> pilaDuplicada = OperacionesPila.duplicar(pilaOriginal);
        int contppp = 0;
        int cont  = 0;
        int cont1 = 0;
        int cont2 = 0;
        int cont3 = 0;
        int cont4 = 0;
        int cont5 = 0;
        int cont6 = 0;
        while (!pilaDuplicada.estaVacia()) {
            Lanzamiento elemento1 = pilaDuplicada.desapilar();
            Lanzamiento elemento = elemento1;
            int valor1 = elemento.getNumDado1();
            int valor2 = elemento.getNumDado2();
            if (valor1 == 1 && valor2 == 1) {
                cont1++;
                cont++;
            }
            if (valor1 == 2 && valor2 == 2) {
                cont2++;
                cont++;
            }
            if (valor1 == 3 && valor2 == 3) {
                cont3++;
                cont++;
            }
            if (valor1 == 4 && valor2 == 4) {
                cont4++;
                cont++;
            }
            if (valor1 == 5 && valor2 == 5) {
                cont5++;
                cont++;
            }
            if (valor1 == 6 && valor2 == 6) {
                cont6++;
                cont++;
            }
            //cadena de if el valor anterior es mayor al presente muestre ese valo (el mayor)
            if (cont1 > cont2 && cont1 > cont3 && cont1 > cont4 && cont1 > cont5 && cont1 > cont6) {
                contppp = 1;
            }
            if (cont2 > cont1 && cont2 > cont3 && cont2 > cont2 && cont2 > cont5 && cont2 > cont6) {
                contppp = 2;
            }
            if (cont3 > cont1 && cont3 > cont2 && cont3 > cont4 && cont3 > cont5 && cont3 > cont6) {
                contppp = 3;
            }
            if (cont4 > cont1 && cont4 > cont2 && cont4 > cont3 && cont4 > cont5 && cont4 > cont6) {
                contppp = 4;
            }
            if (cont5 > cont1 && cont5 > cont2 && cont5 > cont3 && cont5 > cont4 && cont5 > cont6) {
                contppp = 5;
            }
            if (cont6 > cont1 && cont6 > cont2 && cont6 > cont3 && cont6 > cont4 && cont6 > cont5) {
                contppp = 6;
            }
            Lanzamiento nParP = new Lanzamiento(cont, 0);
            pilaParPromedio.apilar(nParP);
        }
        return pilaParPromedio;
    }
   
}
