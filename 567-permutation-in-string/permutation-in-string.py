class Solution:
    def checkInclusion(self, s1: str, s2: str) -> bool:
        if len(s1) > len(s2):
            return False

        s1_freq = [0] * 26
        s2_freq = [0] * 26

        for char in s1:
            s1_freq[ord(char) - ord('a')] += 1

        idx = 0
        while idx < len(s1):
            s2_freq[ord(s2[idx]) - ord('a')] += 1
            idx += 1

        for i in range(len(s1), len(s2)):
            if s1_freq == s2_freq:
                return True
            
            s2_freq[ord(s2[i - len(s1)]) - ord('a')] -= 1
            s2_freq[ord(s2[i]) - ord('a')] += 1
        
        return s1_freq == s2_freq
