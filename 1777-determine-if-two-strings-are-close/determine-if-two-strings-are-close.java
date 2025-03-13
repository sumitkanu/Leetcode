class Solution {
    public boolean closeStrings(String word1, String word2) {
        char[] charArr1 = word1.toCharArray();
        char[] charArr2 = word2.toCharArray();

        Arrays.sort(charArr1);
        Arrays.sort(charArr2);
        
        if(Arrays.equals(charArr1, charArr2))
            return true;
        
        if(charArr1.length != charArr2.length)
            return false;

        int[] word1Freq = new int[26];
        int[] word2Freq = new int[26];

        for(int i = 0; i < charArr1.length; i++) {
            word1Freq[charArr1[i] - 'a'] += 1;
            word2Freq[charArr2[i] - 'a'] += 1;
        }

        for(int i = 0; i < word1Freq.length; i++) {
            if(word1Freq[i] == 0 && word2Freq[i] != 0)
                return false;
        }

        Arrays.sort(word1Freq);
        Arrays.sort(word2Freq);

        if(Arrays.equals(word1Freq, word2Freq))
            return true;

        return false;
    }
}