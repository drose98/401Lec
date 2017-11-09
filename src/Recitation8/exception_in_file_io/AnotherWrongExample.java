package exception_in_file_io;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class AnotherWrongExample {
	public static void main(String[] args) {
		File f = new File("/Users/haojiang/eclipse-workspace/file_io_example/src/exception_in_file_io/source.txt");
		InputStream in = null;
		try {
			in = new FileInputStream(f);
			in.read();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("a");
			e.printStackTrace();
		}finally {
			try {
				in.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				System.out.println("b");
				e.printStackTrace();
			}
		}
	}
}
