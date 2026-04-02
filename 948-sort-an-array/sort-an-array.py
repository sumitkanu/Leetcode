class Solution:
    def sortArray(self, nums: List[int]) -> List[int]:
        return self.sort(nums[:len(nums) // 2], nums[len(nums) // 2:])

    def sort(self, l1, l2):
        if len(l1) == 1 and len(l2) == 1:
            return [min(l1[0],l2[0]), max(l1[0],l2[0])]
        
        if not l1 and not l2:
            return []

        if not l1 or not l2:
            return l2 if l2 else l1

        sorted1 = self.sort(l1[:len(l1) // 2], l1[len(l1) // 2:])
        sorted2 = self.sort(l2[:len(l2) // 2], l2[len(l2) // 2:])

        idx1 = 0
        idx2 = 0
        ans = []
        while idx1 < len(sorted1) and idx2 < len(sorted2):
            if sorted1[idx1] < sorted2[idx2]:
                ans.append(sorted1[idx1])
                idx1 += 1
            else:
                ans.append(sorted2[idx2])
                idx2 += 1

        if idx1 < len(sorted1):
            ans += sorted1[idx1:]
        if idx2 < len(sorted2):
            ans += sorted2[idx2:]

        return ans
