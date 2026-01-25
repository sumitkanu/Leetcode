class Solution:
    def calPoints(self, operations: List[str]) -> int:
        stack = []
        ans = 0

        for s in operations:
            match s:
                case '+':
                    stack.append(stack[-1] + stack[-2])
                case 'D':
                    stack.append(stack[-1]*2)
                case 'C':
                    stack.pop()
                case _:
                    stack.append(int(s))
        
        for num in stack:
            ans += num
        
        return ans

