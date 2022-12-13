import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * Esta clase es cool.
 * @author sven
 */
public class ejemplos {
    public static String ga = "NAda";
    public static int x,y;
    public static AtomicInteger a;

    public static void main(String[] args) {
        a = new AtomicInteger(0);
        System.out.println("a = "+a.get());
        x = 5;
        y = 6;
        ejemplos.ga = "ok";
        System.out.println(ga);
        if(areaRectangulo(x,y,a)){
            System.out.println("a = "+a);
            System.out.println("x = "+x);
            System.out.println("y = "+y);
        }
        else System.out.println("No hay valores correctos");


        /*Scanner entrada = new Scanner(System.in);
        var otro = new Scanner(System.in);

        ala("yaaa mano",'a');
        System.out.println(unDoble(2));
        System.out.print("Ingresa algo >>");
        int lar = otro.nextInt();otro.nextLine();
        System.out.println(lar);
        System.out.println(ga);
        *//*System.out.println("a".chars().);*//*
        String gaaa = "gg aaaa";
        System.out.println(esEntero(""));*/
    }
    public static void  ala(String okok,char jijia){
        System.out.println("yaaa"+okok+"oh tu vi"+jijia);
        ejemplos.ga="hili";

    }
    public static boolean esEntero(String valor){
        if (valor.length()==0) return false;
        for (int i = 0; i < valor.length(); i++) {
            if(valor.charAt(i)<'0' || valor.charAt(i)>'9') return false;
        }
        return true;
    }
    public static boolean areaRectangulo(int largo,int ancho, AtomicInteger area){
        if (ancho>0 && largo>0){
            area.set(largo*ancho);
            return true;
        }
        area.set(0);
        return false;
    }

    public static double unDoble(int n){
        return 2*n;
    }
}
