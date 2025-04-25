class Solution {
    public boolean findSubarrays(int[] nums) {
        Set<Integer> map = new HashSet<>();

        for(int i = 1; i < nums.length; i++) {
            int num = nums[i-1] + nums[i];

            if(map.contains(num))
                return true;
            else
                map.add(num);
        }

        return false;
    }
}