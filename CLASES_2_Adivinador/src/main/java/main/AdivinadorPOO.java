package main;
import logica.Juego;

import java.util.Scanner;

public class AdivinadorPOO {
    /**
     * Lógica del juego
     * @param args argumentos CLI
     */
    public static void main(String[] args) {
        String dif;
        var consola = new Scanner(System.in);
        Juego juego;
        int numeoUsuario;
        Juego.Resultado resultado;
        StringBuilder mensaje = new StringBuilder();

        System.out.print("Elige la dificultad [F]FACIL/[D]DIFICIL >> ");
        dif = consola.nextLine();
        while (dif.length() != 1 || (dif.charAt(0) != 'F' && dif.charAt(0) != 'D')){
            System.out.print("ERROR: Ingresa D o F >> ");
            dif = consola.nextLine();
        }

        juego = switch (dif){
            case "F" -> new Juego(Juego.Dificultad.FACIL);
            case "D" -> new Juego(Juego.Dificultad.DIFICIL);
            default -> new Juego(Juego.Dificultad.FACIL);
        };
        System.out.println("\nDispones de "+juego.obtenerMaxIntentos()+" intentos para adivinar.\n");
        System.out.println("JavaTRUCO\uD83D\uDE0E: "+juego.obtenerNumeroSecreto());


        do{
            System.out.print("Intento "+(juego.obtenerIntentoActual()+1)+" >> ");
            numeoUsuario = consola.nextInt();consola.nextLine();
            resultado = juego.verificarNumero(numeoUsuario,mensaje);
            /*switch (resultado){
                case ES_IGUAL -> break;//mensaje gano
                case ES_MENOR -> break;

            }*/

            System.out.println(mensaje);
        }while (juego.obtenerEstado() == Juego.Estado.JUGANDO);

    }
}
