class Solution {
    public String removeStars(String s) {
        Stack<Character> stack = new Stack<>();
        StringBuilder str = new StringBuilder();

        for(int i=0; i < s.length(); i++) {
            if(s.charAt(i) != '*') stack.push(s.charAt(i));
            else {
                stack.pop();
            }
        }

        for(Character c : stack) str.append(c);

        return str.toString();
    }
}