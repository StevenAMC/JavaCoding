package personas;

public class Empleado {
    //CONSTANTES PUBLICAS ESTATICAS
    public static enum Cargo{ADMINISTRATIVO,JEFE,PRESIDENTE}
    public static int SUELDO_ADMINISTRATIVO = 500;
    public static int SUELDO_JEFE = 1000;
    public static int SUELDO_PRESIDENTE = 1500;

    //ATRIBUTOS
    private Persona persona;
    private int sueldo;
    private Cargo cargo;

    public Empleado(Persona p,Cargo c){
        persona = p;
        cargo = c;
        sueldo = switch (cargo){
            case ADMINISTRATIVO -> SUELDO_ADMINISTRATIVO;
            case JEFE -> SUELDO_JEFE;
            case PRESIDENTE -> SUELDO_PRESIDENTE;
        };
    }
    public void cambiarCargo(Cargo c){
        cargo = c;
        sueldo = switch (cargo){
            case ADMINISTRATIVO -> SUELDO_ADMINISTRATIVO;
            case JEFE -> SUELDO_JEFE;
            case PRESIDENTE -> SUELDO_PRESIDENTE;
        };
    }
    public Cargo obtenerCargo(){
        return cargo;
    }
    public int obtenerSueldo(){
        return sueldo;
    }
    public Persona obtenerPersona(){
        return persona;
    }

}
