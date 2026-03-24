class Solution:
    def asteroidCollision(self, asteroids: List[int]) -> List[int]:
        stack = []
        for ast in asteroids:
            if len(stack) == 0:
                stack.append(ast)
                continue

            if stack[-1] > 0 and ast < 0:
                while len(stack) > 0 and stack[-1] > 0 and stack[-1] < abs(ast):
                    stack.pop()
                if len(stack) > 0 and stack[-1] == abs(ast):
                    stack.pop()
                elif len(stack) == 0 or stack[-1] < 0:
                    stack.append(ast)
            else:
                stack.append(ast)

        return stack