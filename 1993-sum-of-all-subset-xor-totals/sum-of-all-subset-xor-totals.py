class Solution:
    def subsetXORSum(self, nums: List[int]) -> int:
        self.tot = 0

        def bt(idx, curr, xor):
            if curr:
                xor = xor ^ curr[-1]
                self.tot += xor

            if idx == len(nums):
                return

            for i in range(idx, len(nums)):
                curr.append(nums[i])
                bt(i + 1, curr[:], xor)
                curr.pop()

        bt(0, [], 0)
        return self.tot
