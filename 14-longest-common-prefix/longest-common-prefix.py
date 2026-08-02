class Solution:
    def longestCommonPrefix(self, strs: List[str]) -> str:
        if strs == None or len(strs) == 0:
            return ""
        
        for i in range(len(strs[0])):
            c = strs[0][i]
            for j in range(len(strs)):
                if i == len(strs[j]) or c != strs[j][i]:
                    return strs[0][:i]
        return strs[0]