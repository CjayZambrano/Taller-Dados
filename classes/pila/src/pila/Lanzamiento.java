/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pila;

import pila.Base;

/**
 *
 * @author usuario
 */
public class Lanzamiento extends Base {

    private int numDado1;
    private int numDado2;

    public Lanzamiento() {
    }

    public Lanzamiento(int numDado1, int numDado2) {
        this.numDado1 = numDado1;
        this.numDado2 = numDado2;
    }

    public int getNumDado1() {
        return numDado1;
    }

    public void setNumDado1(int numDado1) {
        this.numDado1 = numDado1;
    }

    public int getNumDado2() {
        return numDado2;
    }

    public void setNumDado2(int numDado2) {
        this.numDado2 = numDado2;
    }   
    
    @Override
    public Base copy() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
       
}