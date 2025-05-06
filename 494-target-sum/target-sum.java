class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        int totalSum = 0;
        for (int num : nums)
            totalSum += num;

        if (totalSum < Math.abs(target) || (target + totalSum) % 2 != 0)
            return 0;

        int sum = (target + totalSum) / 2;

        int[][] dp = new int[nums.length+1][sum +1];
        dp[0][0] = 1;

        for(int i=1; i<=nums.length; i++)
            for(int j=0; j<=sum; j++){
                if(nums[i-1] <= j)
                    dp[i][j] = dp[i-1][j-nums[i-1]] + dp[i-1][j];
                else
                    dp[i][j] = dp[i-1][j];
            }

        return dp[nums.length][sum];
    }
}