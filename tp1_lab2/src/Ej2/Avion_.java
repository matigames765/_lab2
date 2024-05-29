package Ej2;



public class Avion_ implements Volador_{
    private String aerolinea;

    private Vuelo_ vuelo;

    private Flota_ flota;

    public Avion_() {
    }

    public Avion_(String aerolinea , int cantidad) {
        this.aerolinea = aerolinea;
        this.flota = new Flota_(cantidad);
    }

    public String getAerolinea() {
        return aerolinea;
    }

    public void setAerolinea(String aerolinea) {
        this.aerolinea = aerolinea;
    }

    public Vuelo_ getVuelo() {
        return vuelo;
    }

    public void setVuelo(Vuelo_ vuelo) {
        this.vuelo = vuelo;
    }

    @Override
    public void volar() {
        System.out.println("Yo soy un avion y estoy hecho para volar");

    }
}
