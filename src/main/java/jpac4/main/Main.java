package jpac4.main;
import jpac4.entities.composed.pk.Building;
import jpac4.entities.composed.pk.Department;
import jpac4.entities.composed.pk.pk.DepartmentPk;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
/*
           @AttributeOverride and Composed Primary Keys

 */
public class Main {
    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence
                .createEntityManagerFactory("my-persistence-unit");
        EntityManager em = emf.createEntityManager();

        em.getTransaction().begin();

//        Company company = new Company();
//        company.setName("My Company");
//        Address address = new Address();
//        address.setCity("Dhaka");
//        company.setAddress(address);
//        em.persist(company);

//        Department d = new Department();
//        d.setName("IdClass example");
//        d.setCode("CODE 1");
//        d.setNumber(2);
//        em.persist(d);

        Building building = new Building();
        DepartmentPk departmentPk = new DepartmentPk();
        departmentPk.setCode("COD1");
        departmentPk.setNumber(1);
        building.setName("EmbeddedId Example");
        building.setDepartmentPk(departmentPk);
        em.persist(building);
        em.getTransaction().commit();
    }
}
