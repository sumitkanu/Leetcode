class Solution:
    def subsetsWithDup(self, nums: List[int]) -> List[List[int]]:
        nums.sort()
        ans = []
        curr = []

        def bt(start):
            ans.append(curr[:])

            for i in range(start, len(nums)):
                if i > start and nums[i] == nums[i-1]:
                    continue
                curr.append(nums[i])
                bt(i + 1)
                curr.pop()

        bt(0)
        return ans