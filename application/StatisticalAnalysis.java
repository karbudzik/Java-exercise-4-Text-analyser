package application;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

import iterators.WordIterator;

public class StatisticalAnalysis {
    
    private HashMap<String, Integer> elementsCount;
    private HashMap<String, String> results;
    private Iterator<String> iterator;
    
    public StatisticalAnalysis(Iterator<String> iterator) {
        this.iterator = iterator;
        elementsCount = new HashMap<>();
        results = new HashMap<>();
    };

    public void runAnalysis() {
        countElementsToHashmap();
        calculateResultsForWords();            
        getResultsForChars();
        printResults();
    }

    private void countElementsToHashmap() {
        while (iterator.hasNext()) {
            String element = iterator.next();
            elementsCount.putIfAbsent(element, 0);
            elementsCount.put(element, elementsCount.get(element) + 1);
        }
    }

    private void getResultsForChars() {
        if (iterator instanceof WordIterator) {
            int countOfVowels = countOf("A", "E", "I", "O", "U");
            int countOfChars = size();
            int percentageOfVowels = countOfVowels * 100 / countOfChars;
            double ratio = Double.valueOf(countOf("A")) / Double.valueOf(countOf("E"));

            results.put("Char count", Integer.toString(countOfChars));
            results.put("Vowels count", Integer.toString(countOfVowels));
            results.put("Vowels %", Integer.toString(percentageOfVowels));
            results.put("'a' to 'e' ratio", String.format("%.3f", ratio));
        }
    }

    private void calculateResultsForWords() {
        if (iterator instanceof WordIterator) {
            int countOfWords = size();
            int countOfUniqueWords = dictionarySize();
            int countOfLove = countOf("love");
            int countOfHate = countOf("hate");
            Set<String> mostUsedWords = occurMoreThan(1);
            String mostUsedWordsString = String.join(", ", mostUsedWords);
            
            results.put("Word count", Integer.toString(countOfWords));
            results.put("Unique word count", Integer.toString(countOfUniqueWords));
            results.put("'love' count", Integer.toString(countOfLove));
            results.put("'hate' count", Integer.toString(countOfHate));
            results.put("Most used words", mostUsedWordsString);
        }
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
        Set<String> newSet = new TreeSet<String>();
        Double size = Double.valueOf(size());
        Double percent = Double.valueOf(0);
        Double value;
        for (String key: elementsCount.keySet()) {
            value = Double.valueOf(elementsCount.get(key));
            percent = (value / size) * 100.0;
            if (percent > n) {
                newSet.add(key);
            }
        }
        return newSet;
    }

    private void printResults() {
        View.print(results);
    }

    public HashMap<String, Integer> getElementsCount() {
        return elementsCount;
    }

    public HashMap<String, String> getResults() {
        return results;
    }
}
