class Solution {

    public String shortestCommonSupersequence(String str1, String str2) {
        int str1Length = str1.length();
        int str2Length = str2.length();

        // Initialize the first row (when str1 is empty, the supersequence is str2's prefix)
        String[] prevRow = new String[str2Length + 1];
        for (int col = 0; col <= str2Length; col++) {
            prevRow[col] = str2.substring(0, col);
        }

        // Fill the DP table row by row
        for (int row = 1; row <= str1Length; row++) {
            // Initialize the first column (when str2 is empty, the supersequence is str1's prefix)
            String[] currRow = new String[str2Length + 1];
            currRow[0] = str1.substring(0, row);

            for (int col = 1; col <= str2Length; col++) {
                // If characters match, extend the supersequence from the diagonal value
                if (str1.charAt(row - 1) == str2.charAt(col - 1)) {
                    currRow[col] = prevRow[col - 1] + str1.charAt(row - 1);
                } else {
                    // If characters do not match, choose the shorter supersequence
                    // From previous row (exclude current str1 char)
                    String pickS1 = prevRow[col];
                    // From previous column (exclude current str2 char)
                    String pickS2 = currRow[col - 1];

                    currRow[col] = (pickS1.length() < pickS2.length())
                        ? pickS1 + str1.charAt(row - 1)
                        : pickS2 + str2.charAt(col - 1);
                }
            }
            // Move to the next row (update previous row reference)
            prevRow = currRow;
        }

        // Return the shortest common supersequence from the last cell
        return prevRow[str2Length];
    }
}