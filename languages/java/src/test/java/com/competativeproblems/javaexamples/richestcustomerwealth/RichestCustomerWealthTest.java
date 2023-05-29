package com.competativeproblems.javaexamples.richestcustomerwealth;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.*;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class RichestCustomerWealthTest {

    RichestCustomerWealth richestCustomerWealth;

    @BeforeAll
    void init(){
        richestCustomerWealth = new RichestCustomerWealth();
    }

    @Test
    void richestCustomerWealthTest1(){
        var result = richestCustomerWealth.solution(new int[][]{{1,2,3},{3,2,1}});

        assertThat("Result should be non zero", result != 0);
        assertEquals(6, result);
    }

    @Test
    void richestCustomerWealthTest2(){
        var result = richestCustomerWealth.solution(new int[][]{{1,5},{7,3},{3,5}});

        assertThat("Result should be non zero", result != 0);
        assertEquals(10, result);
    }

    @Test
    void richestCustomerWealthTest3(){
        var result = richestCustomerWealth.solution(new int[][]{{2,8,7},{7,1,3},{1,9,5}});

        assertThat("Result should be non zero", result != 0);
        assertEquals(17, result);
    }

}