//It's the dataset. It is initialized with Iterator and provides 
//functions for statistical analysis of the text elements (Strings). 
//NOTE: You may choose any data structure to store the processed data. 
//The choice will affect the amount of code you will have to write.

package application;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class StatisticalAnalysis {
    public StatisticalAnalysis(Iterator<String> iterator) {
        // treść
    };
    
    public int countOf(String... elems) {
        //Returns sum of all occurrences (in the dataset) of the elements 
        //given as arguments ( elems). 
        //Note: One string may be given as well. 
        //The three-dots operator will help you pass variable number of 
        //arguments to the function and access them with ease.

        //https://docs.oracle.com/javase/tutorial/java/javaOO/arguments.html#varargs

        int test = 0;
        return test;
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