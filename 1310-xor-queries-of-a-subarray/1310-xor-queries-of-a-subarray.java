class Solution {

    public int[] xorQueries(int[] arr, int[][] queries) {
        int n = arr.length;
        int[] prefixXOR = new int[n + 1];

        // Build prefix XOR array
        for (int i = 0; i < n; i++) {
            prefixXOR[i + 1] = prefixXOR[i] ^ arr[i];
        }

        int[] result = new int[queries.length];
        // Process each query using prefix XOR
        for (int i = 0; i < queries.length; i++) {
            result[i] = prefixXOR[queries[i][1] + 1] ^ prefixXOR[queries[i][0]];
        }
        return result;
    }
}