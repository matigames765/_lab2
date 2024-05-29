package Ejercicio1;

public class Operable<E> {

    public Operable() {
    }

    public E addition(E number1, E number2){
        if (number1 instanceof Integer && number2 instanceof Integer){
            Integer result = ((Integer) number1) + ((Integer) number2);
            return (E) result;
        } else if (number1 instanceof Double && number2 instanceof Double) {
            Double result = ((Double) number1) + ((Double) number2);
            return (E) result;
        }else{
            throw new IllegalArgumentException("Tipo no aceptado");
        }
    }

    public E subtraction(E number1, E number2){
        if (number1 instanceof Integer && number2 instanceof Integer){
            Integer result = ((Integer) number1) - ((Integer) number2);
            return (E) result;
        } else if (number1 instanceof Double && number2 instanceof Double) {
            Double result = ((Double) number1) - ((Double) number2);
            return (E) result;
        }else{
            throw new IllegalArgumentException("Tipo no aceptado");
        }
    }

    public E multiplication(E number1, E number2){
        if (number1 instanceof Integer && number2 instanceof Integer){
            Integer result = ((Integer) number1) * ((Integer) number2);
            return (E) result;
        } else if (number1 instanceof Double && number2 instanceof Double) {
            Double result = ((Double) number1) * ((Double) number2);
            return (E) result;
        }else{
            throw new IllegalArgumentException("Tipo no aceptado");
        }
    }

    public E division(E number1, E number2){
        if (number1 instanceof Integer && number2 instanceof Integer){
            Integer result = ((Integer) number1) / ((Integer) number2);
            return (E) result;
        } else if (number1 instanceof Double && number2 instanceof Double) {
            Double result = ((Double) number1) / ((Double) number2);
            return (E) result;
        }else{
            throw new IllegalArgumentException("Tipo no aceptado");
        }
    }


}
