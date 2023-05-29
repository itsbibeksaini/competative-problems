package com.competativeproblems.javaexamples.richestcustomerwealth;

import com.competativeproblems.javaexamples.Solution;

public class RichestCustomerWealth implements Solution<Integer, int[][]> {

    @Override
    public Integer solution(int[][] accounts) {
        int maxWealthCustomer = 0;
        int totalWealth;

        for(int i=0; i<accounts.length; i++){
            totalWealth = 0;
            for(int j=0;j<accounts[i].length; j++){
                totalWealth += accounts[i][j];
            }

            if(totalWealth > maxWealthCustomer)
                maxWealthCustomer = totalWealth;
        }

        return maxWealthCustomer;
    }
}
