class Solution {

    private static final int MOD = 1_000_000_007;

    public int maximumScore(List<Integer> nums, int k) {
        int n = nums.size();
        int[] primeScores = new int[n];

        // Find the maximum element in nums to determine the range for prime generation
        int maxElement = Collections.max(nums);

        // Get all prime numbers up to maxElement using the Sieve of Eratosthenes
        List<Integer> primes = getPrimes(maxElement);

        // Calculate the prime score for each number in nums
        for (int index = 0; index < n; index++) {
            int num = nums.get(index);

            // Iterate over the generated primes to count unique prime factors
            for (int prime : primes) {
                if (prime * prime > num) break; // Stop early if prime^2 exceeds num
                if (num % prime != 0) continue; // Skip if the prime is not a factor

                primeScores[index]++; // Increment prime score for the factor
                while (num % prime == 0) num /= prime; // Remove all occurrences of this factor
            }

            // If num is still greater than 1, it is a prime number itself
            if (num > 1) primeScores[index]++;
        }

        // Initialize next and previous dominant index arrays
        int[] nextDominant = new int[n];
        int[] prevDominant = new int[n];
        Arrays.fill(nextDominant, n);
        Arrays.fill(prevDominant, -1);

        // Stack to store indices for a monotonic decreasing prime score
        Stack<Integer> decreasingPrimeScoreStack = new Stack<>();

        // Calculate the next and previous dominant indices for each number
        for (int index = 0; index < n; index++) {
            while (
                !decreasingPrimeScoreStack.isEmpty() &&
                primeScores[decreasingPrimeScoreStack.peek()] <
                primeScores[index]
            ) {
                int topIndex = decreasingPrimeScoreStack.pop();
                nextDominant[topIndex] = index;
            }

            if (!decreasingPrimeScoreStack.isEmpty()) {
                prevDominant[index] = decreasingPrimeScoreStack.peek();
            }

            decreasingPrimeScoreStack.push(index);
        }

        // Calculate the number of subarrays in which each element is dominant
        long[] numOfSubarrays = new long[n];
        for (int index = 0; index < n; index++) {
            numOfSubarrays[index] =
                (long) (nextDominant[index] - index) *
                (index - prevDominant[index]);
        }

        // Sort elements in decreasing order based on their values
        List<int[]> sortedArray = new ArrayList<>();
        for (int index = 0; index < n; index++) {
            sortedArray.add(new int[] { nums.get(index), index });
        }
        sortedArray.sort((a, b) -> Integer.compare(b[0], a[0])); // Sort in descending order

        long score = 1;
        int processingIndex = 0;

        // Process elements while there are operations left
        while (k > 0) {
            int[] element = sortedArray.get(processingIndex++);
            int num = element[0];
            int index = element[1];

            // Calculate the number of operations to apply on the current element
            long operations = Math.min(k, numOfSubarrays[index]);

            // Update the score by raising the element to the power of operations
            score = (score * power(num, operations)) % MOD;

            // Reduce the remaining operations count
            k -= operations;
        }

        return (int) score;
    }

    // Helper function to compute the power of a number modulo MOD
    private long power(long base, long exponent) {
        long res = 1;

        while (exponent > 0) {
            if (exponent % 2 == 1) {
                res = (res * base) % MOD;
            }
            base = (base * base) % MOD;
            exponent /= 2;
        }

        return res;
    }

    // Function to generate prime numbers up to a given limit using the Sieve of Eratosthenes
    private List<Integer> getPrimes(int limit) {
        boolean[] isPrime = new boolean[limit + 1];
        Arrays.fill(isPrime, true);
        List<Integer> primes = new ArrayList<>();

        for (int number = 2; number <= limit; number++) {
            if (!isPrime[number]) continue;

            primes.add(number);

            for (
                long multiple = (long) number * number;
                multiple <= limit;
                multiple += number
            ) {
                isPrime[(int) multiple] = false;
            }
        }

        return primes;
    }
}