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
    
}
