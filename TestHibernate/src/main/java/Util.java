import com.fasterxml.classmate.AnnotationConfiguration;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import javax.security.auth.login.Configuration;
import java.util.Properties;

public class Util {
    private static final SessionFactory concreteSessionFactory;

    static {
        try {
            Properties prop = new Properties();
            prop.setProperty("hibernate.connection.url", "jdbc:mysql://192.168.0.101:3306/go");
            prop.setProperty("hibernate.connection.username", "go");
            prop.setProperty("hibernate.connection.password", "go");
            prop.setProperty("dialect", "org.hibernate.dialect.MySQLDialect");


            concreteSessionFactory = new org.hibernate.cfg.Configuration()
                    .addProperties(prop)
                    .addAnnotatedClass(Vehicle.class)
                    .buildSessionFactory();
        }
        catch (Exception ex) {
            throw new ExceptionInInitializerError(ex);
        }
    }
    public static Session getSession() throws HibernateException {
        return concreteSessionFactory.openSession();
    }


}
