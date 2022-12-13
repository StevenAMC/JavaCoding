import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * Esta clase es deparametros string
 * @author steven
 */
public class ParametroString {
    public static AtomicInteger area = new AtomicInteger(0);
    //public static String mensajeArea = "aun no inicializado";
    public static StringBuilder mensajeArea = new StringBuilder("Aun no inicializado");
    public static Scanner entry = new Scanner(System.in);

    public static void main(String[] args) {
        int largo,ancho;
        int[] arr,errr;
        arr = new int[]{5, 6, 4};
        errr=new int[arr.length];
        System.arraycopy(errr,0,arr,0,arr.length);
        System.out.print("Largo >>");
        largo = entry.nextInt();entry.nextLine();
        System.out.print("Ancho >>");
        ancho = entry.nextInt();entry.nextLine();
        while (!areaRectangulo(largo,ancho,mensajeArea,area)){
            System.out.println(mensajeArea);
            System.out.print("Largo >>");
            largo = entry.nextInt();entry.nextLine();
            System.out.print("Ancho >>");
            ancho = entry.nextInt();entry.nextLine();
        }

        System.out.println("Area = "+area.get());
    }
        public static boolean areaRectangulo(int l, int a, StringBuilder mensaje, AtomicInteger area){
            //mensaje.delete(0,end);
            mensaje.setLength(0);
            if(l<=0 && a<=0){
                mensaje.append("Error l y a incorrectos.");
                //mensaje = "Error l y a incorrectos.";
                area.set(0);
                return false;
            } else if (l<=0) {
                mensaje.append("Error l incorrecto.");
                /*mensaje = "Error l incorrecto."*/;
                area.set(0);
                return false;
            } else if (a<=0) {
                mensaje.append("Error el ancho es incorrecto.");
                /*mensaje = "Error el ancho es incorrecto.";*/
                area.set(0);
                return false;
            }else {
                mensaje.append("Valores correctos");
                /*mensaje = "Valores correctos";*/
                area.set(l*a);
                return true;
            }
    }

}
