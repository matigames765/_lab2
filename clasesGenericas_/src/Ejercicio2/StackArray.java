package Ejercicio2;
import java.util.ArrayList;
import java.util.List;


public class StackArray<E> {

    List<E> stack;

    private int numberOfObjects;

    private int maximunSize;

    public StackArray(int maximunSize) {
        this.stack = new ArrayList<>();
        this.maximunSize = maximunSize;
    }

    public List<E> getStack() {
        return stack;
    }

    public void setStack(List<E> stack) {
        this.stack = stack;
    }

    public int getNumberOfObjects() {
        return numberOfObjects;
    }

    public void setNumberOfObjects(int numberOfObjects) {
        this.numberOfObjects = numberOfObjects;
    }

    public boolean isEmpty_(){
        if (numberOfObjects == 0){
            return true;
        }else{
            return false;
        }
    }

    public boolean push(E object){
        if (maximunSize > numberOfObjects){
            stack.add(object);
            numberOfObjects++;
            return true;
        }else{
            return false;
        }
    }

    public E first(){
        if (isEmpty_()){
            throw new RuntimeException();
        }else{
            return stack.get(numberOfObjects - 1);
        }
    }

    public E extract(){
        if (isEmpty_()){
            throw new RuntimeException();
        }else{
            numberOfObjects--;
            return stack.get(numberOfObjects);
        }
    }

    @Override
    public String toString() {
        return "StackArray{" +
                "stack=" + stack +
                ", numberOfObjects=" + numberOfObjects +
                ", maximunSize=" + maximunSize +
                '}';
    }
}
