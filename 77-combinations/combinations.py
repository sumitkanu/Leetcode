class Solution:
    def combine(self, n: int, k: int) -> List[List[int]]:
        res = []
        sub = []

        def comb(pos):
            if len(sub) == k:
                res.append(sub[:])

            if len(sub) > k:
                return

            for i in range(pos, n + 1):
                sub.append(i)
                comb(i + 1)
                sub.pop()

        comb(1)
        return res
