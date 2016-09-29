import java.util.Scanner;
import java.lang.Math;

public class powersOf2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int base = 0;
		int exponent = 0;

		System.out.println("Enter base: ");
		base = sc.nextInt(); 
		System.out.println("");

		for (int i = 0; i < 17; i ++) {
			exponent = i;
			System.out.println(base + " to the " + exponent + " is : " + (long) Math.pow(base, exponent));

		}
	}
}