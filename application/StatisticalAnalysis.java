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
        int countOfChars = size();
        int percentageOfVowels = countOfVowels * 100 / countOfChars;
        double ratio = Double.valueOf(countOf("A")) / Double.valueOf(countOf("E"));

        results.put("Char count", Integer.toString(countOfChars));
        results.put("Vowels count", Integer.toString(countOfVowels));
        results.put("Vowels %", Integer.toString(percentageOfVowels));
        results.put("'a' to 'e' ratio", String.format("%.3f", ratio));
    }

    private void getResultsForWords() {
        int countOfWords = size();
        int countOfUniqueWords = dictionarySize();
        int countOfLove = countOf("love");
        int countOfHate = countOf("hate");
        int countOfMusic = countOf("music");
        
        results.put("Word count", Integer.toString(countOfWords));
        results.put("Unique word count", Integer.toString(countOfUniqueWords));
        results.put("'love' count", Integer.toString(countOfLove));
        results.put("'hate' count", Integer.toString(countOfHate));
        results.put("'music' count", Integer.toString(countOfMusic));
    }

    public int countOf(String... elems) {
        int count = 0;
        for (String s: elems) {
            if (elementsCount.containsKey(s.toUpperCase())) {
                count += elementsCount.get(s.toUpperCase());
            }
        }
        return count;
    }

    public int dictionarySize() {
        int dictSize = elementsCount.size();
        return dictSize;
    }

    public int size() {
        int size = 0;
        for (int number: elementsCount.values()) {
            size += number;
        }

        return size;
    }

    public Set<String> occurMoreThan(Integer n) {
        //Returns all the elements that occur more than _n __times _ in the dataset
        
        Set<String> test = new HashSet<>();
        return test;
    }

    public HashMap<String, Integer> getElementsCount() {
        return elementsCount;
    }

    public HashMap<String, String> getResults() {
        return results;
    }
}

// spr co musi być prywatne a co nie?