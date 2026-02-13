class Solution:
    def combinationSum(self, candidates: List[int], target: int) -> List[List[int]]:
        res = []
        sub = []

        def bt(pos, sum_cur):
            if sum_cur == target:
                res.append(sub[:])

            if sum_cur > target:
                return

            for i in range(pos, len(candidates)):
                sum_cur += candidates[i]
                sub.append(candidates[i])
                bt(i, sum_cur)
                sub.pop()
                sum_cur -= candidates[i]

        bt(0, 0)
        return res
