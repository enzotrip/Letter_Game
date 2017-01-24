package fr.esiea.unique.binome.name.letterGameEngine;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import fr.esiea.unique.binome.name.bag.Bag;
import fr.esiea.unique.binome.name.commonPot.CommonPot;
import fr.esiea.unique.binome.name.dictionary.Dictionary;
import fr.esiea.unique.binome.name.dictionary.IDictionary;
import fr.esiea.unique.binome.name.letter.Letter;
import fr.esiea.unique.binome.name.player.Player;
import fr.esiea.unique.binome.name.word.Word;

public class LetterGameEngine {
	
	List<Word> listWordP1 = new ArrayList<>();
	List<Word> listWordP2 = new ArrayList<>();
	List<Letter> listCP = new ArrayList<>();
	List<Letter> listBag = new ArrayList<>();
	
	Scanner reader = new Scanner(System.in);
	
	CommonPot commonPot;
	Bag bag;
	IDictionary dictionary;
	
	Player p1 = new Player(listWordP1);
	Player p2 = new Player(listWordP2);
	
	public void main(String[] args) {
		
		initialisationGame();
		run();
	}
	
	public void initialisationGame() {
		commonPot = new CommonPot(listCP);
		bag = new Bag(listBag);
		dictionary = new Dictionary();
		
		bag.initBagList(listBag);
		bag.shuffleList(listBag);
		
		System.out.println("Joueur 1 pioche une lettre");
		System.out.println("Joueur 2 pioche une lettre");
	}
	
	public void run() {
		while(p1.getNbWords() >= 10 || p2.getNbWords() >= 10) {
			
		}
	}

}
