import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {

        Scanner teclado2 = new Scanner(System.in);

        int[] numeros = new int[5];

        for (int i = 0; i < 5; i++) {
            System.out.print("Ingrese el numero " + (i + 1) + ": ");
            numeros[i] = teclado2.nextInt();
        }

        System.out.println("Numeros ingresados:");

        for (int i = 0; i < 5; i++) {
            System.out.println(numeros[i]);
        }
    }
}
