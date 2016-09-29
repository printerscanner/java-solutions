class beerBottles {

	public static void takeThemDown(int n) {
		n = 99;
		if (n < 0) {
			System.out.print(n + " bottles of beer on the wall," + n + " bottles of beer, ya’ take one
down, ya’ pass it around," + (n-1) + " bottles of beer on the wall.");
		} else {
			if (n == 0) {
				System.out.println("
No bottles of beer on the wall, no bottles of beer, ya’ can’t take one down, ya’ can’t pass it around, ’cause there are no more bottles of beer on the wall!");
				takeThemDown(n-1);
			}
		}
	}

	public static void main(String[] args) {
		takeThemDown();
	}
}