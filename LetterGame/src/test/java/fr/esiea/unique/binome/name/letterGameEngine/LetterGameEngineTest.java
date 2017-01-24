package fr.esiea.unique.binome.name.letterGameEngine;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.junit.Before;
import org.junit.Test;

import fr.esiea.unique.binome.name.bag.Bag;
import fr.esiea.unique.binome.name.commonPot.CommonPot;
import fr.esiea.unique.binome.name.dictionary.Dictionary;
import fr.esiea.unique.binome.name.dictionary.IDictionary;
import fr.esiea.unique.binome.name.letter.Letter;
import fr.esiea.unique.binome.name.player.Player;
import fr.esiea.unique.binome.name.word.Word;

public class LetterGameEngineTest {
	
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
	
	boolean p1Play;
	
	@Before
	public void setup() {
		commonPot = new CommonPot(listCP);
		bag = new Bag(listBag);
		dictionary = new Dictionary();
		
		bag.initBagList(listBag);
		bag.shuffleList(listBag);
		
		Letter letter1 = bag.getFirstLetter(listBag);
		System.out.println("Joueur 1 pioche la lettre : " + letter1.getValue());
		commonPot.addCPLetter(listCP, letter1);
		
		Letter letter2 = bag.getSecondLetter(listBag);
		System.out.println("Joueur 2 pioche la lettre : " + letter2.getValue());
		commonPot.addCPLetter(listCP, letter2);
		
		if(letter1.getWeight() <= letter2.getWeight()) {
			System.out.println("Joueur 1 commence");
			p1Play = true;
		} else {
			System.out.println("Joueur 2 commence");
			p1Play = false;
		}
		
		List<Character> listValue = commonPot.getCPList(listCP);
		System.out.println("Pot commun : " + listValue);
	}
	
	@Test
	public void test() {
		while(p1.getNbWords() < 10 || p2.getNbWords() < 10) {
			
			bag.shuffleList(listBag);
			
			Letter letter1 = bag.getFirstLetter(listBag);
			commonPot.addCPLetter(listCP, letter1);
			Letter letter2 = bag.getSecondLetter(listBag);
			commonPot.addCPLetter(listCP, letter2);
			
			if(p1Play) {
				System.out.println("Joueur 1: " + p1.getNbWords() + " mots");
				if(!listWordP1.isEmpty()) {
					for(int i=0; i<listWordP1.size(); i++) {
						System.out.println(listWordP1.get(i).getWord());
					}
				}
			} else {
				System.out.println("Joueur 2: " + p2.getNbWords() + " mots");
				if(!listWordP2.isEmpty()) {
					for(int i=0; i<listWordP2.size(); i++) {
						System.out.println(listWordP2.get(i).getWord());
					}
				}
			}
					
			List<Character> listValue = commonPot.getCPList(listCP);
			System.out.println("Pot commun : " + listValue);
			
			System.out.println("Enter a word with common pot letters: ");
			String wordWritten = reader.nextLine();
			System.out.println("Vous avez saisi : " + wordWritten);
			
			Word word = new Word(wordWritten);
			
			if(word.wordIsRight(wordWritten, listValue)) {
				if(dictionary.isWord(wordWritten)) {
					System.out.println("Les lettres vont être supprimées du pot commun");
					if(commonPot.delLetterFromWord(listCP, wordWritten)) {
						System.out.println("Les lettres ont été supprimées du pot commun");
						if(p1Play) {
							p1.addWordList(listWordP1, word);
						} else {
							p2.addWordList(listWordP2, word);
						}
					} else System.out.println("Erreur");
				} else System.out.println("Erreur");
			} else System.out.println("Erreur");
			
				
			p1Play = !p1Play;
		}
	}

}
