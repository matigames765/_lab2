package TP2;

public class par_impar {
    public static void main(String[] args) {
        /*
        Cree un programa que genere un número aleatorio e indique si el número generado es par o impar.
         El programa utilizará para ello el lanzamiento de una excepción.
         */

        int num = 41;

        try {
            if (num % 2 == 0){
                System.out.println("es par");

            } else{
                throw new NumeroImparException("El número " + num + " es impar.");
            }
        } catch (NumeroImparException e) {
            // Captura la excepción personalizada y muestra el mensaje correspondiente
            System.out.println("Excepción: " + e.getMessage());
        }
    }
}
