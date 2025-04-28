class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        int max = 0;
        int dir;

        for(int i=0; i<nums.length; i++) {
            set.add(nums[i]);
        }

        for(int num:set) {
            if (!set.contains(num - 1)) {
                int currentNum = num;
                int currentStreak = 1;

                while (set.contains(currentNum + 1)) {
                    currentNum += 1;
                    currentStreak += 1;
                }

                max = Math.max(max, currentStreak);
            }
        }

        return max;
    }
}