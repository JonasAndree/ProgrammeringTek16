package classes.exercises7;

class Person {
	private String name;

	public Person() {
	}

	public Person(String name) {

		// 'this.name' is the instance variable.
		// 'name' is the parameter
		this.name = name;
	}

	public void writeName() {
		// Note: no 'this' here. 'name' is
		// not ambiguous so we don't need 'this'.
		System.out.println("My name is " + name);
	}

	public void setName(String name) {
		// Use 'this' again to disambiguate.
		this.name = name;
	}

	public String getName() {
		// No need for 'this' - not ambiguous here.
		return name;
	}
}