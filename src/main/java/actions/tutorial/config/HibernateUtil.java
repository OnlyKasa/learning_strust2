package actions.tutorial.config;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {

    private static SessionFactory sessionFactory = sessionFactoryBuilder();

    private static SessionFactory sessionFactoryBuilder() {
        try {

            Configuration cfg = new Configuration().configure("hibernate.cfg.xml");

            return cfg.buildSessionFactory();
        } catch (Throwable ex) {
                // Make sure you log the exception, as it might be swallowed
                System.err.println("Initial SessionFactory creation failed." + ex);
                throw new ExceptionInInitializerError(ex);
            }
    }

    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }

    public static void shutdown() {
        // Close caches and connection pools
        getSessionFactory().close();
    }
}
