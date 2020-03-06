package application;

import java.util.Iterator;
import iterators.*;

public class Application {
    
    public static void main(String[] args){
        IterableText fileContent = new FileContent(args[0]);
        Iterator<String> wordIterator = fileContent.wordIterator();
        Iterator<String> charIterator = fileContent.charIterator();
        StatisticalAnalysis wordAnalysis = new StatisticalAnalysis(wordIterator);
        StatisticalAnalysis charAnalysis = new StatisticalAnalysis(charIterator);
    }
}



// Do iterowania po większej ilości argumentów:
// for (int i = 0; i < args.length; i++) {
//     System.out.println(args[i]);
// }

// Dorobić "measuring time of execution";