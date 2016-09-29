class randomArr {

	public static int[] randomArray(int n) {
		int[] a = new int[n];
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
}