package main;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class PROYECTO3mastermind {
    public static void main(String[] args) {
        final byte MAX_INTENTOS = 10;
        final byte LARGO_CODIGO = 4;
        final char PRIMERA_LETRA = 'A';
        final char ULTIMA_LETRA = 'H';

        Scanner inputs = new Scanner(System.in);
        Random randomizer = new Random();

        char[] pensador = new char[4];
        char[] adivinador = new char[4];

        boolean[] coincidePens = new boolean[4], coincideAdv = new boolean[4];

        int letraRand;
        for (int i = 0; i < LARGO_CODIGO; i++) {
            letraRand = randomizer.nextInt((int)ULTIMA_LETRA-(int)PRIMERA_LETRA+1)+(int)(PRIMERA_LETRA);
            for (int j = 0; i >j; j++) {
                while(pensador[j] == letraRand) {
                    letraRand = randomizer.nextInt((int)ULTIMA_LETRA-(int)PRIMERA_LETRA+1)+(int)(PRIMERA_LETRA);
                    j=0;
                }
            }
            pensador[i] = (char) letraRand;
        }
        System.out.println(Arrays.toString(pensador));
        ///
        System.out.println("MasterMind V1.0");
        System.out.println("Dispones de "+MAX_INTENTOS+" intentos para adivinar el código.\n");

        int intento = 0;
        boolean logrado = false;

        do {
            intento++;
            System.out.print("Codigo " + intento + " de "+MAX_INTENTOS+" >> ");
            String entrada = inputs.nextLine();
            adivinador = entrada.toCharArray();

            for(int i = 0; i < 4; i++) coincidePens[i] = false;
            coincideAdv = coincidePens;

            int buenos = 0;
            int regulares = 0;

            for(int i = 0; i < 4; i++) {
                if (adivinador[i] == pensador[i]) {
                    buenos++;
                    coincidePens[i] = true;
                    coincideAdv[i] = true;
                }
            }

            for(int i = 0; i < 4; i++)
                if (!coincideAdv[i])
                    for (int j = 0; j < 4; j++)
                        if (!coincidePens[j] && adivinador[i] == pensador[j]) {
                            regulares++;
                            /*coincidePens[j] = true;
                            coincideAdv[i] = true;*/
                            break;
                        }

            if( buenos==4 ) logrado=true;
            System.out.println("B= " + buenos + " R= " + regulares);

        } while(!logrado && intento < MAX_INTENTOS);

        if (logrado) {
            System.out.print("EXCELENTE!!! Ganaste.");
        } else {
            System.out.print("PERDISTE!!! El codigo era ");
            for (char c : pensador) {
                System.out.print(c);
            }
        }
    }
}
