package fr.esiea.unique.binome.name.dictionary;

import java.io.*;
import java.util.*;

public class Dictionary implements IDictionary {
	
	private static Scanner scan;
	private BufferedReader br;

	public static void main(String[] args) {		

	}

	public boolean isWord(String word) {
		
		try{

			FileReader fr = new FileReader("src/main/resources/dico.txt");
			br = new BufferedReader(fr);
			String s;
			String wordDico = null;

			while((s = br.readLine()) != null) {
				scan = new Scanner(s);
				while (scan.hasNext()) {
					wordDico = scan.next().toLowerCase();
					if(wordDico.equals(word)) {
						System.out.println("Mot existant");
						return true;
					}
				}
			}
		br.close();
		fr.close();
		System.out.println("Mot inexistant");
		return false;

		} catch (Exception e){//Catch exception if any
		System.err.println("Error: " + e.getMessage());
		}
		return false;
	}

}
