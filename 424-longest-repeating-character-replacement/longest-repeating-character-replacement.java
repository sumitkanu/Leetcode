class Solution {
    public int characterReplacement(String s, int k) {
        int left = 0, right = 0, maxFreq = 0, maxLen = 0;
        int[] freq = new int[26];

        while (right < s.length()) {
            char c = s.charAt(right);
            freq[c - 'A']++;
            maxFreq = Math.max(maxFreq, freq[c - 'A']);

            while ((right - left + 1) - maxFreq > k) {
                freq[s.charAt(left) - 'A']--;
                left++;
            }

            maxLen = Math.max(maxLen, right - left + 1);
            right++;
        }
        return maxLen;
    }
}
