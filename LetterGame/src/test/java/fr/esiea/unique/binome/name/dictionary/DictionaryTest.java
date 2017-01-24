package fr.esiea.unique.binome.name.dictionary;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;


/**
 * Unit test sample for Dictionary.
 */
public class DictionaryTest {

    private IDictionary dictionary;

    @Before
    public void setup() {
    	dictionary = new Dictionary();
    }

    @Test
    public void testIsWord() {
    	//System.out.println(aListWords.get(aListWords.size()-1));
        assertTrue(dictionary.isWord("zoo"));
        assertFalse(dictionary.isWord("lol"));
    }
}
