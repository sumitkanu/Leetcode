class Solution:
    def minEatingSpeed(self, piles: List[int], h: int) -> int:
        def eat_time(x):
            time = 0
            for pile in piles:
                time += ceil(pile / x)

            return True if time <= h else False
        
        end = max(piles)
        start = 1

        while(start <= end):
            mid = (start + end) // 2

            if eat_time(mid):
                end = mid - 1
            else:
                start = mid + 1
        
        return start