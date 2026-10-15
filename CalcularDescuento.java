public class CalcularDescuento {
    
     static double calcularDescuento(double subtotal, double porcentaje) {return subtotal * porcentaje;

     }
    
    public static void main(String[] args){

        double subtotal = 20000;
        double descuento = calcularDescuento(subtotal, 0.10);
        System.out.println(descuento);
    }
}
