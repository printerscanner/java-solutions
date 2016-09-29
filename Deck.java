class Deck {
	Card[] cards;

	public Deck(int n) {
		this.cards = new Card[n];
	}

	public Deck() {
		this.cards = new Card[52];
		int index = 0;
		for (int suit = 0; suit <=3; suit++) {
			for (int rank = 1; rank <=13; rank++) {
				cards[index] = new Card(suit, rank);
				index++;
			}
		}
	}

	public static void printDeck(Deck deck) {
		for (int i = 0; i < deck.cards.length; i++) {
			Card.printCard(deck.cards[i]);
		}
	}

	for (int i = 0; i < deck.cards.length; i++) {
		// choose a number between i and deck.cards.length-1
		// swap the ith card and the randomly chosen card
	}

	// Now we have messed up deck, we need to put it back in order
	// Selection sort traverses the array selecting lowest remaining card each time

	for (int i = 0; i < deck.cards.length; i++) {
		// find the lowest card at or to the right of i 
		// swap the ith card with the lowest card
	}
}