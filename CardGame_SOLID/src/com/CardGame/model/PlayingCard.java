package com.CardGame.model;

public class PlayingCard {
	
	private Rank rank;
	private Color color;
	private boolean faceUp;  //pour connaitre si la carte est retournée ou non
		//un flag indiquant si la carte est face visible ou cachée
	
	// Seulement les get pour acceder seulement 
			public Rank getRank() {
				return rank;
			}
			
			public Color getColor() {
				return color;
			}
		
			
			public boolean isFaceUp() {
				return faceUp;
			}


	public PlayingCard(Rank rank, Color color) {
		super();
		this.rank = rank;
		this.color = color;
	}
	
	
	public boolean flip() {
		faceUp = !faceUp;
		return faceUp;
	}
	
	
	

}
