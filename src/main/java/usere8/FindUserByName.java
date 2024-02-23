package usere8;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class FindUserByName {
public static void main(String[] args) {
	EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vinod");
	EntityManager entityManager=entityManagerFactory.createEntityManager();
	Query query=entityManager.createQuery("select u from User u where u.name=?1");
	String name="pooji";
	
	query.setParameter(1, name);
	
//	User user=(User) query.getSingleResult();
	List<User> list=query.getResultList();
	System.out.println(list);

}
}
