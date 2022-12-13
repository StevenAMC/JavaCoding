package personas;

public class Persona {
    public static final int EDAD_MAXIMA = 100;
    public static final int MAYORIA_EDAD = 18;
    private String nombre,apellido,documento,nacionalidad;
    private int edad;
    //CONSTRUCTORAS
    public Persona(String nombre, String apellido, String documento, String nacionalidad, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.documento = documento;
        this.nacionalidad = nacionalidad;
        this.edad = edad;
    }
    //SELECTORAS --> GETTER
    public String obtenerNombre(){
        return this.nombre;
    }
    public String obtenerApellido(){
        return this.apellido;
    }
    public String obtenerDocumento(){
        return this.documento;
    }
    public String obtenerNacionalidad(){
        return this.nacionalidad;
    }
    public int obtenerEdad(){
        return this.edad;
    }
    //MODIFICADORAS --> SETTER
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public void setApllido(String apellido){
        this.apellido = apellido;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public void setEdad(int edad) {
        if (edad<1 || edad>EDAD_MAXIMA){
            this.edad = 1;
        }else {
            this.edad = edad;
        }
    }
    //PREDICADOS
    public boolean esMayorDeEdad() {
        return this.edad >= MAYORIA_EDAD;
    }
    //operaciones DESTRUCTORAS
    //BEAN objeto que contiene constructor selectoree getter setter
}
