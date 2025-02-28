class Solution {
    public int[] productExceptSelf(int[] nums) {
        // int[] preprod = new int[nums.length];
        int[] postprod = new int[nums.length];
        int temp = 1;

        // preprod[0] = 1;
        postprod[nums.length-1] = 1;

        for(int i=1; i < nums.length; i++) {
            postprod[nums.length - 1 - i] = postprod[nums.length - i] * nums[nums.length - i];
        }

        for(int i=0; i < nums.length; i++) {
            postprod[i] = postprod[i] * temp;
            temp *= nums[i];
        }


        return postprod;
    }
}