package fr.esiea.unique.binome.name.bag;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import fr.esiea.unique.binome.name.letter.Letter;

public class Bag {
	
	private List<Letter> list = new ArrayList<>();

	public Bag(List<Letter> list) {
		this.setList(list);
	}

	public Letter getFirstLetter(List<Letter> list) {
		return list.get(0);
	}
	
	public Letter getSecondLetter(List<Letter> list) {
		return list.get(1);
	}
	
	public void initBagList(List<Letter> list) {
		
		for(int i=0; i<26; i++) {
			if(i == 0 || i == 4 || i == 8 || i == 14 || i == 20 || i == 24) {
				for(int j=0; j<3; j++) {
					Letter l = new Letter((char)(i+97), i, 4);
					list.add(l);
				}
			}
			Letter l = new Letter((char)(i+97), i, 1);
			list.add(l);
		}
	}
	
	/*public void addBagLetter(List<Letter> list, Letter l) {
		this.list.add(l);
	}*/
	
	public int getBagSize(List<Letter> list) {
		return list.size();
	}
	
	public Letter getBagLetter(List<Letter> list, int index) {
		return list.get(index);
	}
	
	public List<Character> getBagList(List<Letter> list) {
		List<Character> listValue = new ArrayList<>();
		
		for(int i=0; i<list.size(); i++) {
			listValue.add(list.get(i).getValue());
		}
		
		return listValue;
	}
	
	public void shuffleList(List<Letter> list) {
		Collections.shuffle(list);
	}

	public List<Letter> getList() {
		return list;
	}

	public void setList(List<Letter> list) {
		this.list = list;
	}
}
