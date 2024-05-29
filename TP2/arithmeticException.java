package TP2;

public class arithmeticException {
    public static void main(String[] args) {
        // Inicializa dos variables: a y b
        int a = 10;
        int b = 0; // b es igual a 0, lo que provocará una excepción cuando intentemos dividir a por b


        // Intenta dividir a por b y captura la excepción si se produce
        try {
            // Esta línea lanza una ArithmeticException porque b es 0
            int resultado = a / b;
            System.out.println("El resultado de la división es: " + resultado);
        } catch (ArithmeticException e) {
            // Captura la excepción y muestra un mensaje indicando que ocurrió una excepción
            System.out.println("Ocurrió una ArithmeticException: No se puede dividir por cero.");
        }
    }

}
