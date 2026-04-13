class Solution:
    def makesquare(self, matchsticks: List[int]) -> bool:
        matchsticks.sort(reverse = True)
        target = sum(matchsticks)
        if target % 4 != 0:
            return False
        else:
            target = target // 4
        
        buckets = [0] * 4

        def bt(idx):
            if idx == len(matchsticks):
                return True
            ans = False
            for i in range(4):
                if buckets[i] + matchsticks[idx] <= target:
                    buckets[i] += matchsticks[idx]
                    ans = ans or bt(idx + 1)
                    buckets[i] -= matchsticks[idx]
                else:
                    continue

            return ans

        return bt(0)