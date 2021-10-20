package jpac3.main;

import jpac3.entities.*;
import jpac3.entities.enums.Currency;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.time.LocalDate;
import java.util.Date;
/*
    @Enumerated and @Temporal types
 */
public class Main {

    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence
                .createEntityManagerFactory("my-persistence-unit");

        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();

        Price price = new Price();
        price.setAmount(10.5);
        price.setCurrency(Currency.USD);
        em.persist(price);

        Category category = new Category();
        category.setDate(LocalDate.now());
        em.persist(category);

//        Product product = new Product();
//        product.setDate(new Date());
//        em.persist(product);

        Company company = new Company();
        company.setAddress(new Address());
        company.setName("test");
        company.getAddress().setCity("City Name");
        em.persist(company);
        em.getTransaction().commit();
    }
}
