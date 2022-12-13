package main;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class BusquedaLineal {
    //color in your output
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";
    //background color
    public static final String ANSI_BLACK_BACKGROUND = "\u001B[40m";
    public static final String ANSI_RED_BACKGROUND = "\u001B[41m";
    public static final String ANSI_GREEN_BACKGROUND = "\u001B[42m";
    public static final String ANSI_YELLOW_BACKGROUND = "\u001B[43m";
    public static final String ANSI_BLUE_BACKGROUND = "\u001B[44m";
    public static final String ANSI_PURPLE_BACKGROUND = "\u001B[45m";
    public static final String ANSI_CYAN_BACKGROUND = "\u001B[46m";
    public static final String ANSI_WHITE_BACKGROUND = "\u001B[47m";

    public static void main(String[] args) {
        //System.out.println("yo");
        var console = new Scanner(System.in);
        var generadorAleatorio = new Random();
        int[] numeros = new int[10], posiciones = new int[10];
        int tope = -1 , numeroBuscado;

        //Generar números al azar en el array
        for (int i = 0; i < 10; i++) {
            numeros[i]=generadorAleatorio.nextInt(10)+1;
        }
        System.out.print(ANSI_GREEN +"Número buscado: >> "+ ANSI_YELLOW);
        System.out.print(ANSI_RESET);
        numeroBuscado = console.nextInt();console.nextLine();

        for (int i = 0; i < 10; i++) {
            if (numeros[i]==numeroBuscado) {
                tope++;
                posiciones[tope]=i;
            }
        }
        System.out.println("Arreglo original: "+ Arrays.toString(numeros));
        System.out.print("Posiciones: ");
        for (int i = 0; i <= tope; i++) {
            System.out.println(" "+posiciones[i]);
        }
    }
}
