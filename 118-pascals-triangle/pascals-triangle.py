class Solution:
    def generate(self, numRows: int) -> List[List[int]]:
        ans = [[1],[1,1]]

        if numRows == 1:
            return ans[:1]
        
        for i in range(numRows)[2:]:
            ans.append([0]*(len(ans[i-1])+1))
            ans[i][0] = 1
            ans[i][len(ans[i-1])] = 1
            for j in range(len(ans[i-1]) - 1):
                ans[i][j+1] = ans[i-1][j] + ans[i-1][j+1]
        
        return ans