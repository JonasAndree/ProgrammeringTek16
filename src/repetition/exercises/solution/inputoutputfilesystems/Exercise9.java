package repetition.exercises.solution.inputoutputfilesystems;

import java.io.File;

public class Exercise9 {

	public static void main(String[] args) {
		File file = new File("/home/students/test.txt");
		if (file.exists()) {
			System.out.println(filesizeInBytes(file));
			System.out.println(filesizeInKiloBytes(file));
			System.out.println(filesizeInMegaBytes(file));
		} else
			System.out.println("File doesn't exist");

	}

	private static String filesizeInMegaBytes(File file) {
		return (double) file.length() / (1024 * 1024) + " mb";
	}

	private static String filesizeInKiloBytes(File file) {
		return (double) file.length() / 1024 + "  kb";
	}

	private static String filesizeInBytes(File file) {
		return file.length() + " bytes";
	}
}