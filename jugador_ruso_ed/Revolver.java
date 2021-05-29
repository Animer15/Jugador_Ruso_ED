package com.poniente.project.es.jugador_ruso_ed;

import java.util.Random;

public class Revolver {

    /**
     *Tres atributos el 1vy 2 son privados de tipo int
     * el 3 es publico constante de tipo int.
     */
    private int posRealBala;
    private int posActualDisparo;
    public final int POSICIONES = 6;

    /**
     *El constructor del Revolver sin parametro.
     * Selectiona una posicion de bala entre 1 y 6 de una manera aleatoria
     * y la afecta a un variable "posRealBala" y en el mismo tiempo llamada
     * al metodo girarCilindro.
     */
    public Revolver() {
        Random r = new Random();
        posRealBala = r.nextInt(POSICIONES);
        girarCilindro();
    }

    /**
     * Metodo que devuelve dos mensajes que monstran la posicion de "Bala".
     */
    public void mirarPosiciones() {
        System.out.println("Pista: la bala está en la pos: " + posRealBala);
        System.out.println("Pista: la posicion actual a disparar es: " + posActualDisparo);
    }

    /**
     * Metodo para saber si la "Bala" esta dipara o no.
     * Si no el cilindro avanza +1.
     */
    public boolean disparar() {
        boolean exito = false;

        if (posRealBala == posActualDisparo) {
            exito = true;
        }

        avanzarCilindro();
        return exito;
    }

    /**
     * Metodo que incrementa de +1 el cilindro del Revolver, una vez llegado a 6
     * devuelve a 0.
     */
    private void avanzarCilindro() {
        posActualDisparo++;
        //
        if (posActualDisparo == 6) {
            posActualDisparo = 0;
        }
        
    }

    /**
     * Metodo que afecta a la variable "posActualDisparo" una posicion aliatoria 
     * entre 0 y 6. 
     */
    public void girarCilindro() {
        Random r = new Random();
        posActualDisparo = r.nextInt(POSICIONES);
    }

    /**
     * Metodo sirbe para avanzar de una manera controlada para el jugador.
     *
     */
    public void girarCilindro(int nPosiciones) {
        posActualDisparo = (posActualDisparo + nPosiciones) % POSICIONES;
    }
}
