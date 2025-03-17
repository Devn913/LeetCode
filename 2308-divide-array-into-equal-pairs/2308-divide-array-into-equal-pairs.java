// class Solution {
// Approach 1: Using Sorting
// Time: O(n*log(n)), Space: O(1)
//     public boolean divideArray(int[] arr) {
//       Arrays.sort(arr);
//       for(int i = 0;i<arr.length;i+=2){
//         if(arr[i]!=arr[i+1]) return false;
//       }  
//       return true;
//     }
// }

// class Solution {
//     public boolean divideArray(int[] arr) {
//     // Approach 2: using Frequency array.
//     // Time: O(n), Space: O(n)
//         int max = 0;
//         for(int num: arr){
//             max = Math.max(max,num);
//         }
//         int[] freq = new int[max+1];
//         for(int num: arr){
//             freq[num]++;
//         }
//         for(int i = 0;i<=max;i++){
//             if(freq[i]%2!=0) return false;
//         }
//         return true;
//     }
// }

// class Solution {
//     public boolean divideArray(int[] arr) {
//     // Approach 3: using Frequency array.
//     // Time: O(n), Space: O(1)
//         int[] freq = new int[501];
//         for(int num: arr){
//             freq[num]++;
//         }
//         for(int i = 0;i<=500;i++){
//             if(freq[i]%2!=0) return false;
//         }
//         return true;
//     }
// }


class Solution {
    public boolean divideArray(int[] arr) {
    // Approach 4: using boolean Frequency array.
    // Time: O(n), Space: O(1)
        boolean[] freq = new boolean[501];
        for(int num: arr){
            freq[num] = !freq[num];
        }
        for(int i = 0;i<=500;i++){
            if(freq[i]) return false;
        }
        return true;
    }
}