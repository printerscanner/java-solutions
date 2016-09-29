import java.util.Scanner;

public class sum{

	public static void main(String[] args) {
	Scanner reader = new Scanner(System.in);
	System.out.print("Enter a number: ");
	int n = reader.nextInt();

	
	for (int i = 1; i < n; i++) {
		if (i % 3 == 0 || i % 5 == 0) {
			System.out.println(i);
		} 

		}
	}
}