package Ej2;

public class Piloto_ extends Persona_ implements Volador_{
    private int experiencia;

    public Piloto_() {
    }

    public Piloto_(String nombre, String apellido, int edad, int experiencia) {
        super(nombre, apellido, edad);
        this.experiencia = experiencia;
    }

    public int getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(int experiencia) {
        this.experiencia = experiencia;
    }

    @Override
    public void volar() {
        System.out.println("Yo hago volar el avion y vuelo en el");

    }
}
