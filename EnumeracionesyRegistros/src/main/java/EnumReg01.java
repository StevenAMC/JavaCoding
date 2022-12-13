public class EnumReg01 {
    public static enum Dias {DOMINGO,LUNES,MARTES,MIERCOLES,JUEVES,VIERNES,SABADO}


    public static void main(String[] args) {
        Dias d = Dias.LUNES;
        System.out.println(d.name());
        System.out.println(d.toString());
        impVi();

        Dias midia = Dias.SABADO;
        System.out.println("Antes de Invocar = "+midia);
        asignarDia(1,midia);
        System.out.println("Despues de Invocar = "+midia);
    }
    public static void impVi(){
        Dias[] dias = Dias.values();
        for (Dias dia : dias) {
            System.out.println(dia);
        }
    }
    public static void asignarDia(int i,Dias d){
        if(i>=0 && i<Dias.values().length){
            d = Dias.values()[i];
        }else d = Dias.DOMINGO;
    }
}
