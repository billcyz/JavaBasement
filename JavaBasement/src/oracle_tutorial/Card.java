package oracle_tutorial;

public class Card {

	private final int rank;
	private final int suit;

	// Kinds of suits
	public final static int DIAMONDS = 1;
    public final static int CLUBS = 2;
    public final static int HEARTS = 3;
    public final static int SPADES = 4;

	// Kinds of rank
	public final static int ACE = 1;
	public final static int DEUCE = 2;
	public final static int THREE = 3;
	public final static int FOUR = 4;
	public final static int FIVE = 5;
	public final static int SIX = 6;
	public final static int SEVEN = 7;
	public final static int EIGHT = 8;
	public final static int NINE = 9;
	public final static int TEN = 10;
	public final static int JACK = 11;
	public final static int QUEEN = 12;
	public final static int KING = 13;

	// constructor
	public Card(int rank, int suit) {

		assert isRankAvailable(rank);
		assert isSuitAvailable(suit);
		this.rank = rank;
		this.suit = suit;
	}

	// validate rank and suit
	public static boolean isRankAvailable(int rank) {
		return ACE <= rank && rank <= KING;
	}

	public static boolean isSuitAvailable(int suit) {
		return HEARTS <= suit && suit <= SPADES;
	}

	public int getRank() {
		return rank;
	}

	public int getSuit() {
		return suit;
	}

	// convert rank to string
	public static String rankToString(int rank) {
		switch (rank) {
		case ACE:
			return "ACE";
		case DEUCE:
			return "DEUCE";
		case THREE:
			return "THREE";
		case FOUR:
			return "FOUR";
		case FIVE:
			return "FIVE";
		case SIX:
			return "SIX";
		case SEVEN:
			return "SEVEN";
		case EIGHT:
			return "EIGHT";
		case NINE:
			return "NINE";
		case TEN:
			return "TEN";
		case JACK:
			return "JACK";
		case QUEEN:
			return "QUEEN";
		case KING:
			return "KING";
		default:
			return null;
		}
	}

	// convert suit to string
	public static String suitToString(int suit) {
		switch (suit) {
		case HEARTS:
			return "Hearts";
		case DIAMONDS:
			return "Diamonds";
		case CLUBS:
			return "Clubs";
		case SPADES:
			return "Spades";
		default:
			return null;
		}
	}

	public static void main(String[] args) {

		// must run program with -ea flag (java -ea ..) to
		// use assert statements
		assert rankToString(ACE) == "Ace";
		assert rankToString(DEUCE) == "Deuce";
		assert rankToString(THREE) == "Three";
		assert rankToString(FOUR) == "Four";
		assert rankToString(FIVE) == "Five";
		assert rankToString(SIX) == "Six";
		assert rankToString(SEVEN) == "Seven";
		assert rankToString(EIGHT) == "Eight";
		assert rankToString(NINE) == "Nine";
		assert rankToString(TEN) == "Ten";
		assert rankToString(JACK) == "Jack";
		assert rankToString(QUEEN) == "Queen";
		assert rankToString(KING) == "King";

		assert suitToString(DIAMONDS) == "Diamonds";
		assert suitToString(CLUBS) == "Clubs";
		assert suitToString(HEARTS) == "Hearts";
		assert suitToString(SPADES) == "Spades";
		
	}

}
