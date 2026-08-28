import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {

        Scanner teclado1 = new Scanner(System.in);

        System.out.print("Ingrese el primer numero: ");
        double numero1 = teclado1.nextDouble();

        System.out.print("Ingrese el segundo numero: ");
        double numero2 = teclado1.nextDouble();

        System.out.print("Ingrese el operador (+, -, *, /): ");
        char operador = teclado1.next().charAt(0);

        switch (operador) {
            case '+' -> System.out.println("Resultado: " + (numero1 + numero2));
            case '-' -> System.out.println("Resultado: " + (numero1 - numero2));
            case '*' -> System.out.println("Resultado: " + (numero1 * numero2));
            case '/' -> System.out.println("Resultado: " + (numero1 / numero2));
            default -> System.out.println("Operador no valido");
        }
    }
}
