class Solution:
    def subsets(self, nums: List[int]) -> List[List[int]]:
        tot = []
        sub = []

        def backtrack(pos):
            if pos == len(nums):
                tot.append(sub[:])
                return

            sub.append(nums[pos])
            backtrack(pos + 1)
            sub.pop()
            backtrack(pos + 1)
            return

        backtrack(0)
        return tot
