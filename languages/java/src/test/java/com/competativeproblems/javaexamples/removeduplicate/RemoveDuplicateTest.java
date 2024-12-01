package com.competativeproblems.javaexamples.removeduplicate;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.mockito.Mock;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class RemoveDuplicateTest {

    @Mock
    RemoveDuplicate removeDuplicate;

    @BeforeAll
    void init(){
        removeDuplicate = new RemoveDuplicate();
    }

    @Test()
    void testEmptyArray(){
        int[] result = removeDuplicate.solution(new int[]{});

        assertNotNull(result);
        assertArrayEquals(new int[]{}, result);
    }

    @Test
    void testNullArray(){
        int[] result = removeDuplicate.solution(null);

        assertNotNull(result);
        assertArrayEquals(new int[]{}, result);
    }

    @Test
    void test1(){
        int[] result = removeDuplicate.solution(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10});

        assertNotNull(result);
        Assertions.assertThat(result).containsExactlyInAnyOrder(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
    }

    @Test
    void test2(){
        int[] result = removeDuplicate.solution(new int[]{1, 1, 1, 1, 1, 1, 1, 1, 1, 1});

        assertNotNull(result);
        assertArrayEquals(new int[]{1}, result);
    }

    @Test
    void test3(){
        int[] result = removeDuplicate.solution(new int[]{1, 2, 2, 3, 4, 4, 5});

        assertNotNull(result);
        Assertions.assertThat(result).containsExactlyInAnyOrder(1, 2, 3, 4, 5);
    }

    @Test
    void test4(){
        int[] result = removeDuplicate.solution(new int[]{10, 20, 30, 40, 50});

        assertNotNull(result);
        Assertions.assertThat(result).containsExactlyInAnyOrder(10, 20, 30, 40, 50);
    }

}