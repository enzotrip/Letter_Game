package fr.esiea.unique.binome.name.player;

import java.util.ArrayList;
import java.util.List;

import fr.esiea.unique.binome.name.word.Word;

public class Player {
	
	private int nbWords;
	private List<Word> listWords = new ArrayList<>();

	public Player(List<Word> listWords) {
		this.setNbWords(0);
		this.setListWords(listWords);
	}

	public int getNbWords() {
		return nbWords;
	}

	public void setNbWords(int nbWords) {
		this.nbWords = nbWords;
	}
	
	public void increaseNbWords(int nbWords) {
		this.nbWords = nbWords + 1;
	}
	
	public void decreaseNbWords(int nbWords) {
		if(nbWords > 0) {
			this.nbWords = nbWords - 1;
		} else {
			this.nbWords = nbWords;
		}
	}

	public void addWordList(List<Word> listWords, Word word) {
		if(this.listWords.add(word)) {
			increaseNbWords(getNbWords());
		}
		
	}
	
	public void delWordList(List<Word> listWords, Word word) {
		for(int i=0; i<listWords.size(); i++) {
			if(listWords.get(i).getWord() == word.getWord()) {
				listWords.remove(i);
				decreaseNbWords(getNbWords());
			}
		}
	}

	
	public List<Word> getListWords() {
		return listWords;
	}

	public void setListWords(List<Word> listWords) {
		this.listWords = listWords;
	}

}
