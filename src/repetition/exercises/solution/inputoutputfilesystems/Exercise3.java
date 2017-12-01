package repetition.exercises.solution.inputoutputfilesystems;

import java.io.File;

public class Exercise3 {
	public static void main(String[] args) {
		// Create a File object
		File myFileDir = new File("/home/students/xyz.txt");
		if (myFileDir.exists()) {
			System.out.println("The directory or file exists.\n");
		} else {
			System.out.println("The directory or file does not exist.\n");
		}
	}
}