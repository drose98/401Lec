package formatted_input_from_file;
import java.io.*;
import java.util.Scanner;
public class FormattedReader {
	public static void main(String[] args) {
		int studentNum;
		String[] firstName=null;
		String[] lastName=null;
		double[] assignment=null;
		double[] participation=null;
		double[] midterm=null;
		double[] finalterm=null;
		File f = new File("/Users/haojiang/eclipse-workspace/file_io_example/src/formatted_input_from_file/source.txt");
		try {
			Scanner scanner = new Scanner(f);
			try {
				studentNum = scanner.nextInt();
				firstName = new String[studentNum];
				lastName = new String[studentNum];
				assignment = new double[studentNum];
				participation = new double[studentNum];
				midterm = new double[studentNum];
				finalterm = new double[studentNum];
				for(int i=0;i<studentNum;++i) {
					firstName[i]=scanner.next();
					lastName[i]=scanner.next();
					assignment[i]=scanner.nextDouble();
					participation[i]=scanner.nextDouble();
					midterm[i]=scanner.nextDouble();
					finalterm[i]=scanner.nextDouble();
				}
			}catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}finally {
				scanner.close();
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
