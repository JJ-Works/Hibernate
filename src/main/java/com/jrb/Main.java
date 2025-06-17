package com.jrb;

import org.hibernate.cfg.Configuration;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class Main {
    public static void main(String[] args) {

        Students students = new Students();
        students.setsID(101);
        students.setsName("Ramesh");
        students.setsTech("C");

//        Hey hibernate save this students object
//        First we have use session inorder save the object
//        to do that we must first create SessionFactory

        Configuration config = new Configuration();
        config.addAnnotatedClass(com.jrb.Students.class);
        config.configure("hibernate.cfg.xml");  //By default, it will search for hibernate.cfg.xml if the name shall be different then
        // name shall be passed as an argument.

        SessionFactory factory = config.buildSessionFactory();

        Session session = factory.openSession();


        // So save used to be the standard before Hibernate 6 but due to
        /* JPA initially (Java Persistence API) NOW (Jakarta Persistence API) is a standards that provides a set of direction.*/

//        session.save(students);

        // Now we use .persist();

        session.persist(students);
    }
}