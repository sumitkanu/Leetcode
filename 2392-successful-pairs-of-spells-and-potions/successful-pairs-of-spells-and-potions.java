class Solution {
    public int[] successfulPairs(int[] spells, int[] potions, long success) {
        Arrays.sort(potions);
        int[] ans = new int[spells.length];

        for(int i=0; i < spells.length; i++) {
            int num = bs(potions, spells[i], success);
            ans[i] = potions.length - num;
        }
        return ans;
    }

    private int bs(int[] potions, long spell, long success) {
        int start = 0;
        int end = potions.length - 1;

        while(start <= end) {
            int mid = (start+end)/2;
            if(spell * potions[mid] >= success) end = mid - 1;
            else start = mid + 1;
        }
        // System.out.println(start);
        return start;
    }
}