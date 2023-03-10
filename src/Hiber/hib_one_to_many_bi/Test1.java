package Hiber.hib_one_to_many_bi;


import Hiber.hib_one_to_many_bi.Entity.Department;
import Hiber.hib_one_to_many_bi.Entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test1 {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("resources/hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .addAnnotatedClass(Department.class) // Добавляем depart класс
                .buildSessionFactory();
        Session session = null;
        try {
            //          session = factory.getCurrentSession();
//
//            Department dep = new Department("It", 300, 1499);
//            Employee emp1 = new Employee("ilnur ", "big", 500);
//            Employee emp2 = new Employee("ilnur22 ", "big22", 5000);
//            dep.addEmployeeToDepartment(emp1);
//            dep.addEmployeeToDepartment(emp2);
//            session.beginTransaction();
//            session.save(dep);
//            session.getTransaction().commit(); // всегда нужно закрывать сессию
//            System.out.println("done!");

            session = factory.getCurrentSession();
            session.beginTransaction();
            Department department = session.get(Department.class, 1);
            System.out.println(department);
            System.out.println(department.getEmps());


            session.getTransaction().commit(); // всегда нужно закрывать сессию
            System.out.println("done!");

        } finally {
            session.close();
            factory.close();
        }
    }
}