package application;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import dominio.Person;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Person p1 = new Person(null, "Hennan Gadelha", "hennan@gmail.com");
		Person p2 = new Person(null, "Manoel", "manoel@gmail.com");
		Person p3 = new Person(null, "Jadilson", "jadilson@gmail.com");
		
		EntityManagerFactory enf = Persistence.createEntityManagerFactory("exemplo-jpa");
		EntityManager em = enf.createEntityManager();
		
		
		em.getTransaction().begin();
		em.persist(p1);
		em.persist(p2);
		em.persist(p3);
		em.getTransaction().commit();
		
		
		System.out.println("Pronto");

	}

}
