package repetition.exercises.solution.inputoutputfilesystems;

import java.io.File;

public class Exercise5 {
	public static void main(String[] args) {
		// Create a File object
		File myFileDir = new File("/home/students/abc.txt");
		if (myFileDir.isDirectory()) {
			System.out.println(myFileDir.getAbsolutePath() + " is a directory.\n");
		} else {
			System.out.println(myFileDir.getAbsolutePath() + " is not a directory.\n");
		}
		if (myFileDir.isFile()) {
			System.out.println(myFileDir.getAbsolutePath() + " is a file.\n");
		} else {
			System.out.println(myFileDir.getAbsolutePath() + " is a file.\n");
		}
	}
}