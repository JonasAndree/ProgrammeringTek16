package repetition.exercises.solution.inputoutputfilesystems;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.FileReader;

public class Exercise13 {

	public static void main(String a[]) {
		StringBuilder sb = new StringBuilder();
		String strLine = "";
		String strData = "";
		try {
			BufferedReader br = new BufferedReader(new FileReader("/home/students/test.txt"));
			while (strLine != null) {
				if (strLine == null)
					break;
				strData += strLine;
				strLine = br.readLine();

			}
			System.out.println(strData);
			br.close();
		} catch (FileNotFoundException e) {
			System.err.println("File not found");
		} catch (IOException e) {
			System.err.println("Unable to read the file.");
		}
	}
}