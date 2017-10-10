package Recitation6.builtin_exception_demo;

public class BuiltinExceptionDemo {
	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		String s[] = new String[2];
		s[0] = "100";
		s[1] = "10"; /* try with s[1] = "0" or s[1] = "five" */
		System.out.println(divideArray(s));
	}

	private static int divideArray(String[] array) {
		String s1 = array[0];
		String s2 = array[1];
		return divideStrings(s1, s2);
	}

	private static int divideStrings(String s1, String s2) {
		int i1 = Integer.parseInt(s1);
		int i2 = Integer.parseInt(s2);
		return divideInts(i1, i2);
	}

	private static int divideInts(int i1, int i2) {
		return i1 / i2;
	}
}
