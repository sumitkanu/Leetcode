class Solution {
    public boolean canPartition(int[] nums) {
        int sum = 0;
        for(int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }

        if(sum % 2 != 0) return false;
        
        return subsetSum(nums, sum/2);
    }

    private boolean subsetSum(int[] nums, int w) {
        Boolean[][] t = new Boolean[nums.length+1][w+1];

        for(int j = 0; j <= w; j++)
            t[0][j] = false;

        for(int i = 0; i <= nums.length; i++)
            t[i][0] = true;

        for(int i = 1; i <= nums.length; i++)
            for(int j = 1; j <= w; j++) {
                if(nums[i-1] <= j) {
                    t[i][j] = t[i-1][j-nums[i-1]] || t[i-1][j];
                }
                else{
                    t[i][j] = t[i-1][j];
                }
            }
        
        return t[nums.length][w];
    }
}