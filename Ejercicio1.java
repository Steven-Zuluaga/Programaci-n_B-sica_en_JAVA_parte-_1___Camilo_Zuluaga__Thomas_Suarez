import java.util.Scanner;

public class ejercicio1 {
    public static void main(String[] args) {

        Scanner termometro = new Scanner(System.in);
        System.out.println("¿Cual es tu temperatura corporal?");

        int number = termometro.nextInt();

        if (number > 37.5) {
            System.out.println("Alerta: Posible fiebre");
        }
    }
}
