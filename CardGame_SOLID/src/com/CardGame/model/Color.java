package com.CardGame.model;

public enum Color {
	
	
	
	Trefle(4), 
	Pique(3), 
	Cœur(2),  
	Carreau(1);
	
	int color;

	private Color(int value) {
		color = value;
	}

	public int value() {
		return color;
	}

}
