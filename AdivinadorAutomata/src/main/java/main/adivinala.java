package main;

import java.util.Scanner;

public class adivinala {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        String option;
        boolean adivino=false,trampa=false;
        int max,min,maxIntentos,i,numeroPosible;

        System.out.println("Intentare adivinar un número que tu elijas.");
        System.out.println("Cuando indique un número tu deberás ingresar:");
        System.out.println("\t= si acierto el número que quieres que adivine.");
        System.out.println("\t> si el número que quieres que adivine es mayor al que mostré.");
        System.out.println("\t< si el número que quieres que adivine es menor al que mostré.");
        System.out.print("Dimel numero minimo: ");
        min = entrada.nextInt();entrada.nextLine();
        System.out.print("Dime número el máximo:");
        max = entrada.nextInt();entrada.nextLine();
        System.out.println();

        maxIntentos = (int) (Math.log(max-min+1)/Math.log(2)+1);
        System.out.println("Excelente, adivinaré el número en "+maxIntentos+" como máximo.");
        System.out.print("Presiona Enter para comenzar...");
        entrada.nextLine();
        System.out.println();


        for(i=0;i<=maxIntentos;i++){
            numeroPosible=((max-min)/2)+min;
            System.out.print("Intento "+i+" -> El numero es ..."+numeroPosible+": ");
            option = entrada.nextLine();

            switch (option) {
                case "=","si","yes","ajam" -> adivino = true;
                case "<" -> max = numeroPosible - 1;
                case ">" -> min = numeroPosible + 1;
            }
            if (adivino) break;
            if ((max < min)){
                System.out.println("¡¡¡ESTAS HACIENDO TRAMPA!!!");
                //trampa=true;
                break;
            }
        }
        /*if((i==maxIntentos) && (!adivino) && (!trampa)){
            System.out.println("¡¡¡GANASTE!!! No pude encontrar el número.");
        }elseif*/
        if (adivino) {
            System.out.println("¡¡¡GANÉ!!! ponmelo más difícil.");
        }
    }
}
