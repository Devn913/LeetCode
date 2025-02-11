class Solution {

    public String removeOccurrences(String s, String part) {
        // Precompute KMP longest prefix-suffix array for the pattern
        int[] kmpLPS = computeLongestPrefixSuffix(part);

        // Using stack to track characters and support pattern matching
        Stack<Character> charStack = new Stack<>();

        // Array to store pattern matching indices during traversal
        int[] patternIndexes = new int[s.length() + 1];

        for (
            int strIndex = 0, patternIndex = 0;
            strIndex < s.length();
            strIndex++
        ) {
            char currentChar = s.charAt(strIndex);
            charStack.push(currentChar);

            if (currentChar == part.charAt(patternIndex)) {
                // Track the next pattern index when characters match
                patternIndexes[charStack.size()] = ++patternIndex;

                if (patternIndex == part.length()) {
                    // Remove entire matched pattern from stack
                    int remainingLength = part.length();
                    while (remainingLength != 0) {
                        charStack.pop();
                        remainingLength--;
                    }

                    // Restore pattern index for next potential match
                    patternIndex = charStack.isEmpty()
                        ? 0
                        : patternIndexes[charStack.size()];
                }
            } else {
                if (patternIndex != 0) {
                    // Backtrack pattern matching using KMP LPS
                    strIndex--;
                    patternIndex = kmpLPS[patternIndex - 1];
                    charStack.pop();
                } else {
                    // Reset pattern index tracking when no match is possible
                    patternIndexes[charStack.size()] = 0;
                }
            }
        }

        // Convert remaining stack characters to result string
        StringBuilder result = new StringBuilder();
        while (!charStack.isEmpty()) {
            result.append(charStack.pop());
        }

        return result.reverse().toString();
    }

    private int[] computeLongestPrefixSuffix(String pattern) {
        // Array to store the longest proper prefix which is also a suffix
        int[] lps = new int[pattern.length()];

        // Initialize tracking variables for prefix and current position
        for (int current = 1, prefixLength = 0; current < pattern.length();) {
            // If characters match, extend the prefix length
            if (pattern.charAt(current) == pattern.charAt(prefixLength)) {
                // Store the length of matching prefix
                lps[current] = ++prefixLength;
                current++;
            }
            // If characters don't match and we're not at the start of the pattern
            else if (prefixLength != 0) {
                // Backtrack to the previous longest prefix-suffix
                prefixLength = lps[prefixLength - 1];
            }
            // If no match and no prefix to backtrack
            else {
                // No prefix-suffix match found
                lps[current] = 0;
                current++;
            }
        }

        // Return the computed longest prefix-suffix array
        return lps;
    }
}