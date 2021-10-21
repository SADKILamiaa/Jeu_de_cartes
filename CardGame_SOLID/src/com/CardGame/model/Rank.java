package com.CardGame.model;

public enum Rank {
	
	TWO (2),
	THREE (3),
	FOUR (4),
	FIVE (5),
	SIX (6),
	SEVEN (7),
	EIGHT (8),
	NINE (9),
	JACK (10),
	QUEEN (11),
	KING (12),
	ACE (13);

	
	// faire correspondre un entier à une valeur de carte et inversement
	
	int rank;
	
	private Rank(int value) 
		{
			rank = value;
		}
	
	public int value() {
			return rank;
		}
	

}
