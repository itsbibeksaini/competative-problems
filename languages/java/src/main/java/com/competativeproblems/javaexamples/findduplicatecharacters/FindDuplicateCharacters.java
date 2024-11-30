package com.competativeproblems.javaexamples.findduplicatecharacters;

import com.competativeproblems.javaexamples.Solution;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * Create a Java function that takes a string as input and returns a list of characters that appear more than once in the string. The function should be case-insensitive and ignore non-alphabetic characters.
 */
public class FindDuplicateCharacters implements Solution<ArrayList<Character>, String> {

    /**
     *
     * @param inputString string containing alphanumeric characters
     * @return array list of characters that appears multiple times in input string
     */
    @Override
    public ArrayList<Character> solution(String inputString) {

        // Check whether input string is null or empty.
        if(inputString == null || inputString.isEmpty()){
            return null;
        }

        inputString = inputString.toLowerCase();

        Map<Character, Integer> characterCount = new HashMap<>();

        for(char c : inputString.toCharArray()){
            // make sure character is alphabet and not any symbol or number.
            if(c >= 'a' && c <= 'z'){
                characterCount.put(c, characterCount.getOrDefault(c, 0) + 1);
            }
        }

        ArrayList<Character> result = new ArrayList<>();

        // collect result of duplicate characters in arraylist.
        for(var entrySet : characterCount.entrySet()){
            if(entrySet.getValue() > 1){
                result.add(entrySet.getKey());
            }
        }

        return result;
    }
}
