import entity.Human;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("humanUnit");
        EntityManager em = entityManagerFactory.createEntityManager();
        List<Human> list = em.createQuery("from Human").getResultList();
        list.forEach(System.out::println);
    }
    
}
