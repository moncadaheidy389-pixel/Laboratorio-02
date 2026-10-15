public class CondicionesAnidadas {
    public static void main(String[] args) {
     int edad = 16;
        boolean tieneDocumento = true;

        if (edad >= 18) {
            if (tieneDocumento) {
                System.out.println("Ingreso autorizado.");
            } else {
                System.out.println("Debe presentar documento.");
            }
        } else {
            System.out.println("No cumple la edad requerida.");
        }
    }
}