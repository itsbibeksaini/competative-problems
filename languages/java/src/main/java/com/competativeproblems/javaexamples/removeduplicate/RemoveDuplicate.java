package com.competativeproblems.javaexamples.removeduplicate;

import com.competativeproblems.javaexamples.Solution;

import java.util.HashSet;
import java.util.Set;

/**
 * Create a Java function that takes an array of integers as input and returns a new array with all duplicates removed.
 */
public class RemoveDuplicate implements Solution<int[], int[]> {

    /**
     *
     * @param nums array of integers.
     * @return array of integers with duplicates removed.
     */
    @Override
    public int[] solution(int[] nums) {

        // Check whether input array is null or empty.
        if(nums == null || nums.length == 0){
            return new int[0];
        }

        Set<Integer> duplicateRemoved = new HashSet<>();

        // Add all elements to set to remove duplicates.
        for (int num : nums) {
            duplicateRemoved.add(num);
        }

        // Convert set to array and return.
        int[] result = new int[duplicateRemoved.size()];
        int index = 0;

        for (int num : duplicateRemoved) {
            result[index++] = num;
        }

        return result;

    }
}
