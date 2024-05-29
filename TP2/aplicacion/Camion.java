package TP2.aplicacion;

public class Camion extends Vehiculo{
    public Camion(String nombre, int velocidad) {
        super(nombre, velocidad);
    }

    @Override
    public void acelera(int incremento) throws miException {
        int velocidad = getVelocidad();
        setVelocidad(velocidad += incremento);
        if (getVelocidad() > 120) {
            throw new miException("El vehículo " + getNombre() + " (Camion) está acelerando demasiado rápido: " + getVelocidad() + " km/h");
        }
        System.out.println("El vehículo " + getNombre()   + " (Camion) ha acelerado a " + getVelocidad() + " km/h");

    }
}
