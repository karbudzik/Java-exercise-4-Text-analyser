package application;

import java.io.FileNotFoundException;
import java.util.Iterator;
import iterators.*;

public class Application {
    
    public static void main(String[] args){
        try {
            FileContent fileContent = new FileContent("test.txt"); // jak dawałam IterableText to mi nie pozwalało używać nowych metod
            View.printName(fileContent.getFileName());
            // zamknąć to w zgrabniejszą metodę:
            Iterator<String> wordIterator = fileContent.wordIterator();
            new StatisticalAnalysis(wordIterator);
            
            Iterator<String> charIterator = fileContent.charIterator();
            new StatisticalAnalysis(charIterator); 
        } catch (FileNotFoundException e) {
            View.print("File not found!!!!!!!");
        }
        
        
    }
}



// Do iterowania po większej ilości argumentów:
// for (int i = 0; i < args.length; i++) {
//     System.out.println(args[i]);
// }

// Dorobić "measuring time of execution";