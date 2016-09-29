class fruit {

	public static void main(String[] args) {
		String fruit = "banana";
		int index = (fruit.length()-1);
		while (index >= 0) {
			char letter = fruit.charAt(index);
			System.out.println(letter);
			index = index - 1;
		}
	}
}