class inRange {

	public static double inRange(double[] a, double low, double high) {
		int count = 0;
		for (int i = 0; i<a.length; i++) {
			if (a[i] >= low && a[i] < high) {
				count++;
			}
		}
		return count;
	}

	public static void main(String[] args) {

	}
}