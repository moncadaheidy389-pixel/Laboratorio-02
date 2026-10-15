import java.util.Scanner;

public class ConversorMenu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.println("===== CONVERSOR =====");
        System.out.println("1. Kilómetros a metros");
        System.out.println("2. Metros a centímetros");
        System.out.println("3. Celsius a Fahrenheit");
        System.out.println("0. Salir");
        System.out.print("Elige una opción: ");
        
        int opcion = scanner.nextInt();

        
        switch (opcion) {
            case 1 -> {
                System.out.print("Escribe los kilómetros: ");
                double km = scanner.nextDouble();
                double metros = km * 1000;
                System.out.println(km + " km = " + metros + " metros");
            }
            case 2 -> {
                System.out.print("Escribe los metros: ");
                double m = scanner.nextDouble();
                double cm = m * 100;
                System.out.println(m + " m = " + cm + " cm");
            }
            case 3 -> {
                System.out.print("Escribe los grados Celsius: ");
                double c = scanner.nextDouble();
                double f = (c * 1.8) + 32;
                System.out.println(c + "°C = " + f + "°F");
            }
            case 0 -> System.out.println("Saliendo...");
            default -> System.out.println("Opción no válida");
        }

        scanner.close();
    }
}