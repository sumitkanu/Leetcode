class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max = 0;
        List<Boolean> ans = new ArrayList<>();
        for(int i=0; i<candies.length; i++) {
            max = Math.max(max, candies[i]);
        }
        for(int i=0; i<candies.length; i++) {
            ans.add((candies[i] + extraCandies) >= max);
        }

        return ans;
    }
}