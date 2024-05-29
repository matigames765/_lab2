package TP2;
import java.io.*;
public class IOExceptionExample {
    public static void main(String[] args) {
        try {
            produceIOException();
        } catch (IOException e) {
            System.out.println("Se ha producido una IOException: " + e.getMessage());
        }
    }

    static void produceIOException() throws IOException {
        throw new IOException("Es ta es una excepción de IO intencional");
    }

}
