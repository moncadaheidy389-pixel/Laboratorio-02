public class AccesoActividad {
    public static void main(String[] args) {
        // Variables
        int edad = 20;
        boolean inscripcionActiva = true;
        boolean documentoPresentado = true;

        // Cálculos
        boolean esMayorDeEdad = edad >= 18;
        boolean cumpleInscripcionYDocumento = inscripcionActiva && documentoPresentado;
        boolean cumpleLosTres = esMayorDeEdad && inscripcionActiva && documentoPresentado;

        // Mostrar resultados
        System.out.println("¿Es mayor de edad? " + esMayorDeEdad);
        System.out.println("¿Cumple inscripción y documento? " + cumpleInscripcionYDocumento);
        System.out.println("¿Cumple los tres requisitos? " + cumpleLosTres);
    }
}