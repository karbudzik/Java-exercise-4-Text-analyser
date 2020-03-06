package application;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import iterators.WordIterator;



public class StatisticalAnalysis {
    
    private HashMap<String, Integer> elementsCount;
    private HashMap<String, String> results;
    private Iterator<String> iterator;
    
    public StatisticalAnalysis(Iterator<String> iterator) {
        this.iterator = iterator;
        elementsCount = new HashMap<>();
        results = new HashMap<>();

        countElementsToHashmap();
        
        if (this.iterator instanceof WordIterator) {
            getResultsForWords();
        } else {
            getResultsForChars();
        }

        View.print(results);
    };

    private void countElementsToHashmap() {
        while (iterator.hasNext()) {
            String element = iterator.next();
            elementsCount.putIfAbsent(element, 0);
            elementsCount.put(element, elementsCount.get(element) + 1);
        }
    }

    private void getResultsForChars() {
        int countOfVowels = countOf("A", "E", "I", "O", "U", "Y");
        results.put("Vowels count", Integer.toString(countOfVowels));
    }

    private void getResultsForWords() {
        int countOfLove = countOf("LOVE");
        results.put("'LOVE' count", Integer.toString(countOfLove));
    }

    public int countOf(String... elems) {
        int count = 0;
        for (String s: elems) {
            if (elementsCount.containsKey(s)) {
                count += elementsCount.get(s);
            }
        }
        return count;
    }

    public int dictionarySize() {
        //Returns the number of unique elements of the dataset. 
        //It’s the size so-called Author’s Dictionary - the set of different 
        //words the author of the text uses.

        int test = 0;
        return test;
    }

    public int size() {
        //Returns the total number of all elements in the dataset. 
        //This will be total number of words or total number of characters.

        int test = 0;
        return test;
    }

    public Set<String> occurMoreThan(Integer n) {
        //Returns all the elements that occur more than _n __times _ in the dataset
        
        Set<String> test = new HashSet<>();
        return test;
    }
}