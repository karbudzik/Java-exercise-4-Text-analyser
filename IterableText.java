import java.util.Iterator;

interface IterableText {
    
    public Iterator<String> charIterator();
    public Iterator<String> wordIterator();
} 