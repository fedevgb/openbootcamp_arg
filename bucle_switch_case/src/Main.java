public class Main {
    public static void main(String[] args) {

     var station = "verano";

     switch (station){
         case "verano":
             System.out.println("Estamos en verano");
             break;
         case "otoño":
             System.out.println("Estamos en otoño");
             break;

         case "invierno":
             System.out.println("Estamos en invierno");
             break;

         case "primavera":
             System.out.println("Estamos en primavera");
             break;

         default:
             System.out.println("La estacion ingresada no existe");
     }

    }
}