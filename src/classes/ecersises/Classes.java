package classes.ecersises;
/**
 * 
 * @author jonas.andree
 * Try to do the following exercises.
 * Don't peek, do to the fact that you will get more out of the exercises if you actually do the exercises. 
 * If you get stuck, peek at the answer and then try to do the exercise from memory. 
 * 
 * Don't stress too much about the theory of Java; actually being able to do stuff is the important thing. 
 */
public class Classes {

	public static void main(String[] args) {
		System.out.println("1. Create a \"Hello World\" Program");
		System.out.println("Create a Java program that simply outputs the text \"Hello World\" when you run it. Call your main class \"Application\".");
		System.out.println("");
		System.out.println("2. Create a Class and an Object");
		System.out.println("In the same Folser as your main \"Application\" class, define a new class called \"Person\". You don't need to put anything in the class.");
		System.out.println("Now, right below where you output \"Hello World\" in your main method, create an object from that class.");
		System.out.println("Hint: although you can only have one public class in each file, you can create as many other classes as you want in there, just so long as you don't use the public keyword with them. Usually of course you put classes in their own files, but here we'll put our classes in the same file for convenience. ");
		System.out.println("");
		System.out.println("3. Basic Constructors");
		System.out.println("Modify your \"Person\" class to add a constructor. Make the constructor output the text \"Constructor running!\".");
		System.out.println("");
		System.out.println("4. Multiple Constructors");
		System.out.println("   1. Modify the Person class so that it has another constructor, in addition to the constructor it's already got. Make this second constructor accept a parameter called name of type String. ");
		System.out.println("   2. Make this second constructor print the name parameter using System.out.println(). ");
		System.out.println("   3. Finally, change your \"main\" method so that when you create the Person object, you pass in a name. Pass in your own name, in fact. ");
		System.out.println("");
		System.out.println("5. Instance Variables, Also Known as Data Members");
		System.out.println("Modify your Person class so that it has a private instance variable called name of type String. ");
		System.out.println("In your second constructor, set the value of the \"name\" instance variable using the \"name\" parameter that you pass in. ");
		System.out.println("Remove the System.out.println()'s from the Person class.");
		System.out.println("Hint: OK, there's a problem here. In the constructor there are two variables called \"name\". One is a parameter to the constructor, the other is an instance variable. How do you differentiate between them? The answer is to use the keyword this. ");
		System.out.println("This app doesn't produce much output, but we'll use what we've done in the next exercise.");
		System.out.println("");
		System.out.println("6. Methods");
		System.out.println("Methods are a way of making subroutines part of objects (by defining them in classes of course). ");
		System.out.println("Add a method to your Person class called \"writeName\". Make this method output the text \"My name is \" followed by the value of the name instance variable. ");
		System.out.println("Invoke (in other words run or call) this method in your main method. ");
		System.out.println("Your program output should therefore look like the following, assuming your name is \"Topsy\". ");
		System.out.println("Output:");
		System.out.println("Hello World!");
		System.out.println("My name is Topsy");
		System.out.println("");
		System.out.println("7. Get and Set Methods");
		System.out.println("In prehistoric times, get and set methods (also known as getters and setters) were known as mutators and accessors. ");
		System.out.println("Add getName and setName methods to your class.");
		System.out.println("Modify your main method like this: ");
		System.out.println("  1. Use getName to retrieve the name String from the Person object (in the main method, remember!). Store it there temporarily. ");
		System.out.println("  2. Add a space followed by your surname to the String you just retrieved. ");
		System.out.println("  3. Use the setName method to set the name instance variable of your person object to the full name that you've just created. ");
		System.out.println("Do all this just before calling writeName(). ");
		System.out.println("Hint: none of this involves editing the Person class! All your editing should take place in main. ");
		System.out.println("Your program output should now look like this (assuming your surname is \"Delores\", and why wouldn't it be): ");
		System.out.println("Output:");
		System.out.println("Hello World!");
		System.out.println("My name is Topsy Delores");
		System.out.println("");
		System.out.println("8. Composition\n");
		System.out.println("Finally, the challenge to end all challenges. This last question is the bad guy at the end of the level.");
		System.out.println("   1. Above where you defined the person class, define a class called \"Brain\".");
		System.out.println("   2. Give the Brain class a constructor. ");
		System.out.println("   3. Make the Brain constructor print the text \"Thinking...\". ");
		System.out.println("   4. Give the Person class a private instance variable of type \"Brain\", called \"brain\".");
		System.out.println("   5. In the one-parameter Person constructor, set the brain instance variable equal to a new Brain object. ");
		System.out.println("");
		System.out.println("Your program output should now look like the following:\n");
		System.out.println("Hello World!");
		System.out.println("Thinking ...");
		System.out.println("My name is Topsy Delores");
 

	}

}
