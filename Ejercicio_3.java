import java.util.Scanner;

public class ejercicio3 {
    public static void main(String[] args) {

        Scanner edad = new Scanner(System.in);
        System.out.println("¿Cual es tu edad?");

        int number = edad.nextInt();

        if (number <= 17) {
            System.out.println("Menor de edad");
        } else if (number <= 64) {
            System.out.println("Adulto");
        } else {
            System.out.println("Adulto Mayor");
        }
    }
}
