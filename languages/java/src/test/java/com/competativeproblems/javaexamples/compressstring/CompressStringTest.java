package com.competativeproblems.javaexamples.compressstring;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.mockito.Mock;

import static org.junit.jupiter.api.Assertions.*;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class CompressStringTest {

    @Mock
    CompressString compressString;

    @BeforeAll
    void init(){
        compressString = new CompressString();
    }

    @Test()
    @DisplayName("Check whether input string is empty")
    void testEmptyString(){
        assertNull(compressString.solution(""));
    }

    @Test
    @DisplayName("Check whether input string is null")
    void testNullString(){
        assertNull(compressString.solution(null));
    }

    @Test
    void test1(){
        String result = compressString.solution("aaaabbbcc");

        assertNotNull(result);
        assertEquals("a4b3c2", result);
    }

    @Test
    void test2(){
        String result = compressString.solution("abcdef");

        assertNotNull(result);
        assertEquals("abcdef", result);
    }

    @Test
    void test3(){
        String result = compressString.solution("aaaaaaaabbbbbbbbbbccccccc");

        assertNotNull(result);
        assertEquals("a8b10c7", result);
    }

}