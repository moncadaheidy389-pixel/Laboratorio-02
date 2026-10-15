import java.util.Scanner;

public class TipodeMetodoTitulo {

    static void MostrarTitulo() {
        System.out.println("--------------------------");
        System.out.println("      SISTEMA DE VENTAS   ");
        System.out.println("--------------------------");
    }

    static void mensajedeDespedida() {
        System.out.println("--------------------------");
        System.out.println("Gracias por utilizar el Java");
        System.out.println("Hasta pronto");
        System.out.println("---------------------------");
    }

    static double calcularSubtotal(double porcentaje, double monto) {
        return porcentaje * monto;
    }

    static double calcularDescuento(double monto, double porcentajeDescuento) {
        return monto * porcentajeDescuento;
    }

    public static void main(String[] args) {
        MostrarTitulo();

        double valor = 20000;
        // ✅ Valores en orden: (porcentaje, monto)
        double subtotal = calcularSubtotal(0.19, valor);
        System.out.println("Subtotal: " + subtotal);

        
        double descuento = calcularDescuento(valor, 0.10);
        double totalFinal = valor - descuento;
        System.out.println("Descuento: " + descuento);
        System.out.println("Total final: " + totalFinal);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Selecciona una opción: ");
        int opcion = scanner.nextInt();

       
        switch (opcion) {
            case 1 -> System.out.println("1. Registrar");
            case 2 -> System.out.println("2. Consultar");
            case 3 -> System.out.println("3. Resumen");
            case 0 -> mensajedeDespedida();
            default -> System.out.println("Opción no válida");
        }

        scanner.close();
    }
}