package main;

import java.util.Arrays;
import java.util.Random;

public class ArreglosBidimensionales {
    public static void main(String[] args) {
        char[][] tablaLetras = new char[5][3];
        var sorteador = new Random();
        System.out.println(tablaLetras[1][1]);

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 3; j++) {
                tablaLetras[i][j] = (char) (sorteador.nextInt(26)+65);//90-63+1
            }
        }
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(tablaLetras[i][j]+" ");
            }
            System.out.println();
        }
        /*System.out.println(tablaLetras);
        System.out.println(Arrays.toString(tablaLetras));*///NO FUNCIONA
    }
}
