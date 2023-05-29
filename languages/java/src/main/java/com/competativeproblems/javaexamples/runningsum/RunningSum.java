package com.competativeproblems.javaexamples.runningsum;

import com.competativeproblems.javaexamples.Solution;

public class RunningSum implements Solution<int[]> {
    @Override
    public int[] solution(int[] nums) {

        int[] runningSum = new int[nums.length];
        runningSum[0] = nums[0];
        for(int i = 1; i< nums.length; i++){
            runningSum[i] = runningSum[i-1] + nums[i];
        }

        return runningSum;
    }
}
