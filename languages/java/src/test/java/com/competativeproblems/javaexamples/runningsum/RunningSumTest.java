package com.competativeproblems.javaexamples.runningsum;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.*;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class RunningSumTest {

    RunningSum runningSum;

    @BeforeAll
    void init(){
        runningSum = new RunningSum();
    }

    @Test
    void runningSumTest1(){
        var result = runningSum.solution(new int[]{1, 2, 3, 4});

        assertThat("Result must not be null or empty.", result != null && result.length != 0);
        assertArrayEquals(result, new int[]{1,3,6,10});
    }

    @Test
    void runningSumTest2(){
        var result = runningSum.solution(new int[]{1, 1, 1, 1, 1});

        assertThat("Result must not be null or empty.", result != null && result.length != 0);
        assertArrayEquals(result, new int[]{1,2,3,4,5});
    }

    @Test
    void runningSumTest3(){
        var result = runningSum.solution(new int[]{3,1,2,10,1});

        assertThat("Result must not be null or empty.", result != null && result.length != 0);
        assertArrayEquals(result, new int[]{3,4,6,16,17});
    }

}