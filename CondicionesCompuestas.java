public class CondicionesCompuestas {
    public static void main(String[] args) {
         boolean membresiaActiva = true;
         double totalCompra = 250000;

        if (membresiaActiva && totalCompra >= 200000) {
            System.out.println("Aplica beneficio.");
        } else {
            System.out.println("No aplica beneficio.");
        }
    }
}
