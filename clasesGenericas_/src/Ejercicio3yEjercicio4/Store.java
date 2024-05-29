package Ejercicio3yEjercicio4;

import java.util.ArrayList;
import java.util.List;

public class Store<T> {

    List<Product> products;

    public Store() {
        this.products = new ArrayList<>();
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public void addProduct(Product product){
        products.add(product);
    }
    //Parte ejercicio 3
    /*public void showProducts(List<? extends Product> productsList){
        System.out.println("Los productos en el almacen son: ");
        for (Product product : productsList){
            System.out.println(product.toString());
        }
    }*/

    //Parte ejercicio 4
    public void showProducts(List<? super T> productsList){
        System.out.println("Los productos en el almacen son: ");
        for (Object product : productsList){
            System.out.println(product.toString());
        }
    }
}
