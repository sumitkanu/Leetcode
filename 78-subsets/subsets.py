class Solution:
    def subsets(self, nums: List[int]) -> List[List[int]]:
        self.res = []
        self.curr = []

        def bt(idx):
            self.res.append(self.curr[:])

            if idx == len(nums):
                return

            for i in range(idx, len(nums)):
                self.curr.append(nums[i])
                bt(i + 1)
                self.curr.pop()

        bt(0)
        return self.res