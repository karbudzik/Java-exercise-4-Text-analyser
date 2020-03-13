package application;

import java.util.Iterator;
import java.util.List;

public class FakeCharIterator implements Iterator<String> {

    private List<String> fileContentList;
    private int count;
    
    public FakeCharIterator(List<String> fileContentList) {
        this.fileContentList = fileContentList;
        count = 0;
    }

    @Override
    public boolean hasNext() {
        return  (count < fileContentList.size());
    }

    @Override
    public String next() {
        return fileContentList.get(count++).toUpperCase();
    }

}