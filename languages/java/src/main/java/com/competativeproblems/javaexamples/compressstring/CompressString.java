package com.competativeproblems.javaexamples.compressstring;

import com.competativeproblems.javaexamples.Solution;

/**
 * Create a Java function that takes a string as input and returns the compressed version of the string. The compression should be done by replacing consecutive repeated characters with the character and the count of repetitions.
 */
public class CompressString implements Solution<String, String> {

    /**
     *
     * @param inputString uncompressed string.
     * @return compressed string.
     */
    @Override
    public String solution(String inputString) {

        // Check whether input string is null or empty.
        if(inputString == null || inputString.isEmpty()){
            return null;
        }

        StringBuilder stringBuilder = new StringBuilder();
        int characterCounter = 1;

        for (int i = 1; i < inputString.length(); i++) {

            // verify if current character and previous character is same, if so increment counter
            if(inputString.charAt(i) == inputString.charAt(i - 1))
                characterCounter++;
            else{

                // else append character and counter to string builder and reset counter for counting next character occurrences.
                stringBuilder.append(inputString.charAt(i - 1));

                // do not add if counter is at 1 which means character has only 1 occurrence
                if(characterCounter > 1)
                    stringBuilder.append(characterCounter);

                characterCounter =  1;
            }
        }

        stringBuilder.append(inputString.charAt(inputString.length() - 1));

        // do not add if counter is at 1 which means character has only 1 occurrence
        if(characterCounter > 1)
            stringBuilder.append(characterCounter);

        return stringBuilder.toString();
    }
}
