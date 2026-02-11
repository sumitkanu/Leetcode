class Solution:
    def subsets(self, nums: List[int]) -> List[List[int]]:
        res = []
        sub = []

        def backtrack(start: int):
            res.append(sub[:])  # record current subset (copy!)

            for i in range(start, len(nums)):
                sub.append(nums[i])     # choose
                backtrack(i + 1)        # explore
                sub.pop()               # undo

        backtrack(0)
        return res