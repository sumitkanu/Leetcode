class Solution {
    public int characterReplacement(String s, int k) {
        int left = 0;
        int right = 0;
        int[] freq = new int[26];
        int maxFreq = 0;
        int max = 1;

        while(right < s.length()) {
            freq[s.charAt(right) - 'A'] += 1;
            maxFreq = Math.max(maxFreq, freq[s.charAt(right) - 'A']);

            Boolean isValid = (right + 1 - left - maxFreq <= k);
            if(!isValid) {
                int out = s.charAt(left) - 'A';
                freq[out] -= 1;
                left++;
            }
            
            max = right + 1 - left;
            right++;
        }

        return max;
    }
}