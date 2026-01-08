class Solution:
    def mergeAlternately(self, word1: str, word2: str) -> str:
        w1 = 0
        w2 = 0
        ans = ""

        while(w1 < len(word1) and w2 < len(word2)):
            if(w1 <= w2):
                ans = ans + word1[w1]
                w1 += 1
            else:
                ans = ans + word2[w2]
                w2 += 1
        
        return ans + word1[w1:] if w1 < len(word1) else ans + word2[w2:]