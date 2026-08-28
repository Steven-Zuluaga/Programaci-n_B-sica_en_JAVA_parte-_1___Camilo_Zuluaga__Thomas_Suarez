import java.util.Scanner;

public class ejercicio11 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double[] notas = new double[5];

        for (int i = 0; i < 5; i++) {
            System.out.print("Ingresa la nota " + (i + 1) + " (0,0 - 5,0): ");
            notas[i] = sc.nextDouble();
        }

        for (int i = 0; i < 5; i++) {
            if (notas[i] >= 4.5) {
                System.out.println("Nota " + (i + 1) + " (" + notas[i] + "): Excelente");
            } else if (notas[i] >= 3.5) {
                System.out.println("Nota " + (i + 1) + " (" + notas[i] + "): Bueno");
            } else if (notas[i] >= 3.0) {
                System.out.println("Nota " + (i + 1) + " (" + notas[i] + "): Aprobado");
            } else {
                System.out.println("Nota " + (i + 1) + " (" + notas[i] + "): Reprobado");
            }
        }
    }
}
