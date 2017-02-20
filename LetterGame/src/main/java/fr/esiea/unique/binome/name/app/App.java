package fr.esiea.unique.binome.name.app;

import fr.esiea.unique.binome.name.letterGameEngine.LetterGameEngine;

public class App {
	
	public static void main(String[] args) {
		
		LetterGameEngine game = new LetterGameEngine();
		game.initialisationGame();
		game.run();
	}

}
