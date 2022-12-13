package main;

import personas.Empleado;
import personas.Persona;

public class Clases {
    public static Persona pp = null; //static Para q sea usada dentro del main
    public static Persona p,p2;

    public static Empleado e;

    public static void main(String[] args) {


        for (int i = 0; i < 20; i++) {
            p = new Persona("Objeto "+i,"",(byte) i);
        }
        System.gc();
        System.out.println("Cantidad de personas existentes "+Persona.obtenerCantidadObjPersonas());
       /* Persona p;
        p = new Persona("Vladimir","Roduiguez",(byte) 32);
        p2 = new Persona("Vladimir","Roduiguez",(byte) 32);
        e = new Empleado(p,Empleado.Cargo.JEFE);
        System.out.println("Nombre: "+e.obtenerPersona().obtenerNombre()+" Apellido: "+e.obtenerPersona().obtenerApellido()+
                " Sueldo: "+e.obtenerSueldo());
        e.cambiarCargo(Empleado.Cargo.PRESIDENTE);

        System.out.println("Nombre: "+e.obtenerPersona().obtenerNombre()+" Apellido: "+e.obtenerPersona().obtenerApellido()+
                " Sueldo: "+e.obtenerSueldo());

        System.out.println(p.obtenerNombre());*/
        

    }
}
