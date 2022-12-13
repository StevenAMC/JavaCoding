package main;

import java.util.Arrays;
import java.util.Random;

public class NumerosAleatorioSinRepetir {
    public static void main(String[] args) {
        Random sorteador = new Random();
        int numero,cantidad = 10;
        int[] arregloSinRepetir = new int[cantidad];
        System.out.println(Arrays.toString(arregloSinRepetir));
        int tam = arregloSinRepetir.length,contador=0;

        for (int i = 0; i < tam; i++) {
            numero = sorteador.nextInt(cantidad);
            for (int j = 0; i >j; j++) {
                while(arregloSinRepetir[j]==numero) {
                    contador++;
                    //System.out.print(Arrays.toString(arregloSinRepetir));
                    //System.out.println("arrej"+j+"="+arregloSinRepetir[j]+" num "+numero);
                    numero = sorteador.nextInt(cantidad);
                    //System.out.println("gragado "+numero);
                    j=0;
                }
            }
            arregloSinRepetir[i] = numero;
        }
        System.out.println(Arrays.toString(arregloSinRepetir));
        System.out.println("Iteraciones "+contador);
    }
}
