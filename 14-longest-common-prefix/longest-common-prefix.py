class Solution:
    def longestCommonPrefix(self, strs: List[str]) -> str:
        pre = strs[0]
        for word in strs:
            i = len(pre)
            while word[:i] != pre[:i]:
                i -= 1
            pre = pre[:i]
        
        return pre