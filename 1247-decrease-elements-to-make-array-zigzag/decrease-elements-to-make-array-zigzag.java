class Solution {
    public int movesToMakeZigzag(int[] nums) {
        if(nums.length == 1) return 0;
        int moves = 0;
        int oddmoves = 0;

        for(int i = 0; i < nums.length; i += 1) {
            if(i == 0 && nums[0] >= nums[1]) {
                if(i%2 == 0) moves += nums[0] - nums[1] + 1;
                else oddmoves += nums[0] - nums[1] + 1;
            } else if(i == nums.length - 1 && nums[i] >= nums[i-1]) {
                if(i%2 == 0) moves += nums[i] - nums[i-1] + 1;
                else oddmoves += nums[i] - nums[i-1] + 1;
            } else if(i>0 && i<nums.length-1){
                int num = Math.min(nums[i+1], nums[i-1]);
                if(nums[i] >= num) {
                    if(i%2 == 0) moves += nums[i] - num + 1;
                    else oddmoves += nums[i] - num + 1;
                }
            }
        }
        return Math.min(oddmoves,moves);
    }
}