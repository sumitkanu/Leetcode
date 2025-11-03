import java.util.ArrayDeque;
import java.util.Deque;

class Solution {
    public boolean isValid(String s) {
        int n = s.length();
        if ((n & 1) == 1) return false; // odd length can't be balanced

        Deque<Character> stack = new ArrayDeque<>(n);
        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);
            switch (c) {
                case '(': case '{': case '[':
                    stack.push(c);
                    break;
                case ')':
                    if (stack.isEmpty() || stack.pop() != '(') return false;
                    break;
                case '}':
                    if (stack.isEmpty() || stack.pop() != '{') return false;
                    break;
                case ']':
                    if (stack.isEmpty() || stack.pop() != '[') return false;
                    break;
                default:
                    // If inputs are guaranteed to be only (){}[], you can omit this.
                    return false;
            }
        }
        return stack.isEmpty();
    }
}
