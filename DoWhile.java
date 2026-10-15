import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
          Scanner scanner = new Scanner(System.in);
          int opcion;

        do { 
            System.out.println("\n=== MENÚ ===");
            System.out.println("1. Opción uno");
            System.out.println("2. Opción dos");
            System.out.println("0. Salir");
            System.out.print("Elige: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1 -> System.out.println("Elegiste la opción 1");
                case 2 -> System.out.println("Elegiste la opción 2");
                case 0 -> System.out.println("Saliendo...");
                default -> System.out.println("Opción no válida");
            }
        } while (opcion != 0); 

        scanner.close();
    }
}
