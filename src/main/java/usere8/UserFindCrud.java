package usere8;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class UserFindCrud {
public static void main(String[] args) {
	EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vinod");
	EntityManager entityManager=entityManagerFactory.createEntityManager();
	User dbUser=entityManager.find(User.class,1);
	if(dbUser!=null) {
//		dbUser is present with this id
		System.out.println(dbUser);
	}else {
//		id is not present
		System.out.println("Sorry Id is not present");
	}
}
}
