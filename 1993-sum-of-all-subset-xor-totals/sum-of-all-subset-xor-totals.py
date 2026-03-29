class Solution:
    def subsetXORSum(self, nums: List[int]) -> int:
        self.tot = 0

        def bt(idx, xor):
            if idx == len(nums):
                self.tot += xor
                return

            bt(idx + 1, xor)
            
            bt(idx + 1, xor ^ nums[idx])

        bt(0, 0)
        return self.tot
