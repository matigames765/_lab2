package Ejercicio2;

public class Main {
    public static void main(String[] args) {
        StackArray<Integer> stackArray = new StackArray<>(7);

        //Añadiendo algunos elementos a la pila
        stackArray.push(2);
        stackArray.push(6);
        stackArray.push(7);
        stackArray.push(4);

        //Obteniendo el ultimo elemento de la pila
        System.out.println("Ultimo elemento: " + stackArray.first());

        //Obteniendo informacion de la pila
        System.out.println(stackArray.toString());
    }
}
