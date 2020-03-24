package application;

import java.io.FileNotFoundException;
import java.util.Iterator;
import iterators.*;

public class Application {
    
    private String fileName;

    public Application(String fileName) {
        this.fileName = fileName;
    }
    
    public void run(){
        try {
            long startTime = startTime();
            FileContent fileContent = new FileContent(fileName);
            View.printName(fileContent.getFileName());
            conductAnalysis(fileContent);
            Double timeOfExacution = measureTimeOfExecution(startTime);
            View.print(String.format("Time of execution: %.3f seconds\n", timeOfExacution));
        } catch (FileNotFoundException e) {
            View.print(String.format("File %s not found!", fileName));
        }   
    }

    private void conductAnalysis(FileContent fileContent) {
        Iterator<String> wordIterator = fileContent.wordIterator();
        StatisticalAnalysis wordAnalysis = new StatisticalAnalysis(wordIterator);
        wordAnalysis.runAnalysis();
        Iterator<String> charIterator = fileContent.charIterator();
        StatisticalAnalysis charAnalysis = new StatisticalAnalysis(charIterator); 
        charAnalysis.runAnalysis();
    }

    private long startTime() {
        return System.nanoTime();
    }

    private Double measureTimeOfExecution(long startTime) {
        long endTime = System.nanoTime();
        Double startTimeDouble = Double.valueOf(startTime);
        Double endTimeDouble = Double.valueOf(endTime);
    
        return (endTimeDouble - startTimeDouble) / 1000000000.0;
    }
}