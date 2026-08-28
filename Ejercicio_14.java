import java.util.Scanner;

public class Ejercicio14 {
    public static void main(String[] args) {
        Scanner teclado6 = new Scanner(System.in);

        int[] estratos = new int[4];
        double[] descuentos = new double[4];

        for (int i = 0; i < 4; i++) {

            System.out.print("Ingrese el estrato del cliente " + (i + 1) + ": ");
            estratos[i] = teclado6.nextInt();

            switch (estratos[i]) {

                case 1, 2 -> descuentos[i] = 20;
                case 3, 4 -> descuentos[i] = 10;
                case 5, 6 -> descuentos[i] = 0;
                default -> {
                    descuentos[i] = 0;
                    System.out.println("Estrato no válido");
                  
                }
            }
        }

        System.out.println("\nDescuentos:");

        for (int i = 0; i < 4; i++) {
            System.out.println(
                    "Cliente " + (i + 1) + ": " + descuentos[i] + "%");
        }
    }
}
