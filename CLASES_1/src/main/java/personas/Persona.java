package personas;

public class Persona {
    private static int cantidadObjetosPersona = 0;
    public static int obtenerCantidadObjPersonas(){
        return cantidadObjetosPersona;
    }
    private String nombre;
    private String apellido;
    private byte edad;
    public Persona(String n,String a,byte e){
        nombre =n;
        apellido = a;
        edad = e;
        cantidadObjetosPersona++;
    }


    public String obtenerNombre() {
        return nombre;
    }

    public void asignarNombre(String n) {
        nombre = n;
    }


    public String obtenerApellido() {
        return apellido;
    }

    public void asignerApellido(String a) {
        apellido = a;
    }

    public byte obtenerEdad() {
        return edad;
    }

    public void asignarEdad(byte e) {
        if(e<1 || e>100) edad =1;
        else edad = e;
    }

    @Override
    public void finalize(){
        cantidadObjetosPersona--;
        System.out.println(this.nombre+" --Destruído");
    }

}
