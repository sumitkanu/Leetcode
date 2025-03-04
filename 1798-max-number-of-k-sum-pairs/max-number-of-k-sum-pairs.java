class Solution {
    public int maxOperations(int[] nums, int k) {
        int numOps = 0;
        Map<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < nums.length; i++) {
            if(map.containsKey(k-nums[i])) {
                if (map.get(k-nums[i]) == 1)
                    map.remove(k-nums[i]);
                else
                    map.put(k-nums[i], map.get(k-nums[i])-1);
                numOps++;
            }else map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }

        return numOps;
    }
}