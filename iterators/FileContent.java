package iterators;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Iterator;
import java.util.Scanner;

public class FileContent implements IterableText {
    
    private String fileName;
    String fileContentString;

    public FileContent(String name) {
        fileName = name;
        fileContentString = "";
        try {
            readFile(fileName);
        } catch (FileNotFoundException e) {
            System.out.println("There is no such file");
        }
    }

    private void readFile(String name) throws FileNotFoundException {
        File myFile = new File(fileName);
        Scanner myReader = new Scanner(myFile);
        fileContentString = myReader.useDelimiter("\\A").next();
        myReader.close();
    }

    @Override
    public Iterator<String> charIterator() {
        Iterator<String> myIterator = new CharIterator(this);
        return myIterator;
    }

    @Override
    public Iterator<String> wordIterator() {
        Iterator<String> myIterator = new WordIterator(this);
        return myIterator;
    }

    public String getFileName() {
        return fileName;
    }
}    
