package TP2.jerarquia;

public class EjemploExcepsiones {
    public static void main(String[] args) {
        try {
            int numerador = 10;
            int denominador = 0;
            if (denominador == 0) {
                throw new DivisionPorCeroException();
            }
            int resultado = numerador / denominador;
            System.out.println("Resultado: " + resultado);
        } catch (DivisionPorCeroException e) {
            System.err.println(e.getMessage());
        }
    }
}
