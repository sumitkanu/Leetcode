class Solution:
    def makesquare(self, matchsticks: List[int]) -> bool:
        total = sum(matchsticks)
        if total % 4 != 0:
            return False

        target = total // 4
        matchsticks.sort(reverse=True)

        if matchsticks[0] > target:
            return False

        sides = [0] * 4

        def bt(idx):
            if idx == len(matchsticks):
                return True

            for i in range(4):
                if i > 0 and sides[i] == sides[i - 1]:
                    continue

                if sides[i] + matchsticks[idx] > target:
                    continue

                sides[i] += matchsticks[idx]

                if bt(idx + 1):
                    return True

                sides[i] -= matchsticks[idx]

            return False

        return bt(0)