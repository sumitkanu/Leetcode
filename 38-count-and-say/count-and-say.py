class Solution:
    def countAndSay(self, n: int) -> str:
        ans = "1"
        for num in range(2, n + 1):
            temp = ""
            curr = ans[0]
            count = 0
            for char in ans:
                if char == curr:
                    count += 1
                else:
                    temp = temp + str(count) + curr
                    curr = char
                    count = 1

            temp = temp + str(count) + curr
            ans = temp

        return ans