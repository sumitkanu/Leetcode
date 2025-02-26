class Solution {
    public int maxVowels(String s, int k) {
        int start = 0;
        int end = 0;
        int count = 0;
        int max = 0;

        while(end < k) {
            count = checkVowel(s.charAt(end)) ? count + 1 : count;
            end++;
        }

        max = count;

        while(end < s.length()) {
            count = checkVowel(s.charAt(end)) ? count + 1 : count;
            count = checkVowel(s.charAt(start)) ? count - 1 : count;
            start++;
            end++;
            max = max > count ? max : count;
        }

        return max;
    }

    private boolean checkVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
}