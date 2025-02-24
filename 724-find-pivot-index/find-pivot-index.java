class Solution {
    public int pivotIndex(int[] nums) {
        int[] sumleft = new int[nums.length];
        int[] sumright = new int[nums.length];

        for(int i = 1; i<nums.length; i++) {
            sumleft[i] =  sumleft[i-1] + nums[i-1];
            sumright[nums.length - i - 1] = sumright[nums.length - i] + nums[nums.length - i];
        }

        for(int i =0; i<nums.length;i++){
            if(sumleft[i] == sumright[i]) return i;
        }

        return -1;
    }
}