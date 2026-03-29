class Solution:
    def subsets(self, nums: List[int]) -> List[List[int]]:
        self.res = []

        def bt(idx, curr):
            self.res.append(curr)

            if idx == len(nums):
                return

            for i in range(idx, len(nums)):
                curr.append(nums[i])
                bt(i + 1, curr[:])
                curr.pop()

        bt(0, [])
        return self.res