class Solution {
    public int compress(char[] chars) {
        char curr = chars[0];
        int right = 0;
        int left = 0;
        int count = 0;
        while(right < chars.length) {
            if(chars[right] == curr) {
                right++;
                count++;
            } 
            else {
                chars[left] = curr;
                left++;
                if (count > 1) {
                    for (char c : Integer.toString(count).toCharArray()) {
                        chars[left] = c;
                        left++;
                    }
                }
                curr = chars[right];
                count = 0;
            }
        }

        chars[left] = curr;
        left++;
        if (count > 1) {
            for (char c : Integer.toString(count).toCharArray()) {
                chars[left] = c;
                left++;
            }
        }

        return left;
    }
}