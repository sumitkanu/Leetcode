class Solution:
    def checkInclusion(self, s1: str, s2: str) -> bool:
        if len(s1) > len(s2):
            return False

        s1_freq = [0] * 26
        window_freq = [0] * 26

        for char in s1:
            s1_freq[ord(char) - ord('a')] += 1

        for i in range(len(s1)):
            window_freq[ord(s2[i]) - ord('a')] += 1

        matches = 0
        for i in range(26):
            if s1_freq[i] == window_freq[i]:
                matches += 1

        l = 0
        for i in range(len(s1), len(s2)):
            if matches == 26:
                return True
            
            idx = ord(s2[i]) - ord('a')
            window_freq[idx] += 1
            if window_freq[idx] == s1_freq[idx]:
                matches += 1
            elif window_freq[idx] == s1_freq[idx] + 1:
                matches -= 1
            
            idx = ord(s2[l]) - ord('a')
            window_freq[idx] -= 1
            if window_freq[idx] == s1_freq[idx]:
                matches += 1
            elif window_freq[idx] == s1_freq[idx] - 1:
                matches -= 1

            l += 1
        
        return matches == 26
