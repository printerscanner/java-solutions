import java.util.Scanner;

class Recurse {

	public static char first(String s) {
		return s.charAt(0);
	}

	public static String rest(String s) {
		return s.substring(1, s.length());
	}

	public static int length(String s) {
		return s.length();
	}

	public static void printString(String s) {
		for (int i = 0; i< s.length(); i++) {
			System.out.println(s.charAt(i));
		}
	}

	public static void printBackward(String s) {
		for (int i = (s.length()-1); i >= 0; i--)
		{
			System.out.println(s.charAt(i));
		}
	}

	public static void newLine() {
		System.out.println("");
	}

	public static void reverseString(String s) {
		for (int i = (s.length()-1); i >= 0; i--)
		{
			System.out.print(s.charAt(i));
		}
		System.out.println("");
	}

	public static void main(String[] args) {


	Scanner sc = new Scanner(System.in);
	System.out.println("Write a sentence: ");	
	String s = sc.nextLine();



	printBackward(s);
	reverseString(s);

	}
}