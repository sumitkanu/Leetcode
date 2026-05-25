class Solution:
    def findErrorNums(self, nums: List[int]) -> List[int]:
        seen = [0] * len(nums)

        repeat = 0

        for num in nums:
            if seen[num - 1] != 0:
                repeat = num
            else:
                seen[num - 1] = num
        
        ind = seen.index(0)
        return[repeat, ind + 1]
