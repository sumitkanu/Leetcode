class Solution:
    def permute(self, nums: List[int]) -> List[List[int]]:
        res = []
        curr = []

        def bt(idx):
            if idx == len(nums):
                res.append(curr[:])
                return
            
            for num in nums:
                if num not in curr:
                    curr.append(num)
                    bt(idx + 1)
                    curr.pop()
        
        bt(0)
        return res
