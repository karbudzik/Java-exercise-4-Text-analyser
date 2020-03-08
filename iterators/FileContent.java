package iterators;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Iterator;
import java.util.Scanner;

// czy jest plik
// czy plik nie jest pusty
// prawidłowość wyliczeń
// więcej nazw czy akceptuje (?)
// różne wielkości znaków?

public class FileContent implements IterableText {
    
    private String fileName;
    String fileContentString;

    public FileContent(String name) throws FileNotFoundException {
        fileName = name;
        fileContentString = "";
       
        readFile(fileName);
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
