package fr.esiea.unique.binome.name.word;

import java.util.ArrayList;
import java.util.List;

public class Word {
	
	private String word;

	public Word(String word) {
		this.setWord(word);
	}

	public String getWord() {
		return word;
	}

	public void setWord(String word) {
		this.word = word;
	}
	
	public boolean wordIsRight(String word, List<Character> listCP) {
		
		boolean exist = false;
		List<Character> list = new ArrayList<>();
		
		for(char c : word.toCharArray()) {
			list.add(c);
		}
		
		for(int i=0; i<list.size(); i++) {
			for(int j=0; j<listCP.size(); j++) {
				if(list.get(i) == listCP.get(j) && exist == false) {
					exist = true;
				} else continue;
			} if(exist == false) {
				System.out.println("La lettre " + list.get(i) + " n'existe pas");
				return false;
			} else exist = false;
		}
		System.out.println("Les lettres existent");
		return true;
	}

}
