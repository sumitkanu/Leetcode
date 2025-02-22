class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double sum = 0;
        int start = 0;
        int end = 0;

        while(end < k) {
            sum += nums[end];
            end++;
        }
        double max = sum/k;

        while(end < nums.length) {
            sum -= nums[start];
            sum += nums[end];
            start++;
            end++;
            max = max > (sum/k) ? max : sum/k;
        }

        return max;
    }
}