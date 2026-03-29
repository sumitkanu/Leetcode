class Solution:
    def permute(self, nums: List[int]) -> List[List[int]]:
        res = []

        def bt(curr, rem):
            if len(rem) == 0:
                res.append(curr[:])
                return

            for i in range(len(rem)):
                bt(curr + [rem[i]], rem[:i] + rem[i + 1:])

        bt([], nums)
        return res
