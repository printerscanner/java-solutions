import java.util.Scanner;

public class calculator {

	public static void main(String[] args) {

		Scanner reader = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int number = reader.nextInt();

		System.out.println("Would you like the sum or the product?");
		String input = reader.nextLine();

		if (input == "sum" || input == "Sum") {

			for (int i = 0; i < number; i++) {
				System.out.print(i);
			}
		}
	}
}