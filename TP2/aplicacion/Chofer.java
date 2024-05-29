package TP2.aplicacion;

public class Chofer {

    private String nombre;
    private boolean matriculaVencida;

    public Chofer(String nombre, boolean matriculaVencida) throws matriculaVencidaException {
        this.nombre = nombre;
        this.matriculaVencida = matriculaVencida;
        if (matriculaVencida) {
            throw new matriculaVencidaException("La matrícula del chofer " + nombre + " está vencida.");
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isMatriculaVencida() {
        return matriculaVencida;
    }

    public void setMatriculaVencida(boolean matriculaVencida) {
        this.matriculaVencida = matriculaVencida;
    }
}
