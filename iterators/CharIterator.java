package iterators;

import java.util.Iterator;

public class CharIterator implements Iterator<String> {

    private String fileContentString;
    private String[] fileContentArray;
    private int count;
    
    public CharIterator(FileContent fileContent) {
        this.fileContentString = fileContent.fileContentString.toUpperCase();
        this.fileContentString.replaceAll("\\s+", "");
        fileContentArray = fileContentString.split("");
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
// czemu nie każe mi implementować np. remove?