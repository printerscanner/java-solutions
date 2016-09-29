import java.lang.Math;

class poftheweek {

	public static void main(String[] args) {

		for (int i = 10; i < 100; i ++) {
			
			double exponent = Math.pow(10, i);
			System.out.println(exponent - i);
		}
	}
}