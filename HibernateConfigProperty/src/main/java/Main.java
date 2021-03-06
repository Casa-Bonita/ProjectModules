import entity.Human;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        SessionFactory sessionFactory = HibernateUtil.createSessionFactory();
        Session session = sessionFactory.openSession();
        List<Human> list = session.createQuery("from Human").getResultList();
        list.forEach(System.out::println);
    }
}
