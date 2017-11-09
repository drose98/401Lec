package read_passage;
import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class ReadPassage {
	public static void main(String[] args) {
		File f = new File("/Users/haojiang/eclipse-workspace/file_io_example/src/read_passage/source.txt");
		StringBuilder builder = new StringBuilder();
		try {
			BufferedReader reader = new BufferedReader(new FileReader(f));
			try {
				String s;
				while((s=reader.readLine()) != null) {
					builder.append(s);
					builder.append("\n");
				}
			}catch(IOException e) {
				e.printStackTrace();
			}finally {
				reader.close();
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String passage = builder.toString();
		Matcher matcher=Pattern.compile("^|\\W[Aa][Nn][Dd]\\W").matcher(passage);
		int count = 0;
		while(matcher.find()) {
			++count;
		}
		System.out.println(count);
	}
}
