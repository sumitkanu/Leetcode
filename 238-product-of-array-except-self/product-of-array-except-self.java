class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] preprod = new int[nums.length];
        int[] postprod = new int[nums.length];

        preprod[0] = 1;
        postprod[nums.length-1] = 1;

        for(int i=1; i < nums.length; i++) {
            preprod[i] = preprod[i-1] * nums[i-1];
            postprod[nums.length - 1 - i] = postprod[nums.length - i] * nums[nums.length - i];
        }

        for(int i=0; i < nums.length; i++) {
            preprod[i] = preprod[i] * postprod[i];
        }


        return preprod;
    }
}