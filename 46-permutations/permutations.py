class Solution:
    def permute(self, nums: List[int]) -> List[List[int]]:
        ans = []
        used = [False]*len(nums)

        def bt(path, used):
            if len(path) == len(nums):
                ans.append(path[:])
                return

            for i in range(len(nums)):
                if used[i]:
                    continue
                
                used[i] = True
                path.append(nums[i])
                bt(path[:], used[:])
                used[i] = False
                path.pop()
            return

        bt([], used[:])
        return ans
