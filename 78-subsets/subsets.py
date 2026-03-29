class Solution:
    def subsets(self, nums: List[int]) -> List[List[int]]:
        res = []
        curr = []

        def bt(idx):
            res.append(curr[:])

            if idx == len(nums):
                return

            for i in range(idx, len(nums)):
                curr.append(nums[i])
                bt(i + 1)
                curr.pop()

        bt(0)
        return res