import java.util.Random;

class randomArray {


	public static int randomInt(int min, int max) {
		Random rn = new Random();
		int randomNum = rn.nextInt((max - min) + 1) + min;
		return randomNum;
	}

	public static int[] randomArray(int n) {
		int[] a = new int[n]; // new to create
		for (int i = 0; i<a.length; i++) {
			a[i] = randomInt(0, 100);
		}
		return a;
	}


	public static void printArray(int[] a) {
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}



	public static void main(String[] args) {
		int numValues = 8;
		int[] array = randomArray(numValues);
		printArray(array);
	}
}