package fr.esiea.unique.binome.name.commonPot;

import java.util.ArrayList;
import java.util.List;

import fr.esiea.unique.binome.name.letter.Letter;

public class CommonPot {
	
	private List<Letter> list = new ArrayList<>();

	public CommonPot(List<Letter> list) {
		this.setList(list);
	}

	public List<Letter> getList() {
		return list;
	}

	public void setList(List<Letter> list) {
		this.list = list;
	}

	public void addCPLetter(List<Letter> list, Letter letter) {
		list.add(letter);
	}

	public List<Character> getCPList(List<Letter> list) {
		List<Character> listValue = new ArrayList<>();
		
		for(int i=0; i<list.size(); i++) {
			listValue.add(list.get(i).getValue());
		}
		
		return listValue;
	}

	public boolean delLetter(List<Letter> list, char letter) {
		for(int i=0; i<list.size(); i++) {
			if(list.get(i).getValue() == letter) {
				list.remove(i);
				System.out.println("Lettre supprimée du pot commun");
				return true;
			}
		}
		System.out.println("La lettre n'existe pas dans le pot commun");
		return false;
	}
	
	public boolean delLetterFromWord(List<Letter> list, String word) {

		List<Character> listCharWord = new ArrayList<>();
		
		for(char c : word.toCharArray()) {
			listCharWord.add(c);
		}
		
		for(int i=0; i<listCharWord.size(); i++) {
			for(int j=0; j<list.size(); j++) {
				if(list.get(j).getValue() == listCharWord.get(i)) {
					list.remove(j);
					System.out.println("Lettre supprimée du pot commun");
				}
			}
		}
		return true;
	}
}
