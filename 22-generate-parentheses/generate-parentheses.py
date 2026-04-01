class Solution:
    def generateParenthesis(self, n: int) -> List[str]:
        ans = []

        def bt(curr_string, left_count, right_count):
            if len(curr_string) == 2 * n:
                ans.append("".join(curr_string))
                return
            if left_count < n:
                curr_string.append("(")
                bt(curr_string, left_count + 1, right_count)
                curr_string.pop()
            if right_count < left_count:
                curr_string.append(")")
                bt(curr_string, left_count, right_count + 1)
                curr_string.pop()

        bt([], 0, 0)
        return ans
