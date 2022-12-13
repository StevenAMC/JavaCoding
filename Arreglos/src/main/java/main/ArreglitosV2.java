package main;

import java.util.Arrays;

public class ArreglitosV2 {
    public static void main(String[] args) {
        int[] miArreglo = new int[12];//Los arreglos en Java son objetos.
        int[] miArreglo2 = new int[12];
        //String[] palab = new String[12];
        System.out.println(args.length);
        System.out.println(Arrays.toString(args));

        String[] palab = {"hola","cara","de","Java"},palab2={"hola","cara","de","Java"};//"holamundo Java
        int largo = 2;
        double[] arrDo = new double[largo];
        arrDo[1]=2.5;
        System.out.println(Arrays.toString(arrDo));
        for (String arg:args) {
            System.out.println(arg);
            System.out.println("ya");
        }
        int[] misInts = new int[]{10, 8, 9, 6};
        for (int misInt : misInts) {
            System.out.print(misInt);
        }
        System.out.println();


        for(int i=0;i< miArreglo.length;i++){
            miArreglo[i]=i;
            miArreglo2[i]=i;
            System.out.print(miArreglo[i]+" ");
        }
        System.out.println();
        System.out.println(Arrays.equals(miArreglo, miArreglo2));//Funcion estatica no requiero un obj equals , lo invoco directamente
        int gas = ((Arrays.equals(miArreglo, miArreglo2))? 1:2);
        System.out.println(gas);
        System.out.println(Arrays.toString(palab));
        System.out.println(Arrays.equals(palab,palab2));

        System.out.println("\nNada la venada");
        System.out.println(Arrays.toString(miArreglo));

    }
}
