package main;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class PROYECTO2 {
    public static void main(String[] args) {
        //Constantes para estandarizar los valores del programa
        final short MAX_TARJETAS_GRUPO= 7; //Tarjetas por grupo
        final short MAX_GRUPOS= 3; //Cantidad de grupos
        final short MAX_TARJETAS= MAX_TARJETAS_GRUPO*MAX_GRUPOS; //Total de tarjetas.
        final short MIN_TARJETA_VALOR= 'A'; //Tarjeta incial, en este caso letra A.
        final short MAX_TARJETA_VALOR= (char)(MAX_TARJETAS + (int)(MIN_TARJETA_VALOR) - 1); //Tarjeta final.
        //Variables que deben usarse para resolver el problema.
        char[] grupo1 = new char[MAX_TARJETAS_GRUPO],
               grupo2 = new char[MAX_TARJETAS_GRUPO],
               grupo3 = new char[MAX_TARJETAS_GRUPO];
        char[] deck= new char[MAX_TARJETAS];
        Scanner entrada = new Scanner(System.in);
        var generador = new Random();
        int indice, intentos = 0;
        String opcion;

        for (int i = 0; i < MAX_TARJETAS; i++) {
            indice = generador.nextInt((int)MAX_TARJETA_VALOR-(int)MIN_TARJETA_VALOR+1)+(int)(MIN_TARJETA_VALOR);
            for (int j = 0; i >j; j++) {
                while(deck[j]==indice) {
                    indice = generador.nextInt((int)MAX_TARJETA_VALOR-(int)MIN_TARJETA_VALOR+1)+(int)(MIN_TARJETA_VALOR);
                    j=0;
                }
            }
            deck[i] = (char) indice;
        }

        for (int i = 0; i < 7; ++i) {
            grupo1[i] = deck[i];
            grupo2[i] = deck[i+7];
            grupo3[i] = deck[i+14];
        }

        System.out.println("Haremos 3 secuencias. Empecemos...");

        do {
            intentos++;
            System.out.println("Secuencia " + intentos + ":\n");

            for (int i = 0; i < 7; ++i) System.out.println("\t\t" + grupo1[i] + "\t" + grupo2[i] + "\t" + grupo3[i]);

            System.out.print("\nEn qué grupo esta tu tarjeta [1,2,3]: ");
            opcion = entrada.nextLine();

            while(!opcion.equals("1") && !opcion.equals("2") && !opcion.equals("3")) {
                System.out.print("\nERROR - Opcion incorrecta, ingresa una opcion valida [1,2,3]: ");
                opcion = entrada.nextLine();
            }

            switch (opcion) {
                case "1":
                    for (int i = 0; i < 7; i++) {
                        deck[i] = grupo2[i ];
                        deck[i + 7] = grupo1[i];
                        deck[i + 14] = grupo3[i];
                    }
                    break;
                case "2":
                    for (int i = 0; i < 7; i++) {
                        deck[i] = grupo1[i];
                        deck[i + 7] = grupo2[i];
                        deck[i + 14] = grupo3[i];
                    }
                    break;

                case "3":
                    for (int i = 0; i < 7; i++) {
                        deck[i] = grupo1[i];
                        deck[i + 7] = grupo3[i];
                        deck[i + 14] = grupo2[i];
                    }
                    break;
            }

            for (int i = 0; i < 7; ++i) {
                grupo1[i] = deck[3*i];
                grupo2[i] = deck[3*i+1];
                grupo3[i] = deck[3*i+2];
            }
        } while (intentos < 3);

        System.out.print("Obviamente elegiste la " + deck[10]);
    }
}
