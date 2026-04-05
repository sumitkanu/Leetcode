class Solution:
    def generateParenthesis(self, n: int) -> List[str]:
        ans = []

        def bt(string, left, right):
            if len(string) == 2 * n:
                ans.append(string)
                return

            if left < n:
                bt(string + '(', left + 1, right)
            if right < left:
                bt(string + ')', left, right + 1)

        bt("", 0, 0)
        return ans
