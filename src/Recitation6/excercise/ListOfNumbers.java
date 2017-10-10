package Recitation6.excercise;

import java.io.*;
import java.util.List;
import java.util.ArrayList;

public class ListOfNumbers {

    private List<Integer> list;
    private static final int SIZE = 10;

    public ListOfNumbers () {
        list = new ArrayList<Integer>(SIZE);
        for (int i = 0; i < SIZE; i++) {
            list.add(new Integer(i));
        }
    }

    public void writeNewList(int size, String filename) {
    	// Fix this method with try,catch,finally blocks so it compiles. 
    	 
    	// The FileWriter constructor throws IOException, which must be caught.
        PrintWriter out = null;
        try {
            out = new PrintWriter(new FileWriter(filename));
        } catch (IOException e) {
            e.printStackTrace();
        }
        for (int i = 0; i < size; i++) {
   			// The get(int) method throws IndexOutOfBoundsException, which must be caught.
   			out.println("Value at: " + i + " = " + list.get(i));
   		}
        out.close();

    }

    public void readList(String filename){
    	/* Implement a method that prints out the contents of the file filename.
    	 * Use the try-with-resources setup to catch the Exceptions.
    	 * (HINT): Look up BufferedReader+
    	*/
    }
    
        
    public void concat(int size, String filename) throws Exception{
    	/* Implement a method that concatenates the new print out to the end of 
    	 * the file thats name matches filename.
    	 * (HINT): Look up FileWriter
    	*/
    }
    
}