package in.curd;

import java.util.Scanner;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("abhi");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		et.begin();
//		
//		Student student=new Student(1,"abhishek","pune");
//		em.persist(student);
//		Student student2=new Student(2,"shreyas","mumbai");
//		em.persist(student2);
//		Student student3=new Student(3,"Kalyan","loni");
//		em.persist(student3);
//		Student student4=new Student(4,"Sakshi","Sangamner");
//		em.persist(student4);
//		
//		teacher teacher=new teacher(1,"suraj sir","warje");
//		em.persist(teacher);
//		teacher teacher2 =new teacher(2,"vaishanvi mam","pune");
//		em.persist(teacher2);
//		
//		
//		et.commit();
		
		
	  Student student=em.find(Student.class, 2);
//	  student.setScity("jejuri");
//	  student.setSname("suraj sir");
//	  em.merge(student);//add the record
	  em.remove(student);//delete the record
	  et.commit();
	}

}
