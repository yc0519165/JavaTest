package CodingTest1;

public class Question2 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, -2, 5};
        int n = arr.length;

        System.out.println("Maximum Subarray Sum: " + maxSubarraySum(arr, n));
    }

    public static int maxSubarraySum(int[] arr, int n) {
        int maxSum = Integer.MIN_VALUE;
        int currentSum = 0;

        for (int i = 0; i < n; i++) {
            currentSum += arr[i];
            if (currentSum > maxSum) {
                maxSum = currentSum;
            }
            if (currentSum < 0) {
                currentSum = 0;
            }
        }

        return maxSum;
    }

}
