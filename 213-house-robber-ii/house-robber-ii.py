class Solution:
    def rob(self, nums: List[int]) -> int:
        if len(nums) == 1:
            return nums[0]

        def rob2(n):
            if len(n) <= 2:
                return max(n[0], n[1]) if len(n) == 2 else n[0]
            
            prev2 = n[0]
            prev1 = max(n[0], n[1])

            for i in range(2, len(n)):
                curr = max(prev2 + n[i], prev1)
                prev2 = prev1
                prev1 = curr
            
            return prev1
        
        return max(rob2(nums[:-1]), rob2(nums[1:]))
        
