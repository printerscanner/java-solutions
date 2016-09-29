import java.util.Scanner;

class indexOf {


	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Name a fruit: ");
		String fruit = sc.nextLine();
		int index = fruit.indexOf('a');
		System.out.println(index);
	}
}