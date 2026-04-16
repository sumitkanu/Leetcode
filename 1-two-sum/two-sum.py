class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        seen = {}

        for i, num in enumerate(nums):
            if target - num not in seen.keys():
                seen[num] = i
            else:
                return [seen[target - num], i]