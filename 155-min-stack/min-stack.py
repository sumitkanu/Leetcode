class MinStack:

    def __init__(self):
        self.stack = []
        self.min = 2**31 - 1

    def push(self, val: int) -> None:
        self.stack.append({"val": val, "min": self.min})
        self.min = val if val < self.min else self.min

    def pop(self) -> None:
        val = self.stack.pop()
        self.min = val["min"]

    def top(self) -> int:
        return self.stack[-1]["val"]

    def getMin(self) -> int:
        return self.min
        


# Your MinStack object will be instantiated and called as such:
# obj = MinStack()
# obj.push(val)
# obj.pop()
# param_3 = obj.top()
# param_4 = obj.getMin()