import java.io.File;
import java.io.FileNotFoundException;
import java.util.Iterator;
import java.util.Scanner;

public class FileContent implements IterableText {

    private String fileName;
    private String fileContent; // czy w ogóle potrzebuję tego i readFile?

    public FileContent(String name) {
        fileName = name;
        fileContent = "";
        try {
            readFile(fileName);
        } catch (FileNotFoundException e) {
            System.out.println("There is no such file");
        }
    }

    private void readFile(String name) throws FileNotFoundException {
        File myFile = new File(fileName);
        Scanner myReader = new Scanner(myFile);
        fileContent = myReader.useDelimiter("\\A").next();
        myReader.close();
    }

    @Override
    public Iterator<String> charIterator() {
        Iterator<String> myIterator = new CharIterator(new FileContent(fileName));
        return myIterator;
    }

    @Override
    public Iterator<String> wordIterator() {
        Iterator<String> myIterator = new WordIterator(new FileContent(fileName));
        return myIterator;
    }

    public String getFileName() {
        return fileName;
    }

}    
