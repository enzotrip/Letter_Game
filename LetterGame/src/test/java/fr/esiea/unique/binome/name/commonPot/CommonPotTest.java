package fr.esiea.unique.binome.name.commonPot;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.junit.Before;
import org.junit.Test;

import fr.esiea.unique.binome.name.bag.Bag;
import fr.esiea.unique.binome.name.letter.Letter;

public class CommonPotTest {
	
	Scanner reader = new Scanner(System.in);
	
	private CommonPot commonPot;
	private List<Letter> listCP = new ArrayList<>();
	
	private Bag bag;
	private List<Letter> listBag = new ArrayList<>();
	
	@Before
	public void setup() {
		commonPot = new CommonPot(listCP);
		
		bag = new Bag(listBag);
		bag.initBagList(listBag);
		bag.shuffleList(listBag);
	}
	
//	@Test
//	public void testCreateLists() {
//		System.out.println(listCP);
//		
//		List<Character> listValue = bag.getBagList(listBag);
//		System.out.println(listValue);
//	}
	
//	@Test
//	public void addFirstAndSecondLetterToCP() {
//		
//		Letter letter1 = bag.getFirstLetter(listBag);
//		commonPot.addCPLetter(listCP, letter1);
//		
//		Letter letter2 = bag.getSecondLetter(listBag);
//		commonPot.addCPLetter(listCP, letter2);
//		
//		List<Character> listValue = commonPot.getCPList(listCP);
//		System.out.println(listValue);
//	}
	
	@Test
	public void delLettersFromWord(String word) {
		Letter letter1 = bag.getFirstLetter(listBag);
		commonPot.addCPLetter(listCP, letter1);
		
		Letter letter2 = bag.getSecondLetter(listBag);
		commonPot.addCPLetter(listCP, letter2);
		
		List<Character> listValue = commonPot.getCPList(listCP);
		System.out.println("Pot commun : " + listValue);
		
		System.out.println("Enter a letter: ");
		char letterEntered = reader.next().charAt(0);
		
		commonPot.delLetter(listCP, letterEntered);
		
		List<Character> listValue2 = commonPot.getCPList(listCP);
		System.out.println("Pot commun : " + listValue2);
	}
}
