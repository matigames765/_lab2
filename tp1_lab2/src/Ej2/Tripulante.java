package Ej2;

public class Tripulante extends Persona_ implements Volador_{
    private int nroAsiento;

    private Equipaje equipaje;

    public Tripulante() {
    }

    public Tripulante(String nombre, String apellido, int edad, int nroAsiento , int peso) {
        super(nombre, apellido, edad);
        this.nroAsiento = nroAsiento;
        this.equipaje = new Equipaje(peso);
    }

    public int getNroAsiento() {
        return nroAsiento;
    }

    public void setNroAsiento(int nroAsiento) {
        this.nroAsiento = nroAsiento;
    }

    @Override
    public void volar() {
        System.out.println("Yo vuelo como tripulante del avion");
    }
}
