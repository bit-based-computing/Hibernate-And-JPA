package jpac1.main;

import jpac1.entities.Product;
import net.bytebuddy.asm.Advice;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        // EntityManager
        // EntityManagerFactory

        EntityManagerFactory emf = Persistence
                .createEntityManagerFactory("my-persistence-unit");
        EntityManager em = emf.createEntityManager();

        Product p = new Product();
        p.setId(1);
        p.setName("Book");
        p.setPrice(10.20);
        p.setExpirationDate(LocalDate.now());
        try {
            em.getTransaction().begin();
            em.persist(p); // adding the instance in the context
            em.getTransaction().commit();

        } catch (Exception e) {
            em.getTransaction().rollback();
        }

    }
}
