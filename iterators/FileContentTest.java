package iterators;

import java.io.FileNotFoundException;
import org.junit.Test;

public class FileContentTest {
    
    @Test(expected = FileNotFoundException.class)
    public void should_return_FileNotFoundException_while_file_not_exist() throws FileNotFoundException {
        // given:
        String notExistingFileName = "notExistingFile";

        // when:
        new FileContent(notExistingFileName);
    } 
}