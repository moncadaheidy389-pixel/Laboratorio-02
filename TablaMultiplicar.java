import java.util.Scanner;

public class TablaMultiplicar {
    public static void main(String[] args) {
        Scanner  scanner = new Scanner(System.in);
            
        System.out.println("Número: ");
        int Número = scanner.nextInt();

            for (int i = 1; i <= 10; i++) {
            int resultado = Número * i;
            System.out.println(Número + " x " + i + " = " + resultado);
        }

        scanner.close();
    }
}