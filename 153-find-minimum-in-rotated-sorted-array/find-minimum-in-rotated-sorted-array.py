class Solution:
    def findMin(self, nums: List[int]) -> int:
        start = 0
        end = len(nums) - 1
        print(nums)

        if nums[start] <= nums[end]:
            return nums[start]

        while start < end:
            mid = (start + end) // 2

            if nums[mid] < nums[0]:
                end = mid
            else:
                start = mid + 1

        return nums[start]