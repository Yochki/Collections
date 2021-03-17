package Part_7;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class WordOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> words = new ArrayList<>();

		File myObject = new File("word.txt");
		try {
			Scanner myReader = new Scanner(myObject);
			while (myReader.hasNextLine()) {
				String line = myReader.nextLine();
				String lineWords[] = line.split("[\\s.,]+");
				words.addAll(Arrays.asList(lineWords));
				// System.out.println(text);
			}
		} catch (FileNotFoundException e) {
			try {
				myObject.createNewFile();
			} catch (IOException e1) {
				e1.printStackTrace();
			}
		}

		Collections.sort(words);
		System.out.println(words);
	}

}
