package logica;

import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * <b>Modelo del juego:</b><br>
 * <ul><li><b>dificultad</b> Arreglo de 1 celda con la dificultad del juego
 * <li><b>maxIntentos</b>  Cantidad de intentos con que se inicio segun la dificultad</li>
 * <li><b>estado</b> Arreglo de 1 celda conteniendo el estado actual</li>
 * <li><b>numeroSecreto</b> Numero secreto generadp</li>
 * <li><b>intentoActual</b> El intento actual</li>
 * <ul/>
 * @author steven
 */
public class Juego {
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

    private final Dificultad dificultad;
    private final int maxIntentos;
    private Estado estado;
    private final int numeroSecreto;
    private int intentoActual;


    public Dificultad obtenerDificultad() {
        return this.dificultad;
    }

    public int obtenerMaxIntentos() {
        return maxIntentos;
    }


    public Estado obtenerEstado() {
        return this.estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public int obtenerNumeroSecreto() {
        return numeroSecreto;
    }


    public int obtenerIntentoActual() {
        return this.intentoActual;
    }

    public void setIntentoActual(int intentoActual) {
        this.intentoActual = intentoActual;
    }






    public Juego (Dificultad d){
        //this.dificultad = new Dificultad;
        //this.maxIntentos = new int;
        //this.estado = new Estado;
        //this.numeroSecreto = new int;
        this.intentoActual = 0;

        this.dificultad = d;
        this.maxIntentos = (d == Dificultad.FACIL ? MAX_INTENTOS_FACIL : MAX_INTENTOS_DIFICIL);

        this.estado = Estado.JUGANDO;
        this.numeroSecreto = new Random().nextInt(NUMERO_MAXIMO)+1;
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
    public Resultado verificarNumero(int n,StringBuilder mensaje){
        this.intentoActual++;
        mensaje.setLength(0);
        Resultado resultado;

        if(n==this.numeroSecreto){
            this.estado= Estado.GANO;
            mensaje.append("¡¡¡GANASTE!!!");
            resultado = Resultado.ES_IGUAL;
        }else if(this.numeroSecreto<n){
            mensaje.append("EL numero a adivinar es menor.");
            resultado = Resultado.ES_MENOR;
        }else {
            mensaje.append("EL numero a adivinar es mayor.");
            resultado = Resultado.ES_MAYOR;
        }

        if((this.intentoActual == this.maxIntentos)  &&  this.estado!=Estado.GANO){//n!=this.numeroSecreto){
            mensaje.setLength(0);
            mensaje.append("¡¡¡PERDISTE!!! El número era: ").append(this.numeroSecreto).append(".");
            this.estado = Estado.PERDIO;
        }
        return resultado;
    }



}
