package iterators;

import java.util.Iterator;

public class WordIterator implements Iterator<String> {

    private String fileContentString;
    private String[] fileContentArray;
    private int count;

    public WordIterator(FileContent fileContent) {
        this.fileContentString = fileContent.fileContentString.toUpperCase();
        fileContentArray = fileContentString.split("\\s+");
        count = 0;
    }

    @Override
    public boolean hasNext() {
        return  count < fileContentArray.length;
    }

    @Override
    public String next() {
        return fileContentArray[count++];
    }
}
   