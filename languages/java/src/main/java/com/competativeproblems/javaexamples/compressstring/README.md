# Compress string

Create a Java function that takes a string as input and returns the compressed version of the string. The compression should be done by replacing consecutive repeated characters with the character and the count of repetitions.

## Function Signature:
public String compressString(String inputString)

## Example Use Cases:

| Input | Output                    |
| :- |:--------------------------|
| "aaaabbbcc" | "a4b3c2"                  |
| "abcdef" | "abcdef" (no compression) |
| "aaaaaaaabbbbbbbbbbccccccc" | "a8b10c7" |

## Constraints:
* The input string can contain any characters (letters, numbers, special characters).
* The output string should be the compressed version of the input string.
* If the input string is already compressed (i.e., there are no consecutive repeated characters), the output string should be the same as the input string.

## Grading Criteria:
* Correctness: Does the function produce the correct output for the given input?
* Efficiency: Does the function use efficient algorithms and data structures?
* Code Quality: Is the code readable, maintainable, and well-organized?