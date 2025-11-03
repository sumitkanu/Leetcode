class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for(int i = 0; i<=s.length()-1; i++){
            if(s.charAt(i) == '(' || s.charAt(i) == '{' ||s.charAt(i) == '['){
                stack.push(s.charAt(i));
            } else if(s.charAt(i) == ')') {
                if(stack.empty() || stack.pop() != '('){
                    return false;
                }
            } else if(s.charAt(i) == '}') {
                if(stack.empty() || stack.pop() != '{'){
                    return false;
                }
            } else if(s.charAt(i) == ']') {
                if(stack.empty() || stack.pop() != '['){
                    return false;
                }
            }
        }
        if(stack.empty()) return true;
        return false;
    }
}