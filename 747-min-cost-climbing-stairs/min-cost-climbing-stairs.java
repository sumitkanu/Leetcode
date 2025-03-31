class Solution {
    Map<Integer, Integer> memo = new HashMap<>();
    public int minCostClimbingStairs(int[] cost) {
        return dp(cost.length, cost);
    }
    
    private int dp(int i, int[] cost) {
        if(i <= 1) return 0;
        
        if(!memo.containsKey(i)) {
            memo.put(i, Math.min(dp(i - 2, cost) + cost[i - 2], dp(i - 1, cost) + cost[i - 1]));
        }
        
        return memo.get(i);
    }
}