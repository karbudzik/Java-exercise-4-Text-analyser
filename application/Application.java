package application;

import java.util.Iterator;
import iterators.*;

public class Application {
    
    public static void main(String[] args){
        FileContent fileContent = new FileContent(args[0]); // jak dawałam IterableText to mi nie pozwalało używać nowych metod
        View.printName(fileContent.getFileName());
        
        Iterator<String> wordIterator = fileContent.wordIterator();
        StatisticalAnalysis wordAnalysis = new StatisticalAnalysis(wordIterator);
        
        Iterator<String> charIterator = fileContent.charIterator();
        StatisticalAnalysis charAnalysis = new StatisticalAnalysis(charIterator); 
    }
}



// Do iterowania po większej ilości argumentów:
// for (int i = 0; i < args.length; i++) {
//     System.out.println(args[i]);
// }

// Dorobić "measuring time of execution";