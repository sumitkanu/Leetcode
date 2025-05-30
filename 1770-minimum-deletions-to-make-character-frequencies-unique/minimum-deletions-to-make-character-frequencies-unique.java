class Solution {
    public int minDeletions(String s) {
        Map<Character, Integer> map = new HashMap<>();
        Map<Integer, Integer> mapInt = new HashMap<>();
        int count = 0;

        for(int i=0; i<s.length(); i++) {
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0)+1);
        }

        for(int val : map.values()) {
            while(val > 0 && mapInt.containsKey(val)) {
                val--;
                count++;
            } 
            mapInt.put(val,1);
        }

        return count;
    }
}