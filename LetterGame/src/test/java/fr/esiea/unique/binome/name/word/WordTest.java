package fr.esiea.unique.binome.name.word;

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

public class WordTest {
	
	private Word word;
	Scanner reader = new Scanner(System.in);
	
	private CommonPot commonPot;
	private List<Letter> listCP = new ArrayList<>();
	
	private Bag bag;
	private List<Letter> listBag = new ArrayList<>();
	
	private IDictionary dictionary;
	
	@Before
	public void setup() {
		word = new Word(null);
		commonPot = new CommonPot(listCP);
		dictionary = new Dictionary();
		bag = new Bag(listBag);
		
		bag.initBagList(listBag);
		bag.shuffleList(listBag);
	}
	
	@Test
	public void testWordIsRight() {
		Letter letter1 = bag.getFirstLetter(listBag);
		commonPot.addCPLetter(listCP, letter1);
		
		Letter letter2 = bag.getSecondLetter(listBag);
		commonPot.addCPLetter(listCP, letter2);
		
		Letter letter3 = listBag.get(2);
		commonPot.addCPLetter(listCP, letter3);
		
		Letter letter4 = listBag.get(3);
		commonPot.addCPLetter(listCP, letter4);
		
		List<Character> listValue = commonPot.getCPList(listCP);
		System.out.println("Pot commun : " + listValue);
		
		System.out.println("Enter a word with common pot letters: ");
		String wordWritten = reader.nextLine();
		System.out.println("Vous avez saisi : " + wordWritten);
		
		if(word.wordIsRight(wordWritten, listValue)) {
			if(dictionary.isWord(wordWritten)) {
				System.out.println("Les lettres vont être supprimées du pot commun");
				if(commonPot.delLetterFromWord(listCP, wordWritten)) {
					System.out.println("Les lettres ont été supprimées du pot commun");
					List<Character> listValue2 = commonPot.getCPList(listCP);
					System.out.println("Pot commun : " + listValue2);
				} else System.out.println("Erreur");
			} else System.out.println("Erreur");
		} else System.out.println("Erreur");
	}

}
