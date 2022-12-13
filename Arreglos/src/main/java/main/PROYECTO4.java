package main;

import java.util.Random;
import java.util.Scanner;

public class PROYECTO4 {
    public static void main(String[] args) {
        byte MAX_INTENTOS = true;
        byte LARGO_CODIGO = true;
        char PRIMERA_LETRA = true;
        char ULTIMA_LETRA = true;
        Scanner consola = new Scanner(System.in);
        Random random = new Random();
        char[] adivinador = new char[4];
        char[] pensador = new char[4];
        boolean[] evaluadasP = new boolean[4];
        boolean[] evaluadasA = new boolean[4];
        System.out.println("MasterMind V1.0");
        System.out.println("Dispones de 10 intentos para adivinar el codigo.\n");

        byte i;
        for(i = 0; i < 4; ++i) {
            int posibleLetra = random.nextInt(8) + 65;
            pensador[i] = (char)posibleLetra;
        }

        byte intentoActual = 0;

        boolean gano;
        do {
            ++intentoActual;
            System.out.print("Codigo " + intentoActual + " de 10>> ");
            String entrada = consola.nextLine();
            adivinador = entrada.toCharArray();

            for(i = 0; i < 4; ++i) {
                evaluadasP[i] = false;
                evaluadasA[i] = false;
            }

            byte b = 0;
            byte r = 0;

            for(i = 0; i < 4; ++i) {
                if (adivinador[i] == pensador[i]) {
                    ++b;
                    evaluadasP[i] = true;
                    evaluadasA[i] = true;
                }
            }

            for(i = 0; i < 4; ++i) {
                if (!evaluadasA[i]) {
                    for(byte j = 0; j < 4; ++j) {
                        if (!evaluadasP[j] && adivinador[i] == pensador[j]) {
                            ++r;
                            evaluadasP[j] = true;
                            evaluadasA[i] = true;
                            break;
                        }
                    }
                }
            }

            gano = b == 4;
            System.out.println("B= " + b + " R= " + r);
        } while(!gano && intentoActual < 10);

        if (gano) {
            System.out.print("EXCELENTE!!! Ganaste.");
        } else {
            System.out.print("PERDISTE!!! El codigo era ");
            char[] var19 = pensador;
            int var20 = pensador.length;

            for(int var21 = 0; var21 < var20; ++var21) {
                char c = var19[var21];
                System.out.print(c);
            }
        }
    }
}
