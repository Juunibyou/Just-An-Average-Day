package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ForLoopTest {

    ForLoop testloop = new ForLoop();

    int[] testlist = {5, 10, 18, 5, 2, 1, 16};

    @Test
    void testMaximums(){
        assertEquals(18, testloop.maximumUsingForLoop(testlist));
    }

    @Test
    void testMinimums(){
        assertEquals(1, testloop.minimumUsingForLoop(testlist));
    }

     @Test
    void testSums(){
        assertEquals(57, testloop.sumUsingForLoop(testlist));
    }

     @Test
    void testAverages(){
        double expectedAverage = 59 / testlist.length;
        assertEquals(expectedAverage, testloop.averageUsingForLoop(testlist));
    }

}
