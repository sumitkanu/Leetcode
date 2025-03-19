class Solution {
    public String decodeString(String s) {
        Stack<Character> stack = new Stack<>();

        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) != ']') {
                stack.push(s.charAt(i));
            } else {
                List<Character> decString = new ArrayList<>();
                while(stack.peek() != '[') {
                    decString.add(stack.pop());
                }
                stack.pop();
                int base = 1;
                int k = 0;
                // get the number k
                while (!stack.isEmpty() && Character.isDigit(stack.peek())) {
                    k = k + (stack.pop() - '0') * base;
                    base *= 10;
                }
                while (k != 0) {
                    for (int j = decString.size() - 1; j >= 0; j--) {
                        stack.push(decString.get(j));
                    }
                    k--;
                }
            }
        }
        char[] result = new char[stack.size()];
        for (int i = result.length - 1; i >= 0; i--) {
            result[i] = stack.pop();
        }
        return new String(result);
    }
}