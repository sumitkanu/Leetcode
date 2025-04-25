class Solution {
    public int splitNum(int num) {
        char[] chars = String.valueOf(num).toCharArray();
        Arrays.sort(chars);
        int num1 = 0, num2 = 0;

        for(int i = 0, j = 1; i < chars.length; i+=2, j+=2) {
            num1 = num1 * 10 + (chars[i] - '0');
            if (j < chars.length)
                num2 = num2 * 10 + (chars[j] - '0');
        }

        return num1 + num2;
    }
}