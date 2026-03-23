class Solution:
    def evalRPN(self, tokens: List[str]) -> int:
        stack = []
        for token in tokens:
            if token not in {'+', '-', '*', '/'}:
                stack.append(int(token))
            else:
                n1 = stack.pop() - int('0')
                n2 = stack.pop() - int('0')
                match token:
                    case '+':
                        stack.append(n1 + n2)
                    case '-':
                        stack.append(n2 - n1)
                    case '*':
                        stack.append(n2 * n1)
                    case '/':
                        stack.append(int(n2 / n1))
        
        return stack.pop()
