class Solution:
    def subsetXORSum(self, nums: List[int]) -> int:
        or_all = 0
        for x in nums:
            or_all |= x
        return or_all * (1 << (len(nums) - 1))
