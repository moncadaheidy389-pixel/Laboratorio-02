public class CompararCantidades {
    public static void main(String[] args) {
        int inventario = 12;
        int cantidadSolicitada = 8;

        boolean haySuficiente = cantidadSolicitada <= inventario;
        boolean esExactaIgual = cantidadSolicitada == inventario;
        boolean supera = cantidadSolicitada > inventario;

        System.out.println("¿Hay suficiente? " + haySuficiente);
        System.out.println("¿Cantidad igual al inventario? " + esExactaIgual);
        System.out.println("¿Supera el inventario? " + supera);
    }
}