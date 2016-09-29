class isTriangle {

	public static boolean isTriangle(int a, int b, int c) {
		if ((a+b) < c) {
			return false;
		} else {
			if ((a+c) < b) {
				return false;
			} else {
				if ((b+c) < a) {
					return false;
				} else {
					return true;
 			}
		}
	}
}

	public static void main(String[] args) {
		System.out.println(isTriangle(4,5,8));
	}
}