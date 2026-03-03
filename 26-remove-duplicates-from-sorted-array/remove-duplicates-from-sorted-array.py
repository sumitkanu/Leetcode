class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        if not nums:
            return 0

        k = 0
        for i in range(len(nums)):
            if nums[i] == nums[k]:
                continue
            
            temp = nums[i]
            nums[i] = nums[k+1]
            nums[k+1] = temp

            k += 1
        
        return k+1