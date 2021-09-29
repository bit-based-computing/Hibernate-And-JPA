package jpac2.main;

import jpac2.entities.Event;
import jpac2.entities.Product;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence
                .createEntityManagerFactory("my-persistence-unit");
        EntityManager em = emf.createEntityManager();

        Product p = new Product();
        p.setName("Book");
        p.setPrice(10.20);
        p.setExpirationDate(LocalDate.now());

        em.getTransaction().begin();
        em.persist(p); // adding the instance in the context
        em.getTransaction().commit();
//        em.close();

        Event event = new Event();
        event.setDescription("this is test");
        em.getTransaction().begin();
        em.persist(event);
        em.getTransaction().commit();
    }
}
