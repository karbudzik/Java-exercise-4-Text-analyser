package application;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import org.junit.Test;

public class StatisticalAnalysisTest {
    
    @Test
    public void should_calculate_results_for_chars_correctly() {
    
        // given:
        List<String> chars = Arrays.asList("a", "b", "A", "B");
        Iterator<String> fakeCharIterator = new FakeCharIterator(chars);
        int expectedNumberOfElems = 2;

        // when:
        StatisticalAnalysis analysis = new StatisticalAnalysis(fakeCharIterator);
        analysis.runAnalysis();
        int numberOfElems = analysis.getElementsCount().size();
        
        // then:
        assertEquals(expectedNumberOfElems, numberOfElems);
    } 
}