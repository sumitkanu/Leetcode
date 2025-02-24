class Solution {
    public String reverseVowels(String s) {
        int left = 0;
        int right = s.length() - 1;
        char[] chars = s.toCharArray();

        while(left < right) {
            if(!isVowel(s.charAt(right))) {
                right--;
            } else if(!isVowel(s.charAt(left))) {
                left++;
            } else {
                char temp = chars[left];
                chars[left] = chars[right];
                chars[right] = temp;
                left++;
                right--;
            }
        }

        return String.valueOf(chars);
    }

    private boolean isVowel(char c) {
        c = Character.toLowerCase(c);

        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'; 
    }
}