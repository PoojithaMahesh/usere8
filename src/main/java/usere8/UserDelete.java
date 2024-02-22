package usere8;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class UserDelete {
public static void main(String[] args) {
	EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vinod");
	EntityManager entityManager=entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction=entityManager.getTransaction();
	User dbUser=entityManager.find(User.class, 100);
	if(dbUser!=null) {
//		that id is present so you can remove the data
		entityTransaction.begin();
		entityManager.remove(dbUser);
		entityTransaction.commit();
	}else {
//		that id is present 
//		if you are going to call remove method means it will give you a exception
		System.out.println("Sorry ID is not present in the database");
	}
}
}
