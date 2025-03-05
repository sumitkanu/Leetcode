class Solution {
    public int longestOnes(int[] nums, int k) {
        int left = 0;
        int right = 0;
        int cnt0 = 0;

        while(right < nums.length) {
            // System.out.println(left);
            // System.out.println(right);
            // System.out.println(cnt0);
            // System.out.println("-----------");
            if(nums[right] == 1 && cnt0<=k) {
                right++;
            } else {
                if(cnt0 < k) {
                    right++;
                    cnt0++;
                } else {
                    if (nums[left] == 0) cnt0--;
                    if (nums[right] == 0)cnt0++;
                    left++;
                    right++;
                }
            }
        }

        return right-left;
    }
}