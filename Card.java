class Card {

	int suit, rank;

	public Card(int suit, int rank) {
		this.suit = suit;
		this.rank = rank;
	}

	public static void printCard(Card c){
	String[] suits = {"Clubs", "Diamonds", "Hearts", "Spades"};
	String[] ranks = {"narf", "Ace", "2", "3", "4", "5", 
					  "6", "7", "8", "9", "10", "Jack", "Queen", "King"};
	// narf is a place  keeper for zeroeth element in the array, 
	// which is never used ... or shouldn't be

	System.out.println(ranks[c.rank] + " of " + suits[c.suit]);
	}

	public static boolean sameCard(Card c1, Card c2) {
		return(c1.suit == c1.suit && c1.rank == c2.rank);
	}

	public static boolean sameCard2(Card c1, Card c2) {
			return(c1.suit == c2.suit && c1.rank == c2.rank);
		}


	public static void main(String[] args) {
		Card card = new Card(1,11);
		printCard(card);


		//Card card1 = new Card(2,12);
		//Card card2 = card1;

	//	if (card1 == card2) { // identical
	//		System.out.println("The strings are identical");
	//	}

		Card card1 = new Card(2,3);
		Card card2 = new Card(2,3);

		if (sameCard(card1, card2)) {
			System.out.println("card1 and card two are equivalent");
		}
  
	}
}











