class Solution:
    def minEatingSpeed(self, piles: List[int], h: int) -> int:
        def isValid(k):
            tot = 0
            for pile in piles:
                tot += ceil(pile/k)
            
            return tot <= h
        
        l, r = 1, max(piles)

        while l <= r:
            mid = (l + r) // 2

            if isValid(mid):
                r = mid - 1
            else:
                l = mid + 1

        return l