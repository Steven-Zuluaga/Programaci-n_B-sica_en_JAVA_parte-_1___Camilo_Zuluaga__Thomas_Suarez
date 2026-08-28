import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner teclado3 = new Scanner(System.in);

        int[] numeros1 = new int[10];

        int pares = 0;
        int impares = 0;

        for (int i = 0; i < 10; i++) {

            System.out.print("Ingrese el numero " + (i + 1) + ": ");
            numeros1[i] = teclado3.nextInt();

            if (numeros1[i] % 2 == 0) {
                pares++;
            } else {
                impares++;
            }
        }

        System.out.println("Cantidad de pares: " + pares);
        System.out.println("Cantidad de impares: " + impares);
    }
}
