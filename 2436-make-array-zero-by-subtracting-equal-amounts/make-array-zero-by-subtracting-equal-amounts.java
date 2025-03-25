class Solution {
    public int minimumOperations(int[] nums) {
        Arrays.sort(nums);
        int i = 0;
        int sub = 0;
        int count = 0;
        while(i < nums.length) {
            while(i < nums.length && nums[i] - sub <= 0) {
                i++;
            }

            if(i < nums.length) {
                sub = nums[i];
                count++;
            }

            
        }

        return count;
    }
}