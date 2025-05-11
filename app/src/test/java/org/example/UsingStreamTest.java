package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class UsingStreamTest {

    UsingStream teststream = new UsingStream();

    int[] testlist = {5, 10, 18, 5, 2, 1, 16};

    @Test
    void testMaximums(){
        assertEquals(18, teststream.maximumUsingStream(testlist));
    }

    @Test
    void testMinimums(){
        assertEquals(1, teststream.minimumUsingStream(testlist));
    }

     @Test
    void testSums(){
        assertEquals(57, teststream.sumUsingStream(testlist));
    }

     @Test
    void testAverages(){
        double expectedAverage = 59 / testlist.length;
        assertEquals(expectedAverage, teststream.averageUsingStream(testlist));
    }

}


