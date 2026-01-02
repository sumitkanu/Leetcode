class Solution:
    def removeElement(self, nums: List[int], val: int) -> int:
        if len(nums) == 0:
            return 0
        end = len(nums) - 1
        
        while end > -1 and nums[end] == val:
            end -= 1

        i = 0

        while(i <= end):
            num = nums[i]
            if num == val:
                nums[i] = nums[end]
                nums[end] = num
                end -= 1
            else:
                i += 1
        
        return end+1
