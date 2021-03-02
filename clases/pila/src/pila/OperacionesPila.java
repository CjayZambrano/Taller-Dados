/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pila;

/**
 *
 * @author usuario
 */
public class OperacionesPila<T extends Base> {

    public static <T extends Base> Pila<T> duplicar(Pila<T> pilaOriginal) {
        Pila<T> pilaDuplicada = new Pila<>();
        Pila<T> pilaAux = new Pila<>();

        while (pilaOriginal.estaVacia()) {
            pilaAux.apilar(pilaOriginal.desapilar());
        }

        while (!pilaAux.estaVacia()) {
            T elemento1 = pilaAux.desapilar();
            T elemento2 = (T) elemento1.copy();
            pilaOriginal.apilar(elemento1);
            pilaDuplicada.apilar(elemento2);
        }
        return pilaDuplicada;
    }
}
