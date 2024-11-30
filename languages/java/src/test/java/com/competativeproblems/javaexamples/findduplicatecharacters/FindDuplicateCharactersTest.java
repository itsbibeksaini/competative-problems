package com.competativeproblems.javaexamples.findduplicatecharacters;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.mockito.Mock;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class FindDuplicateCharactersTest {

    @Mock
    FindDuplicateCharacters findDuplicateCharacters;

    @BeforeAll
    void init(){
        findDuplicateCharacters = new FindDuplicateCharacters();
    }

    @Test()
    @DisplayName("Check whether input string is empty")
    void testEmptyString(){
        assertNull(findDuplicateCharacters.solution(""));
    }

    @Test
    @DisplayName("Check whether input string is null")
    void testNullString(){
        assertNull(findDuplicateCharacters.solution(null));
    }

    @Test
    @DisplayName("Scenario 1")
    void test1(){
        List<Character> result = findDuplicateCharacters.solution("Hello World");
        List<Character> expected = Arrays.asList('l', 'o');

        assertNotNull(result);
        assertTrue(result.size() == expected.size() && result.containsAll(expected) && expected.containsAll(result));
    }

    @Test
    @DisplayName("Scenario 2")
    void test2(){
        List<Character> result = findDuplicateCharacters.solution("Java Programming");
        List<Character> expected = Arrays.asList('a','r','m', 'g');

        assertNotNull(result);
        assertTrue(result.size() == expected.size() && result.containsAll(expected) && expected.containsAll(result));
    }

    @Test
    @DisplayName("Scenario 3")
    void test3(){
        List<Character> result = findDuplicateCharacters.solution("123 ABC");
        List<Character> expected = Collections.emptyList();

        assertNotNull(result);
        assertTrue(result.size() == expected.size() && result.containsAll(expected) && expected.containsAll(result));
    }
}