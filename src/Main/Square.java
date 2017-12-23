package Main;

public class Square {
	
	public static void main(String[] args) {
		foo();
	}
	
	/**
	 * This method returns the square of the parameter.
	 * 
	 * @param x
	 * @return int
	 */
	public static int square(int x) {
		
		if (x == 0) return 1;
		
		return x * x;
	}
	
	public static int cube(int y) {
		return y * y * y;
	}
	
	/**
	 * fsdfsdfsdf
	 */
	public static void foo() {
		String s = String.format("%-10s %5.2f", "Bob B. Bobby", 3.141592654);
		String ss = String.format("%-10s %5.2f", "ABCD", 3.141592654);
		String sss = String.format("%-10s %5.2f", "Bob", 12.123456789);
		
		System.out.println(s);
		System.out.println(ss);
		System.out.println(sss);
	}
}
