package application;

import java.util.Iterator;
import iterators.*;

public class Application {
    // tu trzymamy (lub tylko liczymy) szczegółowe dane
    public static void main(String[] args){
        FileContent fileContent = new FileContent(args[0]); // jak dawałam IterableText to mi nie pozwalało używać nowych metod
        Iterator<String> wordIterator = fileContent.wordIterator();
        Iterator<String> charIterator = fileContent.charIterator();
        StatisticalAnalysis wordAnalysis = new StatisticalAnalysis(wordIterator);
        StatisticalAnalysis charAnalysis = new StatisticalAnalysis(charIterator);

        View.printName(fileContent.getFileName());
    }
}



// Do iterowania po większej ilości argumentów:
// for (int i = 0; i < args.length; i++) {
//     System.out.println(args[i]);
// }

// Dorobić "measuring time of execution";