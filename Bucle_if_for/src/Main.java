
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //para leer por teclado
        Scanner escan = new Scanner(System.in);



        //ingresamos un numero

        System.out.println("Ingrese un número");
    double numero = escan.nextDouble();

        if(numero == 0){
            System.out.println("es Neutro");
        }else if(numero<0){
            System.out.println("el numero ingresado es negativo");
        }else {
            System.out.println("El numero ingresado es positivo");
        }



    }
}