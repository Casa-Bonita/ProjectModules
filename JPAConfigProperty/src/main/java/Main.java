import entity.Human;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("humanUnit");
        EntityManager em = entityManagerFactory.createEntityManager();
        //Добавление новой сущности
//        Human human = new Human("Kondrat", "Kondratievich", "New-York");
//        em.getTransaction().begin();
//        em.persist(human);
//        em.getTransaction().commit();

        //Обновление сущности
//        Human human = (Human)em.find(Human.class, 10);
//        human.setName("Kondrat");
//        em.getTransaction().begin();
//        em.merge(human);
//        em.getTransaction().commit();

        List<Human> list = em.createQuery("from Human").getResultList();
        list.forEach(System.out::println);
    }
}
