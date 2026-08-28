import java.util.Scanner;

public class Ejercicio12 {
    public static void main(String[] args) {
        Scanner teclado5 = new Scanner(System.in);

        int[] numeros2 = new int[5];
        int opcion = 0;

        while (opcion != 3) {

            System.out.println("\nMenu");
            System.out.println("1. Llenar arreglo");
            System.out.println("2. Mostrar arreglo");
            System.out.println("3. Salir");
            System.out.print("Seleccione una opcion: ");

            opcion = teclado5.nextInt();

            switch (opcion) {

                case 1 -> {
                    for (int i = 0; i < 5; i++) {
                        System.out.print("Ingrese el numero " + (i + 1) + ": ");
                        numeros2[i] = teclado5.nextInt();
                    }

                    System.out.println("Arreglo llenado correctamente.");
                }

                case 2 -> {
                    System.out.println("Elementos del arreglo:");

                    for (int i = 0; i < 5; i++) {
                        System.out.println(numeros2[i]);
                    }
                }

                case 3 -> System.out.println("Programa finalizado.");

                default -> System.out.println("Opcion no valida.");
            }
        }

    }
}
