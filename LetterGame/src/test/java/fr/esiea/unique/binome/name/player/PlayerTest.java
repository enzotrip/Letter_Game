package fr.esiea.unique.binome.name.player;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import fr.esiea.unique.binome.name.word.Word;

public class PlayerTest {
	
	private Player player;
	private List<Word> listWords = new ArrayList<>();
	
	@Before
	public void setup() {
		player = new Player(listWords);
		Word word = new Word("enzo");
		player.addWordList(listWords, word);
		Word word2 = new Word("sarah");
		player.addWordList(listWords, word2);
		System.out.println(listWords.get(0).getWord());
	}
	
//	@Test
//	public void testGetNbWords() {
//		System.out.println(player.getNbWords());
//	}
//	
//	@Test
//	public void testIncreaseNbWords() {
//		player.increaseNbWords(player.getNbWords());
//		System.out.println(player.getNbWords());
//	}
//	
//	@Test
//	public void testDecreaseNbWords() {
//		player.decreaseNbWords(player.getNbWords());
//		System.out.println(player.getNbWords());
//	}

//	@Test
//	public void testAddWordList() {
//		Word word = new Word("sarah");
//		player.addWordList(listWords, word);
//		
//		System.out.println(listWords.get(0).getWord());
//	}
	
	@Test
	public void testDelWordList() {
		Word word = new Word("enzo");
		player.delWordList(listWords, word);
		System.out.println(listWords.get(0).getWord());
	}
}
