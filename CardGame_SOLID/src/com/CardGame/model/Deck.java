package com.CardGame.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Deck //jeu 
 {
	
private List<PlayingCard> cards;
	
	public Deck() {
		cards = new ArrayList<PlayingCard>();
		for(Rank rank : Rank.values()) {
			for(Color color: Color.values()) {
				System.out.println("Creating card ["+rank+"]["+color+"]");
				cards.add(new PlayingCard(rank, color));
			}
		}
		
		shuffle();
	}

	//melange du carte
		public void shuffle() {
			Random random = new Random();
			for (int i = 0; i < cards.size(); ++i) {
				Collections.swap(cards, i, random.nextInt (cards.size()));
			}
		}
		
	//tirer la 1ere carte du paquets
		public PlayingCard removeTopCard() {
			return cards.remove(0);
		}

	//remetre la carte dans le paquets
		public void returnCardToDeck(PlayingCard pc) {
			cards.add(pc);
		}

	public List<PlayingCard> getCards() {
		return cards;
	}

}
