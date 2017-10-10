package Recitation6.excercise;
import java.io.IOException;
import java.util.*;

public class Exercise {
	
	public static void main(String[] args) {
		ListOfNumbers l = new ListOfNumbers();
		String filename = "OutputFile.txt";
		
		l.writeNewList(2, filename);
		l.readList(filename);
		l.writeNewList(11, filename);
		l.writeNewList(7, "src");
		l.readList("src");
		l.readList(filename);
		l.writeNewList(2, filename);
		try {
			l.concat(3, filename);
			l.concat(5, "src");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		l.readList(filename);
	}
}