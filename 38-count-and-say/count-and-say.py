class Solution:
    def countAndSay(self, n: int) -> str:
        ans = "1"
        for num in range(2, n + 1):
            temp = []
            curr = ans[0]
            count = 0
            for char in ans:
                if char == curr:
                    count += 1
                else:
                    temp.append(str(count))
                    temp.append(curr)
                    curr = char
                    count = 1

            temp.append(str(count))
            temp.append(curr)
            ans = "".join(temp)

        return ans