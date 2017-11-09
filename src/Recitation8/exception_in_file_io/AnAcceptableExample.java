package exception_in_file_io;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class AnAcceptableExample {
	public static void main(String[] args) {
		File f = new File("/Users/haojiang/eclipse-workspace/file_io_example/src/exception_in_file_io/source.txt");
		try {
			InputStream in = new FileInputStream(f);
			try {
				in.read();
			}catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}finally {
				in.close();
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
