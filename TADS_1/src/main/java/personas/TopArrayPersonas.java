package personas;

import java.util.Scanner;

/**
 * @author steven
 */

public class TopArrayPersonas {
    public static final int DEFAULT_ARRAY_LENGHT = 1000;
    private Persona[] listaPersonas;
    private int tope;

    /**
     * Crea una llista vacía con una capacidad maxima igual a DEFAULT_ARRAY_LENGHT
     */
    public TopArrayPersonas() {
        this.listaPersonas = new Persona[DEFAULT_ARRAY_LENGHT];
        this.tope = -1;
    }
    /**
     * Crea una lista vacía con una capacidad maxima segun la dada por el parametro
     * capacidad. Si el parametro es 0  o menor que 0
     */
    public TopArrayPersonas(int capacidad){
        capacidad = (capacidad<=0) ? DEFAULT_ARRAY_LENGHT:capacidad;
        this.listaPersonas = new Persona[capacidad];
        this.tope = -1;
    }

}
