class Tile {
		char letter;
		int value;

		public Tile(char letter, int value) {
			this.letter = letter;
			this.value = value;
		}

		public static void printTile(char letter, int value) {
			System.out.print(letter);
			System.out.print(":");
			System.out.println(value);
		}

		public Tile testTile() {
			System.out.println(printTile(Z,10));
		}


}