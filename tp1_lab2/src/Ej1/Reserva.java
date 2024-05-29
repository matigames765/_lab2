package Ej1;

public class Reserva {
    private int numReserva;

    private Vuelo v;

    public Reserva() {
    }

    public Reserva(int numReserva) {
        this.numReserva = numReserva;
    }

    public int getNumReserva() {
        return numReserva;
    }

    public void setNumReserva(int numReserva) {
        this.numReserva = numReserva;
    }

    public void agregarVuelo(Vuelo v){
        this.v = v;
    }
}
