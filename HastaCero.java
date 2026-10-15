import java.util.Scanner;

public class HastaCero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Escribe un número (0 para terminar): ");
        int numero = scanner.nextInt();

        
        while (numero != 0) {
            
            System.out.println("Escribiste: " + numero);

           
            System.out.print("Escribe otro número (0 para terminar): ");
            numero = scanner.nextInt();
        }

        System.out.println("Programa terminado ✅");
        scanner.close();
    }
}