public class Acumulador {
    public static void main(String[] args) {
        int suma = 0;

        for (int numero = 1; numero <= 5; numero++) {
            suma = suma + numero;
        }

        System.out.println("Suma: " + suma);
    }
}