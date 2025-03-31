class Solution {
    public int rob(int[] nums) {
        if (nums.length==1) return nums[0];
        int[] stolen = new int[nums.length];
        stolen[0] = nums[0];
        stolen[1] = Math.max(nums[0],nums[1]);

        for(int i = 2; i < nums.length; i++) {
            stolen[i] = Math.max(stolen[i-1], stolen[i-2] + nums[i]);
        }

        return stolen[nums.length-1];
    }
}