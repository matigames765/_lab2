package Ejercicio3yEjercicio4;

public class Main {
    public static void main(String[] args) {
        Store store = new Store();

        Product product1 = new Product("Leche",4.3);
        Product product2 = new Product("Telefono",90000.0);
        Product product3 = new Product("Pre pizza",20.0);

        store.addProduct(product1);
        store.addProduct(product2);
        store.addProduct(product3);

        store.showProducts(store.getProducts());
    }
}
