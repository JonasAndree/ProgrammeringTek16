package repetition.exercises.solution.inputoutputfilesystems;

import java.io.File;

public class Exercise4 {
	public static void main(String[] args) {
		// Create a File object
		File myFileDir = new File("/home/students/abc.txt");
		if (myFileDir.canWrite()) {
			System.out.println(myFileDir.getAbsolutePath() + " can write.\n");
		} else {
			System.out.println(myFileDir.getAbsolutePath() + " cannot write.\n");
		}
		if (myFileDir.canRead()) {
			System.out.println(myFileDir.getAbsolutePath() + " can read.\n");
		} else {
			System.out.println(myFileDir.getAbsolutePath() + " cannot read.\n");
		}
	}
}