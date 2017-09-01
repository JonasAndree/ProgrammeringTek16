package classes.ecersises6;

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
}