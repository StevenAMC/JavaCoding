package main;

public class SalidaEstandarMain {
    public static void main(String[] args) {
        //lEYENDO eNTEROS
        int cant = 10;
        
        for (int i=1; i<=cant;i++){
            for(int j=cant-i+1;j>=1;j--) {
                System.out.print("*i");
            }
            System.out.println();
            System.out.println(i);
        }
        /*int i = 1;
        int j = 2;
        System.out.println("numeroMayor: " + ((i > j) ? "i es mayor" : "j es mayor"));*/

        /*final double pi = 3.14;//Declarar consantes enJava con final
        String nombrePersona,nombrePersona2;
        int edadPersona,edadPersona2;
        double ras = 5*Math.PI;
        var cabron = "sd-sd";
        System.out.println(cabron);
        System.out.println(cabron);
        */

        /*Scanner entrada = new Scanner(System.in);

        System.out.print("Ingresa tu nombre: ");
        nombrePersona = entrada.nextLine();
        System.out.print("Ingresa tu edad: ");
        edadPersona = entrada.nextInt();

        entrada.nextLine();//skip("[\r\n]+");

        System.out.print("Ingress otro nombre: ");
        nombrePersona2 = entrada.nextLine();
        System.out.print("Ingresa otra edad:" );
        edadPersona2 = entrada.nextInt();

        System.out.println("Hola "+nombrePersona+" tienes "+edadPersona+" años");*/

        /*String nombre;
        Scanner entrada = new Scanner(System.in);
        System.out.print("Escribe tu nombre: ");
        nombre = entrada.nextLine();
        System.out.println("Hola "+nombre);*/


        /*String vato = "Steven";
        String vata = "stEVen";
        int papa = 0,Papa,PAPA,PaPa;
        System.out.println(papa);
        System.out.println("Somos PROS");
        System.out.println();
        System.out.println(vato.toLowerCase(Locale.ROOT));
        System.out.println(vato.equals(vata));
        System.out.println("La Cedaa");
        System.out.println(vato.equalsIgnoreCase(vata));
        System.out.println(vato.compareTo("Steven"));
        System.out.println(vato.charAt(vato.length()-1));
        System.out.println(vato.replace("St","Zh"));
        System.out.println(vato.lastIndexOf('e'));
        System.out.println(vato.indexOf("e"));
        vato.contains("ee");
        vato.startsWith("a");
        System.out.println(vato.trim());
        String archivo = "gdee.py";
        int i = archivo.lastIndexOf('.');
        System.out.println(archivo.length());
        System.out.println(archivo.substring(i+1));
        String num = "2.56";
        double decimal = Double.parseDouble(num);
        float numi = Float.parseFloat(num);
        System.out.println(decimal);
        System.out.println(numi);
        String num2 = "2e2F";
        System.out.println(Float.parseFloat(num2));
        System.out.println(Double.parseDouble(num2));
        String ff = Float.toString((float) decimal);
        String fff= "aaa" + 'a';
        short iii = (short) papa;
        System.out.println("gaa"+0505);*/
        //String numero = JOptionPane.showInputDialog(null,"Ingresa un numero entero");
        //int numeroReal = Integer.parseInt(numero);
        //System.out.println("El numero real es "+numeroReal);
        //JOptionPane.showMessageDialog(null,"GAAA");
        /*Scanner entrada = new Scanner(System.in);
        System.out.print("Introduce un no entero: ");
        int numero = entrada.nextInt();
        System.out.println(numero);*/

    }
}
