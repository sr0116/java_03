package card;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Player {
	List<Card> cards = new ArrayList<Card>();// g이미 해둠
	String name;
	
	Player(String name) {
		this.name = name;
	}
	
	public String toString() {
		return name + ":"+ cards;
	}
	
}
