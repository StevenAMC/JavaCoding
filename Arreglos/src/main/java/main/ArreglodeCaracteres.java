package main;

import java.util.Arrays;
import java.util.Scanner;

public class ArreglodeCaracteres {
    public static void main(String[] args) {
        //String no es un arreglo de caracteres en java
        //String es un objeto en java
        final int CANTIDAD_CARACTERES;
        var entrada = new Scanner(System.in);
        String frase,letraString;
        int contador = 0;
        System.out.print("Ingrese una frase >> ");
        frase = entrada.nextLine();
        CANTIDAD_CARACTERES = frase.length();
        System.out.print("Ingresa un caracter >> ");
        letraString = entrada.nextLine();
        //Clase con operacione estaticas, no debo crear un obj para usarlas
        char letraChar = letraString.charAt(0);
        letraChar = Character.toLowerCase(letraChar);

        char[] simbolis;// = new char[CANTIDAD_CARACTERES];
        simbolis = frase.toCharArray();

        for (char simboli : simbolis) {
            if(Character.toLowerCase(simboli)==letraChar)
                contador++;
        }
        System.out.println("El caracter "+letraChar+" aparece "+contador+" veces.");
        //char[] simbolos = new char[CANTIDAD_CARACTERES];
        char[] simbolos = {'A','B','C','C'};
        System.out.println(Arrays.toString(simbolos));
        for (char simbolo : simbolos) {
            System.out.print(simbolo);
        }
    }
}
