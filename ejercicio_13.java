public class ejercicio13 {
    public static void main(String[] args) {

        char[] tallas = {'S', 'M', 'L','S', 'M','S'};

        int contadorS = 0;
        int contadorM = 0;
        int contadorL = 0;

        for (int i = 0; i < tallas.length; i++) {
            switch (tallas[i]) {
                case 'S' -> contadorS++;
                case 'M' -> contadorM++;
                case 'L' -> contadorL++;
            }
        }

        System.out.println("Tallas S: " + contadorS);
        System.out.println("Tallas M: " + contadorM);
        System.out.println("Tallas L: " + contadorL);

        if (contadorL == 0) {
            System.out.println("Falta stock de talla grande");
        }
    }
}
