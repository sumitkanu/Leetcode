class Solution {
    public boolean closeStrings(String word1, String word2) {
        int[] word1Freq = new int[26];
        int[] word2Freq = new int[26];

        for (char c : word1.toCharArray()) {
            word1Freq[c - 'a']++;
        }
        for (char c : word2.toCharArray()) {
            word2Freq[c - 'a']++;
        }

        for (int i = 0; i < 26; i++) {
            if ((word1Freq[i] == 0 && word2Freq[i] > 0) ||
                (word2Freq[i] == 0 && word1Freq[i] > 0)) {
                return false;
            }
        }

        Arrays.sort(word1Freq);
        Arrays.sort(word2Freq);

        if(Arrays.equals(word1Freq, word2Freq))
            return true;

        return false;
    }
}