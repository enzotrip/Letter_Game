package fr.esiea.unique.binome.name.bag;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import fr.esiea.unique.binome.name.letter.Letter;

public class BagTest {
	
	private Bag bag;
	private List<Letter> list = new ArrayList<>();
	
	@Before
	public void setup() {
		bag = new Bag(list);
		//Letter l = new Letter('a', 0, 4);
		//bag.addBagLetter(list, l);
		bag.initBagList(list);
	}
	
	@Test
	public void testBag() {
		int size = bag.getBagSize(list);
		int letter = bag.getBagLetter(list, 2).getValue();
		System.out.println(size);
		System.out.println((char)letter);
	}
	
	@Test
	public void testListValue() {
		bag.shuffleList(list);
		List<Character> listValue = bag.getBagList(list);
		System.out.println(listValue);
	}

}
