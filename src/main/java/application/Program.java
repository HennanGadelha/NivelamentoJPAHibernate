package application;

import dominio.Person;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Person p1 = new Person(1, "Hennan Gadelha", "hennan@gmail.com");
		Person p2 = new Person(2, "Manoel", "manoel@gmail.com");
		Person p3 = new Person(3, "Jadilson", "jadilson@gmail.com");
		
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
		
	}

}
