import java.util.Scanner;


class fruitIteration {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Pick a fruit: ");
		String fruit = sc.nextLine();

		System.out.println("What character would you like to search for?");
		char character = sc.next().charAt(0);

		int count = 0;
		for (int i = 0; i<fruit.length(); i++) {
			if(fruit.charAt(i) == character) {
				count = count +1;
			}
		}
		System.out.println("There are " + count + " " + character + "'s in " + fruit);
	}

}