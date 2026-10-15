public class MostrarProducto {

    static void mostrarProducto(String nombre, double precio) {
        System.out.println("----------------");
        System.out.println("Nombre: " + nombre);       
        System.out.println("Precio: $" + precio);     
        System.out.println("----------------");
    }

    public static void main(String[] args) {
        
        mostrarProducto("Cuaderno", 8500);
        mostrarProducto("Lápiz", 1200);
        mostrarProducto("Bolso", 150000);
        mostrarProducto("Sacapuntas", 1500);
    }
}