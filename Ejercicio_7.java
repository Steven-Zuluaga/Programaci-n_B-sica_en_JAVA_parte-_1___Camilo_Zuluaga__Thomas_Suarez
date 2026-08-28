import java.util.Random;

public class ejercicio7 {
    public static void main(String[] args) {

        Random rand = new Random();
        int[] numeros = new int[6];

        numeros[0] = rand.nextInt(100);
        numeros[1] = rand.nextInt(100);
        numeros[2] = rand.nextInt(100);
        numeros[3] = rand.nextInt(100);
        numeros[4] = rand.nextInt(100);
        numeros[5] = rand.nextInt(100);

        System.out.println("Numero 1: " + numeros[0]);
        System.out.println("Numero 2: " + numeros[1]);
        System.out.println("Numero 3: " + numeros[2]);
        System.out.println("Numero 4: " + numeros[3]);
        System.out.println("Numero 5: " + numeros[4]);
        System.out.println("Numero 6: " + numeros[5]);

        int mayor = numeros[0];

        if (numeros[1] > mayor) {
            mayor = numeros[1];
        } if (numeros[2] > mayor) {
            mayor = numeros[2];
        } if (numeros[3] > mayor) {
            mayor = numeros[3];
        } if (numeros[4] > mayor) {
            mayor = numeros[4];
        } if (numeros[5] > mayor) {
            mayor = numeros[5];
        }

        System.out.println("El mayor es: " + mayor);
    }
}
