package TP2;

public class metodos4 {
    public static void main(String[] args) {
        try {
            // Inicia la cadena de llamadas a métodos
            metodo1();
        } catch (Exception e) {
            // Captura la excepción lanzada por metodo4
            System.out.println("Excepción manejada en main: " + e.getMessage());
        }
    }

    // Método 1 llama a método 2
    public static void metodo1() throws Exception {
        metodo2();
    }

    // Método 2 llama a método 3
    public static void metodo2() throws Exception {
        metodo3();
    }

    // Método 3 llama a método 4
    public static void metodo3() throws Exception {
        metodo4();
    }

    // Método 4 lanza una excepción
    public static void metodo4() throws Exception {
        // Lanza una excepción con un mensaje personalizado
        throw new Exception("Excepción lanzada por metodo4");
    }
}
