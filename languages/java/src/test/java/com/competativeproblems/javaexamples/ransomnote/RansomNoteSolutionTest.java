package com.competativeproblems.javaexamples.ransomnote;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.mockito.Mock;

import static org.junit.jupiter.api.Assertions.assertEquals;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class RansomNoteSolutionTest {

    @Mock
    RansomNoteSolution rms;

    @BeforeAll
    void init(){
        rms = new RansomNoteSolution();
    }

    @Test
    void testRansomNote() {
        rms.solution(null);
//        assertEquals(1, result);
    }

}