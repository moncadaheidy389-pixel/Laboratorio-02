import java.util.Scanner;

public class CalculadoraMenu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       
        System.out.print("Escribe el primer número: ");
        double num1 = scanner.nextDouble();

        System.out.print("Escribe el segundo número: ");
        double num2 = scanner.nextDouble();

       
        System.out.println("\n===== CALCULADORA =====");
        System.out.println("1. Sumar");
        System.out.println("2. Restar");
        System.out.println("3. Multiplicar");
        System.out.println("4. Dividir");
        System.out.print("Elige una operación: ");
        
        int opcion = scanner.nextInt();

        
        switch (opcion) {
            case 1 -> {
                double res = num1 + num2;
                System.out.println("Resultado: " + num1 + " + " + num2 + " = " + res);
            }
            case 2 -> {
                double res = num1 - num2;
                System.out.println("Resultado: " + num1 + " - " + num2 + " = " + res);
            }
            case 3 -> {
                double res = num1 * num2;
                System.out.println("Resultado: " + num1 + " × " + num2 + " = " + res);
            }
            case 4 -> {
                
                if (num2 == 0) {
                    System.out.println("Error: No se puede dividir entre cero.");
                } else {
                    double res = num1 / num2;
                    System.out.println("Resultado: " + num1 + " ÷ " + num2 + " = " + res);
                }
            }
            default -> System.out.println("Opción no válida.");
        }

        scanner.close();
    }
}