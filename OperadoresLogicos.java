public class OperadoresLogicos {
    public static void main(String[] args) {
        // Ejemplo 1: && (Y)
        int edad = 21;
        boolean documentoValido = true;
        boolean puedeIngresar = edad >= 18 && documentoValido;
        System.out.println("Puede ingresar: " + puedeIngresar);

        // Ejemplo 2: || (O)
        boolean tieneCarnet = false;
        boolean tieneAutorizacion = true;
        boolean puedeEntrar = tieneCarnet || tieneAutorizacion;
        System.out.println("Puede entrar: " + puedeEntrar);
    }
}