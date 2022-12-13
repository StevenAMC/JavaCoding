import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;

public class Registros02 {
    //propiedades inmutables
    //public static record Persona(String nombre,String apellido,byte edad){}
    public static record Persona(StringBuilder nombre, StringBuilder apellido, AtomicInteger edad){}
    public static void main(String[] args) {
        Persona p;
        String n,a;
        byte e;
        var consola = new Scanner(System.in);
        System.out.print("Ingresa tu nombre >> ");
        n = consola.nextLine();
        System.out.print("Ingresa tu apellido >> ");
        a = consola.nextLine();
        System.out.print("Ingresa tu edad >> ");
        e = consola.nextByte();consola.nextLine();
        //Constructir se encarga de instanciar un objeto de una clase especifica
        //p = new Persona(n,a,e);
        p = new Persona(new StringBuilder(n),new StringBuilder(a),new AtomicInteger(e));

        System.out.println(p.nombre+" "+p.apellido+" "+p.edad);

        AtomicInteger entero = new AtomicInteger();
        //NO p.edad = entero;
        p.edad.set(38); // No modifico el atrib edad estoy modificando su estado su valor interno
        //porque es un objeto
        p.nombre.setLength(0);
        p.nombre.append("Juan");//p sigue teniendo la misma referencia

    }


}
