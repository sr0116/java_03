package card;

public class Card {
// 배열로 함
	int number; // 2,3,4,...10,j,q,k,A
	int kind; // SPADE, DIAMOND,CLOVER
	
	public Card(int kind, int number) {
		this.kind =kind;
		this.number = number;
	}
		
	public String toString() {
		//10,2
		String numbers = "23456789XJQKA";
		String kinds = "♣♥◆♠";
		return "["+ kinds.charAt(kind) +","+ numbers.charAt(number)+"]";
	
	}
	
	public static void main(String[] args) {
		
		Card card = new Card(3,12);
		
		System.out.println(card);
	}
}
