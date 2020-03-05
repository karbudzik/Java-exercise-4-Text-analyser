import java.util.Iterator;

public class Application {
    
    public static void main(String[] args){
        IterableText fileContent = new FileContent(args[0]);
        Iterator<String> wordIterator = fileContent.wordIterator();
        Iterator<String> charIterator = fileContent.charIterator();
        // StatisticalAnalysis() - co przekazujemy jako argument???
    }
}



// Do iterowania po większej ilości argumentów:
// for (int i = 0; i < args.length; i++) {
//     System.out.println(args[i]);
// }

// Dorobić "measuring time of execution";