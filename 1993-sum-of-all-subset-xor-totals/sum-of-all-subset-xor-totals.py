class Solution:
    def subsetXORSum(self, nums: List[int]) -> int:
        self.tot = 0

        def bt(idx, curr):
            xor = 0
            for num in curr:
                xor = xor ^ num

            self.tot += xor

            if idx == len(nums):
                return

            for i in range(idx, len(nums)):
                curr.append(nums[i])
                bt(i + 1, curr[:])
                curr.pop()
            
        bt(0, [])
        return self.tot
