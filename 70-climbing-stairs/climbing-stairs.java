class Solution {
    private HashMap<Integer, Integer> memo = new HashMap<>();
    public int climbStairs(int n) {
        if(n == 1) return 1;
        if(n == 2) return 2;
        if(!memo.containsKey(n)) {
            memo.put(n, climbStairs(n-1) + climbStairs(n-2));
        }
        return memo.get(n);
    }
}