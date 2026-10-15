import java.util.Scanner;

public class BilleteraConsola {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nombre del titular: ");
        String titular = scanner.nextLine();

        double saldo = 0;
        int opcion;

        do {
            mostrarMenu();
            System.out.print("Opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1 -> {
                    saldo = registrarIngreso(scanner, saldo);
                }
                case 2 -> {
                    saldo = registrarGasto(scanner, saldo);
                }
                case 3 -> {
                    mostrarSaldo(saldo);
                }
                case 4 -> {
                    mostrarResumen(titular, saldo);
                }
                case 0 -> System.out.println("Programa finalizado.");
                default -> System.out.println("Opción no válida.");
            }

        } while (opcion != 0);

        scanner.close();
    }

    // 🔹 Muestra el menú → void
    static void mostrarMenu() {
        System.out.println();
        System.out.println("=========================");
        System.out.println("      MI BILLETERA");
        System.out.println("=========================");
        System.out.println("1. Registrar ingreso");
        System.out.println("2. Registrar gasto");
        System.out.println("3. Consultar saldo");
        System.out.println("4. Mostrar resumen");
        System.out.println("0. Salir");
    }

    
    static void mostrarSaldo(double saldo) {
        System.out.println("Saldo actual: $" + saldo);
    }

   
    static double registrarIngreso(Scanner scanner, double saldo) {
        System.out.print("Valor a ingresar: ");
        double valor = scanner.nextDouble();

        if (valor > 0) {
            saldo += valor;
            System.out.println("✅ Ingreso registrado");
        } else {
            System.out.println("⚠️ Solo valores mayores a 0");
        }
        return saldo;
    }

    
    static double registrarGasto(Scanner scanner, double saldo) {
        System.out.print("Valor del gasto: ");
        double valor = scanner.nextDouble();

        if (valor <= 0) {
            System.out.println("⚠️ Solo valores mayores a 0");
        } else if (valor > saldo) {
            System.out.println("⚠️ Saldo insuficiente");
        } else {
            saldo -= valor;
            System.out.println("✅ Gasto registrado");
        }
        return saldo;
    }

    // 🔹 Muestra resumen → void
    static void mostrarResumen(String titular, double saldo) {
        System.out.println("=========================");
        System.out.println("Titular: " + titular);
        System.out.println("Saldo:   $" + saldo);
        System.out.println("=========================");
    }
}