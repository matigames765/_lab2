package TP2.aplicacion;

public class main {
    public static void main(String[] args) {
        // Creación de objetos Auto y Camion
        Auto auto = new Auto("Toyota", 50);
        Camion camion = new Camion("Volvo", 30);

        // Manejo de excepción para aceleración de Auto y Camion
        try {
            // Acelerar Auto por encima de 120 km/h
            auto.acelera(130);
        } catch (miException e) {
            System.out.println("Excepción capturada en Auto: " + e.getMessage());
        }

        try {
            // Acelerar Camion por encima de 120 km/h
            camion.acelera(150);
        } catch (miException e) {
            System.out.println("Excepción capturada en Camion: " + e.getMessage());
        }

        // Creación de un chofer con matrícula vencida
        try {
            Chofer chofer = new Chofer("Juan", true);  // La matrícula está vencida (true)
        } catch (matriculaVencidaException e) {
            System.out.println("Excepción capturada al crear Chofer: " + e.getMessage());
        }

        // Creación de un chofer sin matrícula vencida
        try {
            Chofer choferSinVencida = new Chofer("Pedro", false);  // La matrícula no está vencida (false)
            System.out.println("Chofer " + choferSinVencida.getNombre() + " creado exitosamente sin matrícula vencida.");
        } catch (matriculaVencidaException e) {
            System.out.println("No se esperaba esta excepción, la matrícula no debería estar vencida.");
        }
    }
}
