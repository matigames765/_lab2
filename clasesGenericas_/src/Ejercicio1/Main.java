package Ejercicio1;


public class Main {
    public static void main(String[] args) {
        Operable<Integer> integerOperations = new Operable<>();

        System.out.println("1 + 2 = " + integerOperations.addition(1,2));
        System.out.println("1 - 2 = " + integerOperations.subtraction(1,2));
        System.out.println("1 x 2 = " + integerOperations.multiplication(1,2));
        System.out.println("1 / 2 = " + integerOperations.division(1,2));

        System.out.println("----------------------------------------------");

        Operable<Double> integerOperations2 = new Operable<>();


        System.out.println("1,2 + 2,3 = " + integerOperations2.addition(1.2,2.3));
        System.out.println("1,2 - 2,3 = " + integerOperations2.subtraction(1.2,2.3));
        System.out.println("1,2 x 2,3 = " + integerOperations2.multiplication(1.2,2.3));
        System.out.println("1,2 / 2,3 = " + integerOperations2.division(1.2,2.3));
    }
}