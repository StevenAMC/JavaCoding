package main;

import java.util.Arrays;
import java.util.Random;

public class LetrasAleatoriasSinRepet {
    public static void main(String[] args) {
        int numero;
        Random sorteador = new Random();
        char letra;
        for (int i = 0; i <= 100; i++) {
            numero = sorteador.nextInt(90-65+1)+65;
            letra = (char) numero;
            System.out.print(letra+" ");
        }
    }
}
