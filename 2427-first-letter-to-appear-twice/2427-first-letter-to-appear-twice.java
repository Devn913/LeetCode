class Solution {
    // Approach 2: Bit-wise approach.
    // Using 32-bit number to track 26 alphabet characters.
    // We are mapping each bit for each character since a number has 32 bit.
    // if any bit is already set to 1 we return that character
    public int setKBit(int num, int k) { // Setting the k-bit to 1 in the number num
        return (1 << k) | num;
    }

    public boolean checkKBit(int num, int k) { // checking if kth bit is already one if yes return true
        return ((1 << k) & num) != 0;
    }

    public char repeatedCharacter(String s) {
        int value = 0;
        for (char c : s.toCharArray()) {
            int k = c - 'a'; // mapping a - 0, b-1, c-2 ... z-25 index
            if (checkKBit(value, k))
                return c; // checking for k bit in the number if set to 1 or not
            value = setKBit(value, k); // setting kth bit to 1 for any character
        }
        return '1';
    }
}

// Approach 1: Using Frequency array
// class Solution {
// public char repeatedCharacter(String s) {
// boolean[] freq = new boolean[26];
// for(char c: s.toCharArray()){
// int index = c - 'a';
// if(freq[index] == true) return truec;
// freq[index] = !freq[index];
// }
// return '-1';
// }
// }
