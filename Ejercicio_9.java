import java.util.Scanner;

public class ejercicio9 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double suma = 0;
        int contador = 0;

        System.out.print("Ingresa la calificación 1 (0,0 - 5,0): ");
        double nota1 = sc.nextDouble();
        System.out.print("Ingresa la calificación 2 (0,0 - 5,0): ");
        double nota2 = sc.nextDouble();
        System.out.print("Ingresa la calificación 3 (0,0 - 5,0): ");
        double nota3 = sc.nextDouble();
        System.out.print("Ingresa la calificación 4 (0,0 - 5,0): ");
        double nota4 = sc.nextDouble();
        System.out.print("Ingresa la calificación 5 (0,0 - 5,0): ");
        double nota5 = sc.nextDouble();

        double[] notas = {nota1, nota2, nota3, nota4, nota5};

        if (notas[0] >= 3.0) {
            suma = suma + notas[0];
            contador++;
        } if (notas[1] >= 3.0) {
            suma = suma + notas[1];
            contador++;
        } if (notas[2] >= 3.0) {
            suma = suma + notas[2];
            contador++;
        } if (notas[3] >= 3.0) {
            suma = suma + notas[3];
            contador++;
        } if (notas[4] >= 3.0) {
            suma = suma + notas[4];
            contador++;
        }

        if (contador > 0) {
            double promedio = suma / contador;
            System.out.println("El promedio de las notas aprobadas es: " + String.format("%.2f", promedio));
        } else {
            System.out.println("No hay notas aprobadas.");
        }
    }
}
