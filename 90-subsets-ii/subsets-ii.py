class Solution:
    def subsetsWithDup(self, nums: List[int]) -> List[List[int]]:
        nums.sort()
        ans = []
        curr = []

        def bt(start):
            if curr not in ans:
                ans.append(curr[:])

            for i in range(start, len(nums)):
                curr.append(nums[i])
                bt(i + 1)
                curr.pop()

        bt(0)
        return ans