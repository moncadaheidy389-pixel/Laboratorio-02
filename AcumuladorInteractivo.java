import java.util.Scanner;

public class AcumuladorInteractivo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int suma = 0;
        int valor;

        do {
            System.out.print("Valor: ");
            valor = scanner.nextInt();

            if (valor != 0) { // ✅ Solo suma si NO es cero
                suma = suma + valor;
                System.out.println("Acumulado: " + suma);
            }

        } while (valor != 0); // Termina cuando escribe 0

        System.out.println("Programa finalizado.");
        scanner.close();
    }
}