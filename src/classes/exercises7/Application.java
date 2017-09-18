package classes.exercises7;

public class Application {
	public static void main(String[] args) {

		System.out.println("Hello World!");

		Person person = new Person("Topsy");

		String name = person.getName();
		name = name + " Delores";
		person.setName(name);

		person.writeName();
	}
}
