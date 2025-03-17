class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack = new Stack<>();

        for(int i = 0; i < asteroids.length; i++) {
            if(stack.isEmpty() || stack.peek() < 0 || asteroids[i] > 0){
                stack.push(asteroids[i]);
            } else {
                int popped = 2000;
                while(!stack.isEmpty() && stack.peek() > 0) {
                    if(stack.peek() < -asteroids[i]) {
                        popped = stack.pop();
                    } else break;
                }
                
                if(!stack.isEmpty() && stack.peek() == -asteroids[i]) {
                    stack.pop();
                } else if (stack.isEmpty() || (!stack.isEmpty() && stack.peek() < -asteroids[i])) {
                    stack.push(asteroids[i]);
                }
            }
        }

        int[] ans = new int[stack.size()];
        int i = 0;
        for(int element : stack) {
            ans[i] = element;
            i++;
        }

        return ans;
    }
}