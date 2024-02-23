package usere8;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class UserUpdateCrud {
public static void main(String[] args) {
	
	User user=new User();
	user.setName("Pooji");
	user.setAddress("India");
	UserUpdateCrud  crud=new UserUpdateCrud();
	crud.updateUser(1, user);
	
}
public void updateUser(int id,User user) {
	EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vinod");
	EntityManager entityManager=entityManagerFactory.createEntityManager();
	User dbUser=entityManager.find(User.class, id);
	if(dbUser!=null) {
//		id is present
//		you can call merge method
//		call merge ==== it will update the data
		EntityTransaction entityTransaction=entityManager.getTransaction();
		entityTransaction.begin();
//		user=name address
		user.setId(id);
		
		entityManager.merge(user);
		entityTransaction.commit();
	}else {
		System.out.println("id is not present");
	}
}



}
