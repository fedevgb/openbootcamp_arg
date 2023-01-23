public class Main {
    public static void main(String[] args) {
        Persona Persons = new Persona();

        Persons.setName("Federico A. Petrello");
        Persons.setEdad(43);
        Persons.setTelefono("351-5149465");

        //mostramos por pantalla

        System.out.println("Mi nombre completo es: " +Persons.getName());
        System.out.println("Tengo: " + Persons.getEdad() + " Anios");
        System.out.println("Mi celular es: " + Persons.getTelefono());
    }

    //definimos la clase persona

    static class Persona {

        //Definimos las variable de forma privada

        private String name;
        private int edad;
        private String telefono;


        public void setName(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        //getter and setter variable edad
        public void setEdad(int Edad){
            this.edad=Edad;
        }

        public int getEdad(){
            return edad;
        }

        //getters and setter telefono

        public void setTelefono(String telefono) {
            this.telefono = telefono;
        }

        public String getTelefono() {
            return telefono;
        }
    }

}