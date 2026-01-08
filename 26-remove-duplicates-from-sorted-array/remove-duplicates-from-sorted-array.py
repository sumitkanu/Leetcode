class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        end = 0
        i = 0
        while i < len(nums):
            nums[end] = nums[i]
            while i < len(nums) and nums[i] == nums[end]:
                i += 1
            end+=1
        
        return end