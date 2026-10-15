public class CompararTexto {
    public static void main(String[] args) {
        String ciudad = "Bogotá";

        System.out.println("¿Es Bogotá? " + ciudad.equals("Bogotá"));
        System.out.println("¿Es Medellín? " + ciudad.equals("Medellín"));
        System.out.println("¿Es bogotá? " + ciudad.equalsIgnoreCase("bogotá"));
    }
}
