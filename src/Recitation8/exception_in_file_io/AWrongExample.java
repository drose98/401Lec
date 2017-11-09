package exception_in_file_io;

import java.io.*;

public class AWrongExample {
	public static void main(String[] args) {
		File f = new File("/Users/haojiang/eclipse-workspace/file_io_example/src/exception_in_file_io/source.txt");
		try {
			InputStream in = new FileInputStream(f);
			in.read();
			in.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
