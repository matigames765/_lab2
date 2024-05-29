package main;

import entities.*;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class PersistenceApp {

    public static void main(String[] args) {


        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("example-unit");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        try{
            entityManager.getTransaction().begin();

            Factura factura1 = new Factura();

            factura1.setNumero(12);
            factura1.setFecha("10/08/2020");

            Domicilio domicilio = new Domicilio("San Martin", 1222);
            Cliente cliente = new Cliente("Pablo","Muñoz",15245778);
            cliente.setDomicilio(domicilio);
            domicilio.setCliente(cliente);

            factura1.setCliente(cliente);

            Categoria perecederos = new Categoria("Perecederos");
            Categoria lacteos = new Categoria("Lacteos");
            Categoria limpieza = new Categoria("Limpieza");

            Articulo articulo1 = new Articulo(200,"Yogurt Ser sabor frutilla",20);
            Articulo articulo2 = new Articulo(300,"Detergente Magistral",80);

            articulo1.getCategorias().add(perecederos);
            articulo1.getCategorias().add(lacteos);

            perecederos.getArticulos().add(articulo1);
            lacteos.getArticulos().add(articulo1);

            articulo2.getCategorias().add(limpieza);

            limpieza.getArticulos().add(articulo2);

            DetalleFactura detalle1 = new DetalleFactura();

            detalle1.setArticulo(articulo1);
            detalle1.setCantidad(2);
            detalle1.setSubtotal(40);

            articulo1.getDetallesFactura().add(detalle1);
            factura1.getDetalles().add(detalle1);
            detalle1.setFactura(factura1);

            DetalleFactura detalle2 = new DetalleFactura();

            detalle2.setArticulo(articulo2);
            detalle2.setCantidad(1);
            detalle2.setSubtotal(80);

            articulo2.getDetallesFactura().add(detalle2);
            factura1.getDetalles().add(detalle2);
            detalle2.setFactura(factura1);

            factura1.setTotal(120);

            entityManager.persist(factura1);

            //entityManager.flush();

            entityManager.getTransaction().commit();
        }catch (Exception e){
            entityManager.getTransaction().rollback();
        }

        entityManager.close();
        entityManagerFactory.close();


    }
}