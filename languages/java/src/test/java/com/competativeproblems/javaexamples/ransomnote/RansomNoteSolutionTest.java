package com.competativeproblems.javaexamples.ransomnote;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.mockito.Mock;

import java.io.FileNotFoundException;

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
    void testRansomNote() throws FileNotFoundException {
        int result = rms.solution();
        assertEquals(1, result);
    }

}