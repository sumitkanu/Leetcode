class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int[] freq = new int[26];

        if(s1.length() > s2.length()) return false;

        for(int i=0; i<s1.length(); i++) {
            freq[s1.charAt(i) - 'a'] += 1;
        }

        int left = 0;
        int right = 0;
        
        while(right < s1.length()){
            freq[s2.charAt(right) - 'a'] -= 1;
            right++;
        }

        while(right < s2.length()) {
            if(checkMatch(freq)) return true;
            freq[s2.charAt(right) - 'a'] -= 1;
            freq[s2.charAt(left) - 'a'] += 1;
            left++;
            right++;
        }

        if(checkMatch(freq)) return true;
        return false;
    }

    private boolean checkMatch(int[] freq) {
        for(int num : freq) {
            if (num != 0) return false;
        }

        return true;
    }
}