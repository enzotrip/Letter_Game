package fr.esiea.unique.binome.name.letter;

import org.junit.Before;
import org.junit.Test;

public class LetterTest {
	
	private Letter l1;
	private Letter l2;
	
	@Before
	public void setup() {
		l1 = new Letter('a', 0, 4);
		l2 = new Letter('z', 26, 1);
	}
	
	@Test
	public void testLetter() {
		System.out.println("l1 value : " + l1.getValue());
		System.out.println("l1 weight : " + l1.getWeight());
		System.out.println("l1 occu : " + l1.getNbOccurences());
		
		System.out.println("l2 value : " + l2.getValue());
		System.out.println("l2 weight : " + l2.getWeight());
		System.out.println("l2 occu : " + l2.getNbOccurences());
	}

}
