package actions.tutorial.query;

import actions.tutorial.config.HibernateUtil;
import actions.tutorial.entity.UserDemo;
import org.hibernate.Session;

public class DemoQuery {

    public static void main(String[] args)
    {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();

        //Add new Employee object
        UserDemo emp = new UserDemo();
        emp.setName("lokesh@mail.com");
        emp.setAddress("lokesh");

        //Save the employee in database
        session.save(emp);

        //Commit the transaction
        session.getTransaction().commit();
        HibernateUtil.shutdown();
    }
}
