class Solution {
    public int maxOperations(int[] nums, int k) {
        Arrays.sort(nums);
        int left = 0;
        int right = nums.length - 1;
        int cnt = 0;
        
        while(left < right) {
            int sum = nums[left] + nums[right];
            if(sum == k) {
                left++;
                right--;
                cnt++;
            } else if(sum > k) {
                right--;
            } else left++;
        }

        return cnt;
    }
}