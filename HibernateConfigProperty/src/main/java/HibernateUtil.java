import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.Properties;

public class HibernateUtil {
    public static SessionFactory createSessionFactory(){
        Properties properties = new Properties();
        Configuration configuration = new Configuration();
//        configuration.configure("hibernate.cfg.xml").addProperties(properties);
        configuration.configure().addProperties(properties);
        return configuration.buildSessionFactory();

    }
}
