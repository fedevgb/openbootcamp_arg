public class Main {
    public static void main(String[] args) {
        Cliente client = new Cliente();
        Trabajador trabajador = new Trabajador();

        System.out.println("Datos del Cliente:");
        //cliente
        client.nombre ="Federico A. Petrello";
        client.edad = 43;
        client.credito = 8252;
        client.telefono ="351-52489858";

        System.out.println("El nombre del cliente es: " + client.nombre);
        System.out.println("La edad del cliente es: " + client.edad);
        System.out.println("El credito disponible del cliente es: " + client.credito);
        System.out.println("El telefono del cliente es: " + client.telefono);


        System.out.println("=========================================");
        System.out.println("Datos del trabajador:");
        //trabajador
        trabajador.nombre="Juan Perez";
        trabajador.edad =55;
        trabajador.salario = 55.253;
        trabajador.telefono = "352-6889858";

        //mostramos datos del trabajador
        System.out.println("El nombre del trabajador es: " + trabajador.nombre);
        System.out.println("La edad del trabajador es: " + trabajador.edad);
        System.out.println("El salario del trabajador es: " + trabajador.salario);
        System.out.println("El telefono del trabajador es: " + trabajador.telefono);
    }

    //definimos la clase persona
    static class Persona {

        int edad;
        String nombre;
        String telefono;
    }

    //clase cliente
    static class Cliente extends Persona{
        int credito;
    }

    static class Trabajador extends Persona{
        double salario;
    }

}