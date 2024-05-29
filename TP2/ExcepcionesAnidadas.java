package TP2;

import java.io.*;

public class ExcepcionesAnidadas {
    public static void main(String[] args) {
        try {
            produceExceptions();
        } catch (IOException e) {
            System.out.println("Se ha producido una IOException: " + e.getMessage());
            try {
                produceArithmeticException();
            } catch (ArithmeticException ae) {
                System.out.println("Se ha producido una ArithmeticException: " + ae.getMessage());
                try {
                    produceNullPointerException();
                } catch (NullPointerException ne) {
                    System.out.println("Se ha producido una NullPointerException: " + ne.getMessage());
                }
            }
        }
    }

    static void produceExceptions() throws IOException {
        throw new IOException("Esta es una excepción de IO intencional");
    }

    static void produceArithmeticException() {
        throw new ArithmeticException("Esta es una excepción aritmética intencional");
    }

    static void produceNullPointerException() {
        throw new NullPointerException("Esta es una excepción de puntero nulo intencional");
    }
}

