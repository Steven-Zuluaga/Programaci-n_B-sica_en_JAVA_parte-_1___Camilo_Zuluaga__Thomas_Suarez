import java.util.Scanner;

public class ejercicio15 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String[] productos = {"Camisa", "Pantalon", "Zapatos"};
        int[] cantidades = {5, 3, 0};

        int opcion = 0;

        while (opcion != 3) {
            System.out.println("\n MENU ");
            System.out.println("1. Vender producto");
            System.out.println("2. Mostrar inventario");
            System.out.println("3. Salir");
            System.out.print("Elige una opcion: ");
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1 -> {
                    System.out.print("Nombre del producto a vender: ");
                    String nombreBuscado = sc.nextLine();
                    boolean encontrado = false;

                    for (int i = 0; i < productos.length; i++) {
                        if (productos[i].equalsIgnoreCase(nombreBuscado)) {
                            encontrado = true;
                            if (cantidades[i] > 0) {
                                cantidades[i]--;
                                System.out.println("Venta realizada. Quedan: " + cantidades[i]);
                            } else {
                                System.out.println("Agotado");
                            }
                        }
                    }

                    if (!encontrado) {
                        System.out.println("Producto no encontrado");
                    }
                }


                case 2 -> {
                for (int i = 0; i < productos.length; i++) {
                    System.out.println(productos[i] + ": " + cantidades[i]);
                }

            }
                case 3 -> {
                    System.out.println("Saliendo del sistema...");
                }

                default -> {
                    System.out.println("Opcion invalida");
                }
            }
        }
    }
}
