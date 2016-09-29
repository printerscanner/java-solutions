class make {

	public static int[] make(int n) { // make array size n
		int[] a = new int[n];

		for (int i = 0; i < n; i++) {
			a[i] = i+1;
		}
		return a;
	}

	public static void dub(int[] jub) { // mutlply values of array by two
		for (int i = 0; i<jub.length; i++) {
			jub[i] *= 2;
		}
	}

	public static int mus(int[] zoo) {  // for each element of zoo array, add to prev. elemtn
		int fus = 0;
		for (int i = 0; i < zoo.length; i++) {
			fus = fus + zoo[i];
		}
		return fus;
	}

	public static void main(String[] args) {
		int[] bob = make(5); // make 5 element array called bob
		dub(bob); //

		System.out.println(mus(bob));
	}


}