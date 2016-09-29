class cloneArray {

	public static void main(String[] args) {

		int a[] = {1, 2, 3, 4, 5, 6};
		int b[] = new int[a.length];

		for(int i = 0; i < a.length; i++) {
			a[i] = b[i];
			System.out.println(b);
		}
	}	
}