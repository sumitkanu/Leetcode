class Solution:
    def minSubArrayLen(self, target: int, nums: List[int]) -> int:
        size = len(nums)
        l = 0
        tot = 0
        big = False
        for i, num in enumerate(nums):
            tot += num
            while tot >= target:
                big = True
                size = min(size, i - l + 1)
                tot -= nums[l]
                l += 1
            
        return size if big else 0