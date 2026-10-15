import java.util.Scanner;

public class DescuentoCompra {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Nombre del cliente: ");
        String nombre = scanner.nextLine();

        System.out.print("Valor de la compra: $");
        double valorCompra = scanner.nextDouble();

        
        double porcentaje;

        
        if (valorCompra >= 500000) {
            porcentaje = 0.15;
        } else if (valorCompra >= 250000) {
            porcentaje = 0.10;
        } else if (valorCompra >= 100000) {
            porcentaje = 0.05;
        } else {
            porcentaje = 0.0;
        }

        
        double valorDescuento = valorCompra * porcentaje;
        double totalFinal = valorCompra - valorDescuento;

        
        System.out.println("\n==============================");
        System.out.println("Cliente: " + nombre);
        System.out.println("Valor original: $" + valorCompra);
        System.out.println("Descuento aplicado: " + (porcentaje * 100) + "%");
        System.out.println("Valor del descuento: $" + valorDescuento);
        System.out.println("TOTAL A PAGAR: $" + totalFinal);
        System.out.println("==============================");

        scanner.close();
    }
}