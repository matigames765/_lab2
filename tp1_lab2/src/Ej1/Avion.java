package Ej1;

public class Avion implements Volador{
    private String aerolinea;

    private Vuelo vuelo;

    private Flota flota;

    public Avion() {
    }

    public Avion(String aerolinea , int cantidad) {
        this.aerolinea = aerolinea;
        this.flota = new Flota(cantidad);
    }

    public String getAerolinea() {
        return aerolinea;
    }

    public void setAerolinea(String aerolinea) {
        this.aerolinea = aerolinea;
    }

    public Vuelo getVuelo() {
        return vuelo;
    }

    public void setVuelo(Vuelo vuelo) {
        this.vuelo = vuelo;
    }

    @Override
    public void volar() {
        System.out.println("Yo soy un avion y estoy hecho para volar");

    }
}
