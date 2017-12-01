package repetition.exercises.solution.inputoutputfilesystems;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

// Reading contents from a file into byte array.
public class Exercise10 {
	public static void main(String a[]) {
		String fileName = "/home/students/test.txt";
		InputStream fins = null;
		try {
			fins = new FileInputStream(fileName);
			byte fileContent[] = new byte[2 * 1024];
			int readCount = 0;
			while ((readCount = fins.read(fileContent)) > 0) {
				System.out.println(new String(fileContent, 0, readCount - 1));
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (fins != null)
					fins.close();
			} catch (Exception ex) {

			}
		}
	}
}