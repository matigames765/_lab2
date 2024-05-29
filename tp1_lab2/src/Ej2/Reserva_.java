package Ej2;



public class Reserva_ {
    private int numReserva;

    private Vuelo_ v;

    public Reserva_() {
    }

    public Reserva_(int numReserva) {
        this.numReserva = numReserva;
    }

    public int getNumReserva() {
        return numReserva;
    }

    public void setNumReserva(int numReserva) {
        this.numReserva = numReserva;
    }

    public void agregarVuelo(Vuelo_ v){
        this.v = v;
    }
}
