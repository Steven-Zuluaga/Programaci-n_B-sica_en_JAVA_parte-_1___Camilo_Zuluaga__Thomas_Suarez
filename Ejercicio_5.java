import java.util.Scanner;

public class ejercicio5 {
    public static void main(String[] args) {

        Scanner num = new Scanner(System.in);
        System.out.println("Escribe un número de 1 a 7");
        int dia = num.nextInt();
        switch (dia) {
            case 1 -> System.out.println("Lunes - Día hábil");
            case 2 -> System.out.println("Martes - Día hábil");
            case 3 -> System.out.println("Miercoles - Día hábil");
            case 4 -> System.out.println("Jueves - Día hábil");
            case 5 -> System.out.println("Viernes - Día hábil");
            case 6 -> System.out.println("Sabado - Fin de semana");
            case 7 -> System.out.println("Domingo - Fin de semana");
        }
    }
}
