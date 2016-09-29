import java.lang.Math.*;

class Multadd {

	public static double operation(double a, double b, double c) {
		double result = ((a*b) + c);
		return result;
	}

	public static double yikes(double x, double e) {
		double result = (x*(1/(Math.exp(x))) + (Math.sqrt(1 -(1/(Math.exp(x))))));
		return result;
	}

	public static void main(String[] args) {
		System.out.println(operation(1.0, 2.0, 3.0));
		System.out.println((Math.log(10) + Math.log(20)));
		System.out.println((Math.sin(Math.PI/4) + Math.cos(((Math.PI/4)/2))));	
		System.out.println(yikes(1,2));
	}
}