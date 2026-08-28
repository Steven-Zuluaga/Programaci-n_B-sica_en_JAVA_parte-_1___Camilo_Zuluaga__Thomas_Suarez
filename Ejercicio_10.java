import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner teclado4 = new Scanner(System.in);

        String[] nombres = new String[8];

        for (int i = 0; i < 8; i++) {
            System.out.print("Ingrese un nombre " + (i + 1) + ": ");
            nombres[i] = teclado4.nextLine();
        }

        System.out.print("Ingrese el nombre que desea buscar: ");
        String buscar = teclado4.nextLine();

        boolean encontrado = false;

        for (int i = 0; i < 8; i++) {

            if (nombres[i].equals(buscar)) {
                encontrado = true;
            }
        }

        if (encontrado) {
            System.out.println("Encontrado");
        } else {
            System.out.println("No encontrado");
        }
    }
}
