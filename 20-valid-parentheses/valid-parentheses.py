class Solution:
    def isValid(self, s: str) -> bool:
        stack = []
        if len(s)%2 != 0: 
            return False

        def paramatch(b) -> bool:
            if len(stack) == 0:
                return False
            if b == ')' and stack[len(stack)-1] == '(':
                return True
            if b == '}' and stack[len(stack)-1] == '{':
                return True
            if b == ']' and stack[len(stack)-1] == '[':
                return True
            return False
        
        for b in s:
            if b in ['(', '{', '[']:
                stack.append(b)
            elif paramatch(b):
                stack.pop(len(stack)-1)
            else:
                return False

        return len(stack) == 0