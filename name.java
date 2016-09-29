import java.util.Scanner;

public class name {
	
	public static void main (String[] args) {
		Scanner reader = new Scanner(System.in);
		System.out.println("Enter a Name ");
		String firstName = reader.nextLine();

		if (firstName == "Alice" || firstName == "Bob") {
			System.out.println("Nice to meet you " + firstName);
		} else {
			System.out.println("Sorry this server does not recognize you, boop, boop.");
		}
	}
}