package fr.esiea.unique.binome.name.letter;

public class Letter {
	
	private char value;
	private int weight;
	private int nbOccurences;

	public Letter(char value, int weight, int nbOccurences) {
		this.setValue(value);
		this.setWeight(weight);
		this.setNbOccurences(nbOccurences);
	}

	public char getValue() {
		return value;
	}

	public void setValue(char value) {
		this.value = value;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public int getNbOccurences() {
		return nbOccurences;
	}

	public void setNbOccurences(int nbOccurences) {
		this.nbOccurences = nbOccurences;
	}
	
	public void replaceLetter(char value) {
		switch(value) {
		case 'à':
			this.value = 'a';
			break;
		case 'é': case 'è': case 'ê':
			this.value = 'e';
			break;
		case 'î':
			this.value = 'i';
			break;
		case 'ô':
			this.value = 'o';
			break;
		}
	}

}
