
package TP2.aplicacion;

public class Auto extends Vehiculo{

    public Auto(String nombre, int velocidad) {
        super(nombre, velocidad);
    }

    @Override
    public void acelera(int incremento) throws miException {
        int velocidad = getVelocidad();
        setVelocidad(velocidad += incremento);
        if (getVelocidad() > 120) {
            throw new miException("El vehículo " + getNombre() + " (Auto) está acelerando demasiado rápido: " + getVelocidad() + " km/h");
        }
        System.out.println("El vehículo " + getNombre()   + " (Auto) ha acelerado a " + getVelocidad() + " km/h");

    }
}
