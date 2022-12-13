import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * Program Adivinador utilizando enumerados,registros yrule switch
 * @author steven
 */
public class AdivinadorRecord {
    /**
     * Cantidad maxima de intentos en dificultad  facil
     */
    public static int MAX_INTENTOS_FACIL = 15;
    /**
     * Cantidad maxima de intentos en dificultad  facil
     */
    public static int MAX_INTENTOS_DIFICIL = 10;
    /**
     * Numero máximo de eleccion. Generado aleatoriamente.
     */
    public static int NUMERO_MAXIMO = 100;

    /**
     * Las Dificultades disponibles en el juego
     */
    public static enum Dificultad {FACIL,DIFICIL}

    /**
     * Los estados del juego<br>
     * <ul>
     * <li><b>JUGANDO: </b>El juego ha iniciado no se ha ganado ni perdido.</li>
     * <li><b>GANO: </b>El jugador adivinó el numero antes de agotar los intentos.</li>
     * <li><b>PERDIO: </b>El jugador agoto los intentos</li>
     * </ul>
     */
    public static enum Estado {JUGANDO,GANO,PERDIO}

    /**
     * Se utiliza para comparar el numero ingresado con elnumero secreto.
     */
    public static enum Resultado {ES_MAYOR,ES_IGUAL,ES_MENOR}

    /**
     * Modelo del juego:
     * @param dificultad Arreglo de 1 celda con la dificultad del juego
     * @param maxIntentos  Cantidad de intentos con que se inicio segun la dificultad
     * @param estado Arreglo de 1 celda conteniendo el estado actual
     * @param numeroSecreto Numero secreto generadp
     * @param intentoActual El intento actual
     */
    public static record Juego(
        Dificultad[] dificultad,
        AtomicInteger maxIntentos,
        Estado[] estado,
        AtomicInteger numeroSecreto,
        AtomicInteger intentoActual
    ){}

    /**
     * Inicializa un juego con los valores correctos acorde la dificultad asignada.
     * El estado inicial será JUGANDO , el intento actual 0. Y se genera el numero aleatorio.
     * @param d Dificultad con que se inciara el juego
     * @return  Un juego listo apra comenzar.
     * @see Dificultad
     * @see Estado
     * @see Juego
     * @see #NUMERO_MAXIMO
     */
    public static Juego iniciarJuego(Dificultad d){
        Juego j = new Juego(new Dificultad[1],new AtomicInteger(),new Estado[1],new AtomicInteger(),new AtomicInteger());
        j.dificultad[0] = d;
        j.maxIntentos.set(d == Dificultad.FACIL ? MAX_INTENTOS_FACIL : MAX_INTENTOS_DIFICIL);

        j.estado[0] = Estado.JUGANDO;
        j.numeroSecreto.set(new Random().nextInt(NUMERO_MAXIMO)+1);
        return j;
    }


    /**
     * Si n es igual que el numero secreto, se retorna ES_IGUAL, asimismo con ES_MENOR
     * y ES_MAYOR. Ademas se aumenta el numero de intentos y se cambia el estado del juego
     * por GANO si se advina el numero; PERDIO si se agotanlos intentos. EL parametro
     * mensaje obtendra un mensaje adecuado en funcion de lo que ocurra
     * @param n El numero ingresado por el usuario.
     * @param j El juego.
     * @param mensaje   El mensaje se obtendrá aquí.
     * @return  ES_IGUAL,ES_MENOR,ES_MAYOR en funcion del numero secreto comparado con n.
     */
    public static Resultado verificarNumero(int n,Juego j,StringBuilder mensaje){
        j.intentoActual.set(j.intentoActual.get()+1);
        mensaje.setLength(0);
        Resultado resultado;

        if(n==j.numeroSecreto.get()){
            j.estado[0] = Estado.GANO;
            mensaje.append("¡¡¡GANASTE!!!");
            resultado = Resultado.ES_IGUAL;
        }else if(j.numeroSecreto.get()<n){
            mensaje.append("EL numero a adivinar es menor.");
            resultado = Resultado.ES_MENOR;
        }else {
            mensaje.append("EL numero a adivinar es mayor.");
            resultado = Resultado.ES_MAYOR;
        }

        if((j.intentoActual.get() == j.maxIntentos.get())  &&  n!=j.numeroSecreto.get()){
            mensaje.setLength(0);
            mensaje.append("¡¡¡PERDISTE!!! El número era: ").append(j.numeroSecreto).append(".");
            j.estado[0] = Estado.PERDIO;
        }
        return resultado;

    }


    /**
     * Lógica del juego
     * @param args argumentos CLI
     */
    public static void main(String[] args) {
        String dif;
        var consola = new Scanner(System.in);
        Juego juego;
        int numeoUsuario;
        Resultado resultado;
        StringBuilder mensaje = new StringBuilder();

        System.out.print("Elige la dificultad [F]FACIL/[D]DIFICIL >> ");
        dif = consola.nextLine();
        while (dif.length() != 1 || (dif.charAt(0) != 'F' && dif.charAt(0) != 'D')){
            System.out.print("ERROR: Ingresa D o F >> ");
            dif = consola.nextLine();
        }

        juego = switch (dif){
            case "F" -> iniciarJuego(Dificultad.FACIL);
            case "D" -> iniciarJuego(Dificultad.DIFICIL);
            default -> iniciarJuego(Dificultad.FACIL);
        };
        System.out.println("\nDispones de "+juego.maxIntentos+" intentos para adivinar.\n");
        System.out.println("JavaTRUCO\uD83D\uDE0E: "+juego.numeroSecreto.get());
        do{
            System.out.print("Intento "+(juego.intentoActual.get()+1)+" >> ");
            numeoUsuario = consola.nextInt();consola.nextLine();
            resultado = verificarNumero(numeoUsuario,juego,mensaje);
            /*switch (resultado){
                case ES_IGUAL -> break;//mensaje gano
                case ES_MENOR -> break;

            }*/

            System.out.println(mensaje);
        }while (juego.estado[0] == Estado.JUGANDO);

    }
}
